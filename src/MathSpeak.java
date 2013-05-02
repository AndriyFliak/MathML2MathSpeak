import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class MathSpeak {
	private static Stack<String> tagStack;
	private static String mathSpeakText = "";
	private static String mathSpeakBufferText = "";

	private static boolean checkException = false;
	private static boolean isCurrentException = false;
	private static boolean isCurrentFractionException = false;
	private static boolean isCurrentNestedFractionException = false;
	private static boolean isCurrentExponentException = false;
	private static boolean isCurrentRootException = false;

	private static int mfracCount = 0;

	private static String exponentBufferBaseText = "";
	private static Node exponentBufferBase = null;
	private static Node exponentBufferPower = null;

	private static Node fractionBufferNumerator = null;
	private static Node fractionBufferDenominator = null;

	private static Node radicalBufferIndex = null;
	private static Node radicalBufferBase = null;


	protected static void generateMathSpeak(Node inputJax) {
		tagStack = new Stack<String>();
		mathSpeakText = "";
		mathSpeakBufferText = "";
		//Node jax = inputJax.getFirstChild();
		processNode(inputJax);
	}

	protected static String getMathSpeakText() {
		return mathSpeakText;
	}

	private static void processNode(Node node) {
		if (node != null) {
		String type = node.getNodeName();

		mathSpeakBufferText += startElement(type);
		processElement(type, node);

		processExceptions(type, node);

		// if no exception proceed normally
		if (isCurrentException == false) {
			mathSpeakBufferText += endElement();
			mathSpeakText += mathSpeakBufferText;
		} else { //otherwise
			if (isCurrentExponentException) {
				exponentBufferBaseText += mathSpeakBufferText;
			}
			endElement();
		} //needed to end tag and reset isCurrentException

		mathSpeakBufferText = "";
		}
	}

	private static String startElement(String t) {
		tagStack.push(t);
		if (t.equals("mfrac") || t.equals("msup")) { checkException = true; }
		if (t.equals("mfrac")) { mfracCount += 1; }
		if (hasStartHandler(t)) {
			return startHandler(t);
		} else return "";
	}

	private static void processElement(String type, Node node) {
		if (isTokenElement(type)) {
			mathSpeakBufferText += getMathSpeak(type, node);
		} else {
			NodeList children = node.getChildNodes();

			if (type.equals("mfrac")) {
				fractionBufferNumerator = children.item(0).getFirstChild().getFirstChild();
				fractionBufferDenominator = children.item(1).getFirstChild().getFirstChild();
			}
			if (type.equals("msup")) {
				//exponentBufferBase = children[0];
				//exponentBufferPower = children[1];
				exponentBufferBase = children.item(0);
				exponentBufferPower = children.item(1);
			}
			for (int i = 0, l = children.getLength(); i < l; i++) {
				Node child = children.item(i);
				if (i == 0) {previous = null;}
				if (i > 0) {previous = children.item(i-1);}
				if (i == 1 && hasMiddleHandler(type)) {
					mathSpeakBufferText += middleHandler(type);
				}
				//middle2handler is for the overscripts which have odd text formats
				if (i == 2 && hasMiddle2Handler(type)) {
					mathSpeakBufferText += middle2Handler(type);
				}
				processNode(child);
			}
		}
	}

	private static String endElement() {
		String t = tagStack.pop();
		if (t.equals("msup")) { checkException = false; isCurrentException = false; }
		if (t.equals("mfrac")) {
			mfracCount -= 1;
			if (mfracCount == 0) { checkException = false; isCurrentException = false; }
		}
		//reset paren count just in case exceptions left it off balance
		parenCount = 1; //why does it work when 1?
		if (hasEndHandler(t)) {
			return endHandler(t);
		} else return "";
	}

	private static void processExceptions(String type, Node node) {
		if (checkException) {
			if (isFractionException()) {
				isCurrentException = true;
				isCurrentFractionException = true;
			}
			if (isExponentException()) {
				isCurrentException = true;
				isCurrentExponentException = true;
			}
		}

		if (isCurrentException && checkException) {
			if (isCurrentNestedFractionException) {
				isCurrentNestedFractionException = false;
			} else if (isCurrentFractionException) {
				String ptype = node.getParentNode().getParentNode().getNodeName(); //type of element holding fraction
				if (hasMiddleHandler(ptype)) { // it's starting to get ugly. but this keeps to superscript signal
					mathSpeakText += middleHandler(ptype);
				}
				mathSpeakText += MathSpeak_en_us.fractionException(fractionBufferNumerator, fractionBufferDenominator);
				fractionBufferNumerator = null;
				fractionBufferDenominator = null;
				isCurrentFractionException = false;
			} else if (isCurrentRootException) {
				//RootIndex x StartRoot 3
				mathSpeakBufferText = "";
				//System.out.println("root exception");
				mathSpeakBufferText += startHandler(type);
				mathSpeakBufferText += radicalBufferIndex;
				mathSpeakBufferText += middleHandler(type);
				mathSpeakBufferText += radicalBufferBase;
				mathSpeakBufferText += endHandler(type);

				radicalBufferIndex = null;
				radicalBufferBase = null;
				isCurrentRootException = false;
			} else if (isCurrentExponentException) {
				checkException = false;
				Node b = exponentBufferBase;
				Node p = exponentBufferPower;

				String t = mathSpeakBufferText;
				t = t.substring(0, t.lastIndexOf(" ", t.length()-2)) + " ";
				mathSpeakBufferText = t;
				processNode(b);

				mathSpeakText += exponentBufferBaseText;
				mathSpeakText += MathSpeak_en_us.exponentException(p);

				exponentBufferBase = null;
				exponentBufferPower = null;
				exponentBufferBaseText = "";
				isCurrentExponentException = false;
			} else {
				System.out.println("mystery exception; this should never occur.");
			}
			//isCurrentException = false;
			checkException = false;
		}
	}

	private static boolean isFractionException() {
		Node n = fractionBufferNumerator;
		Node d = fractionBufferDenominator;
		if (n == null || d == null)
			return false;
		int d2, n2;
		try {
			d2 = Integer.parseInt(d.getNodeValue());
			n2 = Integer.parseInt(n.getNodeValue());
		} catch(Exception e) { return false; } //one is not an integer
		//if (Math.ceil(n2) != n) { return false; }
		//if (Math.ceil(d2) != d) { return false; }
		if (n2 < 1 || n2 > 9) { return false; }
		if (d2 < 2 || d2 > 99) { return false; }
		//if (n >= d) { return false; }
		return true;
	}

	private static boolean isExponentException() {
		Node b = exponentBufferBase;
		Node p = exponentBufferPower;
		if (b == null || p == null || b.getFirstChild() == null || p.getFirstChild() == null)
			return false;
		if (b.getFirstChild().getFirstChild() == null || p.getFirstChild().getFirstChild() == null) { return false; }
		try {
			if (p.getChildNodes().getLength() > 1) { return false; }
			int p2 = Integer.parseInt(p.getFirstChild().getFirstChild().getNodeValue());
			if (p2 != 2 && p2 != 3) { return false; }
		} catch (Exception e) { return false; } //p is not an integer
		return true;
	}


	private static HashSet<String> tokenElements = new HashSet<String>(Arrays.asList("mi", "mn", "mo", "mtext", "mspace", "ms", "mglyph"));
	private static boolean isTokenElement(String e) {
		return tokenElements.contains(e);
	}

	private static HashSet<String> generalLayoutElements = new HashSet<String>(Arrays.asList("mrow", "mfrac", "msqrt", "mroot", "mfenced", "menclose"));
	private static boolean isGeneralLayoutElement(String e) {
		return generalLayoutElements.contains(e);
	}

	private static HashSet<String> scriptLayoutElements = new HashSet<String>(Arrays.asList("msup", "msub", "msubsup", "munder", "mover", "munderover", "mmultiscripts"));
	private static boolean isScriptLayoutElement(String e) {
		return scriptLayoutElements.contains(e);
	}

	private static HashSet<String> tabularElements = new HashSet<String>(Arrays.asList("msup", "msub", "msubsup", "munder", "mover", "munderover", "mmultiscripts"));
	private static boolean isTabularElement(String e) {
		return tabularElements.contains(e);
	}


	private static Node previous;
	private static boolean inFunction = false;
	private static int parenCount = 0;
	private static boolean inAbsVal = false;
	private static String lang = "";
	private static int verbosity = 0;

	private static boolean hasStartHandler(String t) {
		if (t.equals("mfrac") || t.equals("msqrt") || t.equals("mroot")) { return true; }
		if (t.equals("mover") || t.equals("munder")) { return true; }
		return false;
	}

	private static String startHandler(String e) {
		if (e.equals("mfrac")) return MathSpeak_en_us.startFrac();
		if (e.equals("msqrt")) return MathSpeak_en_us.startSqrt(verbosity);
		if (e.equals("mroot")) return MathSpeak_en_us.startRoot(verbosity);
		if (e.equals("mover")) return MathSpeak_en_us.startOverScript(verbosity);
		if (e.equals("munder")) return MathSpeak_en_us.startUnderScript(verbosity);
		//if (e == "munderover") return MathSpeak_en_us.startUnderOverScript(verbosity);
		return "";
	}

	private static boolean hasMiddleHandler(String t) {
		if (t.equals("mfrac")) { return true; }
		if (t.equals("msub") || t.equals("msup") || t.equals("subsuppair")) { return true; }
		if (t.equals("mroot")) { return true; }
		if (t.equals("munderover")) { return true; }
		return false;
	}

	private static String middleHandler(String e) {
		if (e.equals("mfrac")) return MathSpeak_en_us.midFrac();
		if (e.equals("msup")) return MathSpeak_en_us.midSuperscript(verbosity);
		if (e.equals("msub")) return MathSpeak_en_us.midSubscript(verbosity);
		if (e.equals("mroot")) return MathSpeak_en_us.midRoot(verbosity);
		if (e.equals("munderover")) return MathSpeak_en_us.midUnderOverScript(verbosity);
		return "";
	}

	private static boolean hasMiddle2Handler(String t) {
		if (t.equals("munderover")) { return true; }
		return false;
	}

	private static String middle2Handler(String e) {
		if (e.equals("munderover")) return MathSpeak_en_us.mid2UnderOverScript(verbosity);
		return "";
	}

	private static boolean hasEndHandler(String t) {
		if (t.equals("mfrac") || t.equals("msqrt") || t.equals("mroot")) { return true; }
		if (t.equals("msub") || t.equals("msup")) { return true; }
		if (t.equals("mover") || t.equals("munder") || t.equals("munderover")) { return true; }
		return false;
	}

	private static String endHandler(String e) {
		if (e.equals("mfrac")) return MathSpeak_en_us.endFrac();
		if (e.equals("msqrt") || e.equals("mroot")) return MathSpeak_en_us.endRoot();
		if (e.equals("msub") || e.equals("msup")) return MathSpeak_en_us.endSubscriptSuperscript(verbosity);
		if (e.equals("mover")) return MathSpeak_en_us.endOverScript(verbosity);
		if (e.equals("munder")) return MathSpeak_en_us.endUnderScript(verbosity);
		if (e.equals("munderover")) return MathSpeak_en_us.endOverUnderScript(verbosity);
		return "";
	}

	private static String getMathSpeak(String e, Node d) {
		String item = d.getFirstChild().getNodeValue().replace(" ", "");
		String hex = Integer.toHexString(item.charAt(0)).toUpperCase();

		if(dependsOnPreviousElement(item, hex)) {
			return dependsMathSpeak(item, hex);
		}
		if (e.equals("mn")) { //math number
			return processMathNumber(item);
		} else if (e.equals("mo")) { //operator
			return processMathOperator(hex, item);
		} else if (e.equals("mi")) { //identifier
			return processMathIdentifier(d, item, hex);
		} else if (e.equals("ms")) { //string literal
			return item + " ";
		} else if (e.equals("mtext")) {
			return processMathText(item, hex);
			//return item + " ";
		} else {
			System.out.println(e + " ahhhh!");
			return "";
		}
	}

	private static String processMathNumber(String n) {
		String ms = "";
		if (n.matches("^[-+]?\\d+$")) {
			return numberMathSpeak(n);
		} else if (n.matches("^[-+]?\\d*\\.\\d+$")) {
			return numberMathSpeak(n);
		} else if (n.matches("^[-+]?\\d\\.(?=\\d+)\\w[eE][-+]?\\d+$")) {
			return scientificNotationMathSpeak(n);
		} else if (n.matches("\\w[IVXLCDMivxlcdm]+$")) {
			return romanNumeralMathSpeak(n);
		} else if (n.matches("\\d[0]?(?=\\w[xX]?)\\w[0-9A-Fa-f]\\.?\\w[0-9A-Fa-f]+$")) {
			return hexMathSpeak(n);
			//} else if (isTextNumber(n)) {
			//	System.out.println(n + " is text number");
			//	return MathSpeak_en_us.numberIndicator(config.verbosity) + n + " ";
		} else {
			return genericNumberMathSpeak(n);
		}
	}

	private static String processMathOperator(String hex, String item) {
		if (item.equals("x")) return MathSpeak_en_us.timesText + " ";
		if (MathSpeak_en_us.isArrow(hex)) {
			return MathSpeak_en_us.arrowText(hex, verbosity);
		}
		if (item.equals("(") || item.equals(")")) {
			return MathSpeak_en_us.parenText(item, verbosity);
		}
		if (item.equals("[") || item.equals("]")) {
			return MathSpeak_en_us.bracketText(item, verbosity);
		}
		if (item.equals("{") || item.equals("}")) {
			return MathSpeak_en_us.braceText(item, verbosity);
		}
		if (MathSpeak_en_us.mocodes.containsKey(item)) {
			return MathSpeak_en_us.mocodes.get(item) + " ";
		}
		if (MathSpeak_en_us.mocodes.containsKey(hex)) {
			return MathSpeak_en_us.mocodes.get(hex) + " ";
		}
		return item + " ";
	}

	private static String processMathText(String item, String hex) {
		String charCode = getHexCharCode(item) + item.substring(1);
		if (MathSpeak_en_us.abbreviations.containsKey(item)) {
			return MathSpeak_en_us.abbreviations.get(item) + " ";
		}
		if (MathSpeak_en_us.abbreviations.containsKey(charCode)) {
			return MathSpeak_en_us.abbreviations.get(charCode) + " ";
		}

		return item + " ";
	}

	private static String numberMathSpeak(String n) {
		String ms = "";
		//if - or char code for minus
		String c0 = Character.toString(n.charAt(0));
		if (isMinusSign(c0, getHexCharCode(c0))) {
		//n.charAt(0) == '-' || n.charAt(0).charCodeAt().toString(16).toUpperCase() == "2212") {
			ms += MathSpeak_en_us.negative();
			n = n.substring(1);
		}
		ms += n + " ";
		return ms;
	}

	private static String genericNumberMathSpeak(String n) {
		//String ms = "";
		String ms = MathSpeak_en_us.numberIndicator(verbosity);
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			String chex = Integer.toHexString(c).toUpperCase();
			ms += MathSpeak_en_us.getCharMathSpeak(Character.valueOf(c).toString(), chex, verbosity);
		}
		return ms;
	}

	private static String scientificNotationMathSpeak(String n) {
		return genericNumberMathSpeak(n);
		/*String ms = MathSpeak_en_us.numberIndicator(verbosity);
					var eInd;
					if (n.contains("e")) {
						eInd = n.indexOf("e");
					} else {
						eInd = n.indexOf("E");
					}
					var num = s.substring(0, eInd);
					var exp = s.substring(eInd+1);

					ms += numberMathSpeak(num);
					ms += MathSpeak_en_us.scientificNotation(getNumberMathSpeak(exp));
					return ms;*/
	}

	private static String romanNumeralMathSpeak(String n) {
		String ms = MathSpeak_en_us.numberIndicator(verbosity);
		ms += MathSpeak_en_us.casePrefix(n.length(), isLower(String.valueOf(n.charAt(0))));
		for (int i = 0; i < n.length(); i++) {
			ms += n.charAt(i) + " ";
		}
		return ms;
	}

	private static String hexMathSpeak(String n) {
		String ms = MathSpeak_en_us.numberIndicator(verbosity);
		for (int i = 0; i < n.length(); i++) {
			ms += n.charAt(i) + " ";
		}
		return ms;
	}

	private static String processMathIdentifier(Node d, String item, String hex) {
		//System.out.println(d);
		//System.out.println(item);
		//maybe I should do item.toLowerCase() to ensure consistency
		String ms = "";
		if (item.equals("")) {return "";}
//		if (d.mathvariant) {
//			String v = d.mathvariant;
//			if (v.equals("script") || v.equals("bold") || v.equals("italic") || "double-struck" || "bold-fraktur" || "script" || "bold-script" || "fraktur" || "sans-serif" || "bold-sans-serif" || "sans-serif-italic" || "sans-serif-bold-italic" || "monospace") {
//				ms += v + " ";
//			}
//		}
		if (isUpper(item)) {
			ms += MathSpeak_en_us.uppercaseCharText + " ";
		}
		if (MathSpeak_en_us.trig.containsKey(item)) {
			return ms + MathSpeak_en_us.trig.get(item) + " ";
		}
		if (MathSpeak_en_us.greek.containsKey(hex)) {
			return ms + MathSpeak_en_us.greek.get(hex) + " ";
		}
		if (MathSpeak_en_us.mocodes.containsKey(hex)) {
			return ms + MathSpeak_en_us.mocodes.get(hex) + " ";
		}
		if (MathSpeak_en_us.mocodes.containsKey(item)) {
			return ms + MathSpeak_en_us.mocodes.get(item) + " ";
		}
		return ms + item + " ";
	}

	private static boolean dependsOnPreviousElement(String item, String hex) {
		//System.out.println("depends hex: " + hex);
		//if a -, if something before say 'minus' else say 'negative'
		if (isMinusSign(item, hex)) { return true; }
		//if f...() need to say f of (...)
		if (isParen(item, hex)) { return true; }
		if (item.equals("|")) { return true; } //abs val
		return false;
	}

	private static String dependsMathSpeak(String item, String hex) {
		//System.out.println("depends previous: " + previous);
		if (isMinusSign(item, hex)) {//hex == "2212" || item == "-") {  // if minus
			if (previous == null) {
				return MathSpeak_en_us.negative();
			}
			String previtem = previous.getFirstChild().getNodeValue();
			String prevhex = getHexCharCode(previtem); //previtem.charCodeAt().toString(16).toUpperCase();
			if (isMinusSign(previtem, prevhex)) { //previtem == "-" || prevhex == "2122") {
				return MathSpeak_en_us.negative();
			}
			return MathSpeak_en_us.minus();
			//if previous is empty return negative, else return minus
		}
		if (item.equals("(")) {
			if (previous != null) {
				//System.out.println("previous: " + previous);

				String previtem = previous.getFirstChild().getNodeValue();
				String prevhex = getHexCharCode(previtem); //previtem.charCodeAt().toString(16).toUpperCase();
				if (isFunctionPrefix(previtem)) { //previtem == "f" || previtem == "g" || trig[previtem]) {
					//System.out.println("function prefix");
					inFunction = true;
					parenCount = parenCount + 1;
					return MathSpeak_en_us.functionOf();
				} else {
					parenCount = parenCount + 1;
				}
			}
			return processMathOperator(item, hex);
			//if previous is f, g, or trig func return of and set var inside func = true, set paren count == 1
			//if previous is not one of those, increment paren count and return "OpenParen";
		}
		if (item.equals(")")) {
			parenCount = parenCount - 1;
			if (parenCount == 0) {
				//System.out.println("paren count == 0");
				inFunction = false;
				return "";
			}
			return processMathOperator(item, hex); // RightParen
			//decrement parent count, if paren count == 0, set inside func = false, return "" end of function
		}
		if (item.equals("|")) { //abs val
			if (!inAbsVal) {
				inAbsVal = true;
				return MathSpeak_en_us.absValText("start", verbosity);
			} else {
				inAbsVal = false;
				return MathSpeak_en_us.absValText("end", verbosity);
			}
		}
		return "";
	}

	private static boolean isLower(String c) {
		int code = c.charAt(0);
		if(code > 96 && code < 123) {
			return true;
		}
		return false;
	}

	private static boolean isUpper(String c) {
		int code = c.charAt(0);
		if (code < 91 && code > 64) {
			return true;
		}
		return false;
	}

	private static String getHexCharCode(String c) {
		return Integer.toHexString(c.charAt(0)).toUpperCase();
	}

	private static boolean isMinusSign(String item, String hex) {
		if (item.equals("-") || hex.equals("2122")) { return true; }
		return false;
	}

	private static boolean isFunctionPrefix(String item) {
		if (item.equals("f") || item.equals("g") || MathSpeak_en_us.trig.containsKey(item)) { return true; }
		return false;
	}

	private static boolean isParen(String item, String hex) {
		if (item.equals("(") || item.equals(")")) { return true; }
		return false;
	}
}
