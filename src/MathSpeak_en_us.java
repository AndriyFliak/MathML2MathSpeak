import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MathSpeak_en_us {
	final static String startFractionText = "StartFraction";
	final static String midFractionText = "Over";
	final static String endFractionText = "EndFraction";

	final static String startFractionPrefixText = "Start";
	final static String midFractionPrefixText = "Over";
	final static String endFractionPrefixText = "End";

	final static String fractionVerboseText = "Fraction";
	final static String fractionBriefText = "Frac";
	final static String fractionSuperBriefText = "Frac";

	final static String startRootText = "StartRoot";
	final static String startRootSuperBriefText = "Root";
	final static String rootIndexText = "RootIndex";
	final static String rootIndexSuperBriefText = "Index";
	final static String endRootText = "EndRoot";

	final static String startOverScriptVerboseText = "Overscript";
	final static String endOverScriptText = "EndScripts";

	final static String startUnderScriptVerboseText = "Underscript";
	final static String endUnderScriptText = "EndScripts";

	final static String endScriptsText = "EndScripts";

	final static String startModVerboseText = "ModifyingAbove";
	final static String startModBriefText = "ModAbove";
	final static String endModText = "with ";

	final static String midSubscriptVerboseText = "Subscript";
	final static String midSubscriptBriefText = "Sub";

	final static String midSuperscriptVerboseText = "Superscript";
	final static String midSuperscriptBriefText = "Sup";

	final static String endSubscriptSuperscriptVerboseText = "Baseline";
	final static String endSubscriptSuperscriptBriefText = "Base";

	final static String squaredText = "Squared";
	final static String cubedText = "Cubed";

	final static String negativeText = "Negative";
	final static String minusText = "Minus";

	final static String numberVerboseText = "Number";
	final static String numberBriefText = "Num";

	final static String numberSignVerboseText = "Number-sign";
	final static String numberSignBriefText = "num-sign";

	final static String lowercaseCharText = "Lower";
	final static String uppercaseCharText = "Upper";
	final static String lowercaseWordText = "LowerWord";
	final static String uppercaseWordText = "UpperWord";

	final static String leftParenVerboseText = "left-parenthesis";
	final static String leftParenBriefText = "left-p'ren";
	final static String leftParenSuperBriefText = "L p'ren";
	final static String rightParenVerboseText = "right-parenthesis";
	final static String rightParenBriefText = "right-p'ren";
	final static String rightParenSuperBriefText = "R p'ren";

	final static String ellipsesText = "Ellipses";

	final static String functionOfText = "of";

	final static String timesText = "Times";

	final static String leftArrowVerboseText = "LeftArrow";
	final static String leftArrowBriefText = "L arrow";
	final static String rightArrowVerboseText = "RightArrow";
	final static String rightArrowBriefText = "R arrow";

	final static String leftBracketVerboseText = "left-bracket";
	final static String leftBracketBriefText = "left-brack";
	final static String leftBracketSuperBriefText = "L brack";
	final static String rightBracketVerboseText = "right-bracket";
	final static String rightBracketBriefText = "right-brack";
	final static String rightBracketSuperBriefText = "R brack";

	//braces are sets
	final static String leftBraceVerboseText = "StartSet";
	final static String leftBraceBriefText = "Set";
	final static String rightBraceVerboseText = "EndSet";
	final static String rightBraceBriefText = "EndSet";

	final static String absValStartVerboseText = "StartAbsoluteValue";
	final static String absValStartBriefText = "AbsolueValue";
	final static String absValEndVerboseText = "EndAbsoluteValue";
	final static String absValEndBriefText = "EndAbsoluteValue";

	protected static String startFrac() {
		return startFractionText + " ";
	}

	protected static String startSqrt(int v) {
		if (v == 2) { //superbrief
			return startRootSuperBriefText + " ";
		}
		return startRootText + " ";
	}

	protected static String startRoot(int v) {
		if (v == 2) {
			return rootIndexSuperBriefText + " ";
		}
		return rootIndexText + " ";
	}

	protected static String startOverScript(int v) {
		//if (v == 0) { //verbose
		return startOverScriptVerboseText + " ";
		//}
	}

	protected static String startUnderScript(int v) {
		return startUnderScriptVerboseText + " ";
	}

	protected static String midFrac() {
		return midFractionText + " ";
	}

	protected static String midRoot(int v) {
		if (v == 2) { //superbrief
			return startRootSuperBriefText + " ";
		}
		return startRootText + " ";
	}

	protected static String midSuperscript(int v) {
		if (v == 0) {
			return midSuperscriptVerboseText + " ";
		}
		return midSuperscriptBriefText + " ";
	}

	protected static String midSubscript(int v) {
		if (v == 0) {
			return midSubscriptVerboseText + " ";
		}
		return midSubscriptBriefText + " ";
	}

	protected static String midUnderOverScript(int v) {
		return startUnderScriptVerboseText + " ";
	}

	protected static String mid2UnderOverScript(int v) {
		return startOverScriptVerboseText + " ";
	}

	protected static String endFrac() {
		return endFractionText + " ";
	}

	protected static String endRoot() {
		return endRootText + " ";
	}

	protected static String endSubscriptSuperscript(int v) {
		if (v == 0) { //verbose
			return endSubscriptSuperscriptVerboseText + " ";
		}
		return endSubscriptSuperscriptBriefText + " ";
	}

	protected static String endOverScript(int v) {
		return endOverScriptText + " ";
	}

	protected static String endUnderScript(int v) {
		return endUnderScriptText + " ";
	}

	protected static String endOverUnderScript(int v) {
		return endScriptsText + " ";
	}

	protected static String negative() {
		return negativeText + " ";
	}

	protected static String minus() {
		return minusText + " ";
	}

	protected static String lowercase() {
		return lowercaseCharText + " ";
	}

	protected static String uppercase() {
		return uppercaseCharText + " ";
	}

	protected static String functionOf() {
		return functionOfText + " ";
	}

	protected static String numberIndicator(int v) {
		if (v == 0) { //verbosity is set to verbose
			return numberVerboseText + " ";
		}
		return numberBriefText + " ";
	}

	protected static String numberSign(int v) {
		if (v == 0) {
			return numberSignVerboseText + " ";
		}
		return numberSignBriefText + " ";
	}

	protected static String parenText(String item, int v) {
		if (item.equals("(")) {
			if (v == 0) { //verbose
				return leftParenVerboseText + " ";
			} else if (v == 1) { //brief
				return leftParenBriefText + " ";
			} else { //superbrief
				return leftParenSuperBriefText + " ";
			}
		} else {
			if (v == 0) {
				return rightParenVerboseText + " ";
			} else if (v == 1) {
				return rightParenBriefText + " ";
			} else {
				return rightParenSuperBriefText + " ";
			}
		}
	}

	protected static String getCharMathSpeak(String c, String chex, int v) {
		if (mocodes.containsKey(c)) {
			return mocodes.get(c) + " ";
		} else if (mocodes.containsKey(chex)) {
			return mocodes.get(chex) + " ";
		} else if (c.equals("#")) {
			return numberSign(v);
		} else {
			return c + " ";
		}
	}

	protected static String casePrefix(int len, boolean isLower) {
		if (len > 1) { //use word prefix
			if (isLower) {
				return lowercaseWordText + " ";
			} else {
				return uppercaseWordText + " ";
			}
		} else {
			if (isLower) {
				return lowercaseCharText + " ";
			} else {
				return uppercaseCharText + " ";
			}
		}
	}

	protected static String arrowText(String hex, int v) {
		if (hex.equals("2190")) {
			if (v == 0 || v == 1) { //verbose
				return leftArrowVerboseText + " ";
			} else {
				return leftArrowBriefText + " ";
			}
		} //left
		if (hex.equals("2192")) {
			if (v == 0 || v == 1) { //verbose
				return rightArrowVerboseText + " ";
			} else {
				return rightArrowBriefText + " ";
			}
		} //right
		return "";
	}

	protected static boolean isArrow(String hex) {
		if (hex.equals("2190") || hex.equals("2192")) {
			return true;
		}
		return false;
	}

	protected static String bracketText(String item, int v) {
		if (item.equals("[")) {
			if (v == 0) { //verbose
				return leftBracketVerboseText + " ";
			} else if (v == 1) { //brief
				return leftBracketBriefText + " ";
			} else { //superbrief
				return leftBracketSuperBriefText + " ";
			}
		} else {
			if (v == 0) {
				return rightBracketVerboseText + " ";
			} else if (v == 1) {
				return rightBracketBriefText + " ";
			} else {
				return rightBracketSuperBriefText + " ";
			}
		}
	}

	protected static String braceText(String item, int v) {
		if (item.equals("{")) {
			if (v == 0 || v == 1) { //verbose
				return leftBraceVerboseText + " ";
			} else { //superbrief
				return leftBraceBriefText + " ";
			}
		} else {
			if (v == 0 || v == 1) {
				return rightBraceVerboseText + " ";
			} else {
				return rightBraceBriefText + " ";
			}
		}
	}

	protected static String absValText(String k, int v) {
		if (k.equals("start")) {
			if (v == 0 || v == 1) {
				return absValStartVerboseText + " ";
			} else {
				return absValStartBriefText + " ";
			}
		} else if (k.equals("end")) {
			if (v == 0 || v == 1) {
				return absValEndVerboseText + " ";
			} else {
				return absValEndBriefText + " ";
			}
		} else {
			return "abs val error";
		}
	}

	protected static String exponentException(Node power) {
		int p = Integer.parseInt(power.getFirstChild().getFirstChild().getNodeValue());
		if (p == 2) {
			return squaredText + " ";
		} else if (p == 3) {
			return cubedText + " ";
		}
		return "";
	}

	protected static String fractionException(Node fractionBufferNumerator, Node fractionBufferDenominator) {
		int n = Integer.parseInt(fractionBufferNumerator.getNodeValue());
		int d = Integer.parseInt(fractionBufferDenominator.getNodeValue());
		String ms = fractionNumerators.get(n-1) + " ";
		if (n == 1) {
			ms += fractionDenominators.get(d-1).get(0) + " ";
		} else {
			ms += fractionDenominators.get(d-1).get(1) + " ";
		}
		return ms;
	}

	protected static ArrayList<String> fractionNumerators;
	static {
		fractionNumerators = new ArrayList<String>(Arrays.asList(
			"one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten",

			"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "nineteen", "twenty",

			"twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five",
			"twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",

			"thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five",
			"thirty-six", "thirty-seven", "thirty-eight", "thirty-nine", "forty",

			"forty-one", "forty-two", "forty-three", "forty-four", "forty-five",
			"forty-six", "forty-seven", "forty-eight", "forty-nine", "fifty",

			"fifty-one", "fifty-two", "fifty-three", "fifty-four", "fifty-five",
			"fifty-six", "fifty-seven", "fifty-eight", "fifty-nine", "sixty",

			"sixty-one", "sixty-two", "sixty-three", "sixty-four", "sixty-five",
			"sixty-six", "sixty-seven", "sixty-eight", "sixty-nine", "seventy",

			"seventy-one", "seventy-two", "seventy-three", "seventy-four", "seventy-five",
			"seventy-six", "seventy-seven", "seventy-eight", "seventy-nine", "eighty",

			"eighty-one", "eighty-two", "eighty-three", "eighty-four", "eighty-five",
			"eighty-six", "eighty-seven", "eighty-eight", "eighty-nine", "ninety",

			"ninety-one", "ninety-two", "ninety-three", "ninety-four", "ninety-five",
			"ninety-six", "ninety-seven", "ninety-eight", "ninety-nine"));
	}

	protected static ArrayList<ArrayList<String>> fractionDenominators;
	static {
		fractionDenominators = new ArrayList<ArrayList<String>>();
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("one","")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("half","halves")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("third","thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fourth","fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifth","fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixth","sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventh","sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighths","eighths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninth","ninths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("tenth","tenths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eleventh","elevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twelfth","twelves")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirteenth","thirteenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fourteenth","fourteenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifteenth","fifteenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixteenth","sixteenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventeenth","seventeenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighteenth","eighteenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("nineteenth","nineteenths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twentieth","twentieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-first", "twenty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-second", "twenty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-third", "twenty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-fourth", "twenty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-fifth", "twenty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-sixth", "twenty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-seventh", "twenty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-eigth", "twenty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("twenty-ninth", "twenty-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirtieth", "thirtieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-first", "thirty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-second", "thirty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-third", "thirty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-fouth", "thirty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-fifth", "thirty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-sixth", "thirty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-seventh", "thirty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-eight", "thirty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("thirty-ninth", "thirty-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fortieth", "fortieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-first", "forty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-second", "forty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-third", "forty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-fouth", "forty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-fifth", "forty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-sixth", "forty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-seventh", "forty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-eight", "forty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("forty-ninth", "forty-ninths")));


		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fiftieth", "fiftieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-first", "fifty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-second", "fifty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-third", "fifty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-fouth", "fifty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-fifth", "fifty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-sixth", "fifty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-seventh", "fifty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-eight", "fifty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("fifty-ninth", "fifty-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixtieth", "sixtieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-first", "sixty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-second", "sixty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-third", "sixty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-fouth", "sixty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-fifth", "sixty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-sixth", "sixty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-seventh", "sixty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-eight", "sixty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("sixty-ninth", "sixty-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventieth", "seventieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-first", "seventy-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-second", "seventy-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-third", "seventy-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-fouth", "seventy-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-fifth", "seventy-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-sixth", "seventy-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-seventh", "seventy-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-eight", "seventy-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("seventy-ninth", "seventy-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eightieth", "eightieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-first", "eighty-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-second", "eighty-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-third", "eighty-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-fouth", "eighty-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-fifth", "eighty-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-sixth", "eighty-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-seventh", "eighty-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-eight", "eighty-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("eighty-ninth", "eighty-ninths")));

		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninetieth", "ninetieths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-first", "ninety-firsts")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-second", "ninety-seconds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-third", "ninety-thirds")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-fouth", "ninety-fourths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-fifth", "ninety-fifths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-sixth", "ninety-sixths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-seventh", "ninety-sevenths")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-eight", "ninety-eights")));
		fractionDenominators.add(new ArrayList<String>(Arrays.asList("ninety-ninth", "ninety-ninths")));
	}

	protected static HashMap<String, String> trig;
	static {
		trig = new HashMap<String, String>();
		trig.put("sin", "sign");
		trig.put("cos", "cosign");
		trig.put("tan", "tangent");
		trig.put("csc", "cosecant");
		trig.put("sec", "secant");
		trig.put("cot", "cotangent");
		trig.put("arcsin", "arc sign");
		trig.put("arccos", "arc cosign");
		trig.put("arctan", "arc tangent");
		trig.put("arccsc", "arc cosecant");
		trig.put("arcsec", "arc secant");
		trig.put("arccot", "arc cotangent");
	}

	protected static HashMap<String, String> greek;
	static {
		greek = new HashMap<String, String>();
		greek.put("370", "Upper Heta");
		greek.put("371", "Heta");
		greek.put("372", "Upper Archaic Sampi");
		greek.put("373", "Archaic Sampi");
		greek.put("374", "Numeral Sign");
		greek.put("375", "Lower Numeral Sign");
		greek.put("376", "Upper Pamphylian Digamma");
		greek.put("377", "Pamphylian Digamma");
		greek.put("37A", "Ypogegrammeni");
		greek.put("37B", "Reversed Lunate Sigma");
		greek.put("37C", "Dotted Lunate Sigma");
		greek.put("37D", "Reversed Dotted Lunate Sigma");
		greek.put("37E", "Question Mark");
		greek.put("384", "Tonos");
		greek.put("385", "Dialytika Tonos");
		greek.put("386", "Upper Alpha Tonos");
		greek.put("387", "Ano Teleia");
		greek.put("388", "Upper Epsilon Tonos");
		greek.put("389", "Upper Eta Tonos");
		greek.put("38A", "Upper Iota Tonos");
		greek.put("38C", "Upper Omicron Tonos");
		greek.put("38E", "Upper Upsilon Tonos");
		greek.put("38F", "Upper Omega Tonos");
		greek.put("390", "Iota Dialytika And Tonos");
		greek.put("391", "Upper Alpha");
		greek.put("392", "Upper Beta");
		greek.put("393", "Upper Gamma");
		greek.put("394", "Upper Delta");
		greek.put("395", "Upper Epsilon");
		greek.put("396", "Upper Zeta");
		greek.put("397", "Upper Eta");
		greek.put("398", "Upper Theta");
		greek.put("399", "Upper Iota");
		greek.put("39A", "Upper Kappa");
		greek.put("39B", "Upper Lamda");
		greek.put("39C", "Upper Mu");
		greek.put("39D", "Upper Nu");
		greek.put("39E", "Upper Xi");
		greek.put("39F", "Upper Omicron");
		greek.put("3A0", "Upper Pi");
		greek.put("3A1", "Upper Rho");
		greek.put("3A3", "Upper Sigma");
		greek.put("3A4", "Upper Tau");
		greek.put("3A5", "Upper Upsilon");
		greek.put("3A6", "Upper Phi");
		greek.put("3A7", "Upper Chi");
		greek.put("3A8", "Upper Psi");
		greek.put("3A9", "Upper Omega");
		greek.put("3AA", "Upper Iota Dialytika");
		greek.put("3AB", "Upper Upsilon Dialytika");
		greek.put("3AC", "Alpha Tonos");
		greek.put("3AD", "Epsilon Tonos");
		greek.put("3AE", "Eta Tonos");
		greek.put("3AF", "Iota Tonos");
		greek.put("3B0", "Upsilon Dialytika And Tonos");
		greek.put("3B1", "Alpha");
		greek.put("3B2", "Beta");
		greek.put("3B3", "Gamma");
		greek.put("3B4", "Delta");
		greek.put("3B5", "Epsilon");
		greek.put("3B6", "Zeta");
		greek.put("3B7", "Eta");
		greek.put("3B8", "Theta");
		greek.put("3B9", "Iota");
		greek.put("3BA", "Kappa");
		greek.put("3BB", "Lamda");
		greek.put("3BC", "Mu");
		greek.put("3BD", "Nu");
		greek.put("3BE", "Xi");
		greek.put("3BF", "Omicron");
		greek.put("3C0", "Pi");
		greek.put("3C1", "Rho");
		greek.put("3C2", "Final Sigma");
		greek.put("3C3", "Sigma");
		greek.put("3C4", "Tau");
		greek.put("3C5", "Upsilon");
		greek.put("3C6", "Phi");
		greek.put("3C7", "Chi");
		greek.put("3C8", "Psi");
		greek.put("3C9", "Omega");
		greek.put("3CA", "Iota Dialytika");
		greek.put("3CB", "Upsilon Dialytika");
		greek.put("3CC", "Omicron Tonos");
		greek.put("3CD", "Upsilon Tonos");
		greek.put("3CE", "Omega Tonos");
		greek.put("3CF", "Upper Kai");
		greek.put("3D0", "Beta");
		greek.put("3D1", "Theta");
		greek.put("3D2", "Upsilon Hook");
		greek.put("3D3", "Upsilon Acute And Hook");
		greek.put("3D4", "Upsilon Diaeresis And Hook");
		greek.put("3D5", "Phi");
		greek.put("3D6", "Pi");
		greek.put("3D7", "Kai");
		greek.put("3D8", "Archaic Koppa");
		greek.put("3D9", "Archaic Koppa");
		greek.put("3DA", "Stigma");
		greek.put("3DB", "Stigma");
		greek.put("3DC", "Digamma");
		greek.put("3DD", "Digamma");
		greek.put("3DE", "Koppa");
		greek.put("3DF", "Koppa");
		greek.put("3E0", "Sampi");
		greek.put("3E1", "Sampi");
		greek.put("3E2", "Coptic Upper Shei");
		greek.put("3E3", "Coptic  Shei");
		greek.put("3E4", "Coptic Upper Fei");
		greek.put("3E5", "Coptic  Fei");
		greek.put("3E6", "Coptic Upper Khei");
		greek.put("3E7", "Coptic  Khei");
		greek.put("3E8", "Coptic Upper Hori");
		greek.put("3E9", "Coptic  Hori");
		greek.put("3EA", "Coptic Upper Gangia");
		greek.put("3EB", "Coptic  Gangia");
		greek.put("3EC", "Coptic Upper Shima");
		greek.put("3ED", "Coptic  Shima");
		greek.put("3EE", "Coptic Upper Dei");
		greek.put("3EF", "Coptic  Dei");
		greek.put("3F0", "Kappa");
		greek.put("3F1", "Rho");
		greek.put("3F2", "Lunate Sigma");
		greek.put("3F3", "Yot");
		greek.put("3F4", "Upper Theta");
		greek.put("3F5", "Lunate Epsilon");
		greek.put("3F6", "Reversed Lunate Epsilon");
		greek.put("3F7", "Upper Sho");
		greek.put("3F8", "Sho");
		greek.put("3F9", "Upper Lunate Sigma");
		greek.put("3FA", "Upper San");
		greek.put("3FB", "San");
		greek.put("3FC", "Rho Stroke");
		greek.put("3FD", "Upper Reversed Lunate Sigma");
		greek.put("3FE", "Upper Dotted Lunate Sigma");
		greek.put("3FF", "Upper Reversed Dotted Lunate Sigma");
	}


	protected static HashMap<String, String> abbreviations;
	static {
		abbreviations = new HashMap<String, String>();
		//unit abbreviations
		//time universal
		abbreviations.put("s", "second");
		abbreviations.put("min", "minute");
		abbreviations.put("hr", "hour");
		//area metric
		abbreviations.put("ha", "hectares");
		//area imperial
		abbreviations.put("ac", "acres");
		//length metric
		abbreviations.put("B5m", "micrometer");
		abbreviations.put("mm", "millimeter");
		abbreviations.put("cm", "centimeter");
		abbreviations.put("dm", "decimeter");
		abbreviations.put("m", "meter");
		abbreviations.put("km", "kilometer");
		//length imperial
		abbreviations.put("in", "inch");
		abbreviations.put("ft", "foot");
		abbreviations.put("yd", "yard");
		abbreviations.put("mi", "mile");
		//volume metric
		abbreviations.put("B5l", "microliter");
		abbreviations.put("ml", "milliliter");
		abbreviations.put("cl", "centiliter");
		abbreviations.put("dl", "deciliter");
		abbreviations.put("l", "liter");
		abbreviations.put("dal", "dekaliter");
		abbreviations.put("hl", "hectoliter");
		abbreviations.put("kl", "kiloliter");
		//volume imperial
		abbreviations.put("gal", "gallon");
		//mass metric
		abbreviations.put("kg", "kilogram");
		abbreviations.put("hg", "hectogram");
		abbreviations.put("dag", "dekagram");
		abbreviations.put("g", "gram");
		abbreviations.put("dg", "decigram");
		abbreviations.put("cg", "centigram");
		abbreviations.put("mg", "milligram");
		abbreviations.put("B5g", "microgram");
		//mass imperial
		abbreviations.put("lb", "pound");
		abbreviations.put("oz", "ounce");
		//other
		abbreviations.put("J", "Joule");
	}


	protected static HashMap<String, String> mocodes;
	static {
		mocodes = new HashMap<String, String>();
		mocodes.put("221E", "infinity");
		mocodes.put("2018", "left single quotation mark");
		mocodes.put("2019", "right single quotation mark");
		mocodes.put("201C", "left double quotation mark");
		mocodes.put("201D", "right double quotation mark");
		mocodes.put("(", "left parenthesis");
		mocodes.put(")", "right parenthesis");
		mocodes.put("[", "left square bracket");
		mocodes.put("]", "right square bracket");
		mocodes.put("{", "left curly bracket");
		mocodes.put("|", "vertical line");
		mocodes.put("||", "multiple character operator: ||");
		mocodes.put("|||", "multiple character operator: |||");
		mocodes.put("}", "right curly bracket");
		mocodes.put("2016", "double vertical line");
		mocodes.put("2308", "left ceiling");
		mocodes.put("2309", "right ceiling");
		mocodes.put("230A", "left floor");
		mocodes.put("230B", "right floor");
		mocodes.put("2772", "light left tortoise shell bracket ornament");
		mocodes.put("2773", "light right tortoise shell bracket ornament");
		mocodes.put("27E6", "mathematical left white square bracket");
		mocodes.put("27E7", "mathematical right white square bracket");
		mocodes.put("27E8", "mathematical left angle bracket");
		mocodes.put("27E9", "mathematical right angle bracket");
		mocodes.put("27EA", "mathematical left double angle bracket");
		mocodes.put("27EB", "mathematical right double angle bracket");
		mocodes.put("27EC", "mathematical left white tortoise shell bracket");
		mocodes.put("27ED", "mathematical right white tortoise shell bracket");
		mocodes.put("27EE", "mathematical left flattened parenthesis");
		mocodes.put("27EF", "mathematical right flattened parenthesis");
		mocodes.put("2980", "triple vertical bar delimiter");
		mocodes.put("2980", "triple vertical bar delimiter");
		mocodes.put("2983", "left white curly bracket");
		mocodes.put("2984", "right white curly bracket");
		mocodes.put("2985", "left white parenthesis");
		mocodes.put("2986", "right white parenthesis");
		mocodes.put("2987", "z notation left image bracket");
		mocodes.put("2988", "z notation right image bracket");
		mocodes.put("2989", "z notation left binding bracket");
		mocodes.put("298A", "z notation right binding bracket");
		mocodes.put("298B", "left square bracket with underbar");
		mocodes.put("298C", "right square bracket with underbar");
		mocodes.put("298D", "left square bracket with tick in top corner");
		mocodes.put("298E", "right square bracket with tick in bottom corner");
		mocodes.put("298F", "left square bracket with tick in bottom corner");
		mocodes.put("2990", "right square bracket with tick in top corner");
		mocodes.put("2991", "left angle bracket with dot");
		mocodes.put("2992", "right angle bracket with dot");
		mocodes.put("2993", "left arc less-than bracket");
		mocodes.put("2994", "right arc greater-than bracket");
		mocodes.put("2995", "double left arc greater-than bracket");
		mocodes.put("2996", "double right arc less-than bracket");
		mocodes.put("2997", "left black tortoise shell bracket");
		mocodes.put("2998", "right black tortoise shell bracket");
		mocodes.put("29FC", "left-pointing curved angle bracket");
		mocodes.put("29FD", "right-pointing curved angle bracket");
		mocodes.put(";", "semicolon");
		mocodes.put(",", "comma");
		mocodes.put("2063", "invisible separator");
		mocodes.put("2234", "therefore");
		mocodes.put("2235", "because");
		mocodes.put("->", "multiple character operator: ->");
		mocodes.put("", "multiple character operator: ..");
		mocodes.put("...", "Ellipses");
		mocodes.put(":", "colon");
		mocodes.put("3F6", "greek reversed lunate epsilon symbol");
		mocodes.put("2026", "horizontal ellipsis");
		mocodes.put("22EE", "vertical ellipsis");
		mocodes.put("22EF", "midline horizontal ellipsis");
		mocodes.put("22F1", "down right diagonal ellipsis");
		mocodes.put("220B", "contains as member");
		mocodes.put("22A2", "right tack");
		mocodes.put("22A3", "left tack");
		mocodes.put("22A4", "down tack");
		mocodes.put("22A8", "true");
		mocodes.put("22A9", "forces");
		mocodes.put("22AC", "does not prove");
		mocodes.put("22AD", "not true");
		mocodes.put("22AE", "does not force");
		mocodes.put("22AF", "negated double vertical bar double right turnstile");
		mocodes.put("2228", "logical or");
		mocodes.put("&amp;&amp", "multiple character operator: &&");
		mocodes.put("2227", "logical and");
		mocodes.put("2200", "for all");
		mocodes.put("2203", "there exists");
		mocodes.put("2204", "there does not exist");
		mocodes.put("2201", "complement");
		mocodes.put("2208", "element of");
		mocodes.put("2209", "not an element of");
		mocodes.put("220C", "does not contain as member");
		mocodes.put("2282", "subset of");
		mocodes.put("2282;&#x20D2", "subset of with vertical line");
		mocodes.put("2283", "superset of");
		mocodes.put("2283;&#x20D2", "superset of with vertical line");
		mocodes.put("2284", "not a subset of");
		mocodes.put("2285", "not a superset of");
		mocodes.put("2286", "subset of or equal to");
		mocodes.put("2287", "superset of or equal to");
		mocodes.put("2288", "neither a subset of nor equal to");
		mocodes.put("2289", "neither a superset of nor equal to");
		mocodes.put("228A", "subset of with not equal to");
		mocodes.put("228B", "superset of with not equal to");
		mocodes.put("&lt;=", "multiple character operator: <=");
		mocodes.put("2264", "less-than or equal to");
		mocodes.put("2265", "greater-than or equal to");
		mocodes.put(">", "greater-than sign");
		mocodes.put(">=", "multiple character operator: >=");
		mocodes.put("226F", "not greater-than");
		mocodes.put("&lt", "less-than sign");
		mocodes.put("226E", "not less-than");
		mocodes.put("2248", "almost-equals");
		mocodes.put("223C", "tilde operator");
		mocodes.put("2249", "not almost equal to");
		mocodes.put("2262", "not identical to");
		mocodes.put("2260", "Not Equal To");
		mocodes.put("!=", "multiple character operator: !=");
		mocodes.put("*=", "multiple character operator: *=");
		mocodes.put("+=", "multiple character operator: +=");
		mocodes.put("-=", "multiple character operator: -=");
		mocodes.put("/=", "multiple character operator: /=");
		mocodes.put(":=", "multiple character operator: :=");
		mocodes.put("=", "Equals");
		mocodes.put("==", "multiple character operator: ==");
		mocodes.put("221D", "proportional to");
		mocodes.put("2224", "does not divide");
		mocodes.put("2225", "parallel to");
		mocodes.put("2226", "not parallel to");
		mocodes.put("2241", "not tilde");
		mocodes.put("2243", "asymptotically equal to");
		mocodes.put("2244", "not asymptotically equal to");
		mocodes.put("2245", "approximately equal to");
		mocodes.put("2246", "approximately but not actually equal to");
		mocodes.put("2247", "neither approximately nor actually equal to");
		mocodes.put("224D", "equivalent to");
		mocodes.put("2254", "colon equals");
		mocodes.put("2257", "ring equal to");
		mocodes.put("2259", "estimates");
		mocodes.put("225A", "equiangular to");
		mocodes.put("225C", "delta equal to");
		mocodes.put("225F", "questioned equal to");
		mocodes.put("2261", "identical to");
		mocodes.put("2268", "less-than but not equal to");
		mocodes.put("2269", "greater-than but not equal to");
		mocodes.put("226A", "much less-than");
		mocodes.put("226A;&#x338", "much less than with slash");
		mocodes.put("226B", "much greater-than");
		mocodes.put("226B;&#x338", "much greater than with slash");
		mocodes.put("226D", "not equivalent to");
		mocodes.put("2270", "neither less-than nor equal to");
		mocodes.put("2271", "neither greater-than nor equal to");
		mocodes.put("227A", "precedes");
		mocodes.put("227B", "succeeds");
		mocodes.put("227C", "precedes or equal to");
		mocodes.put("227D", "succeeds or equal to");
		mocodes.put("2280", "does not precede");
		mocodes.put("2281", "does not succeed");
		mocodes.put("22A5", "up tack");
		mocodes.put("22B4", "normal subgroup of or equal to");
		mocodes.put("22B5", "contains as normal subgroup or equal to");
		mocodes.put("22C9", "left normal factor semidirect product");
		mocodes.put("22CA", "right normal factor semidirect product");
		mocodes.put("22CB", "left semidirect product");
		mocodes.put("22CC", "right semidirect product");
		mocodes.put("22D4", "pitchfork");
		mocodes.put("22D6", "less-than with dot");
		mocodes.put("22D7", "greater-than with dot");
		mocodes.put("22D8", "very much less-than");
		mocodes.put("22D9", "very much greater-than");
		mocodes.put("22EA", "not normal subgroup of");
		mocodes.put("22EB", "does not contain as normal subgroup");
		mocodes.put("22EC", "not normal subgroup of or equal to");
		mocodes.put("22ED", "does not contain as normal subgroup or equal");
		mocodes.put("25A0", "black square");
		mocodes.put("25A1", "white square");
		mocodes.put("25AA", "black  square");
		mocodes.put("25AB", "white  square");
		mocodes.put("25AD", "white rectangle");
		mocodes.put("25AE", "black vertical rectangle");
		mocodes.put("25AF", "white vertical rectangle");
		mocodes.put("25B0", "black parallelogram");
		mocodes.put("25B1", "white parallelogram");
		mocodes.put("25B3", "white up-pointing triangle");
		mocodes.put("25B4", "black up-pointing  triangle");
		mocodes.put("25B5", "white up-pointing  triangle");
		mocodes.put("25B6", "black right-pointing triangle");
		mocodes.put("25B7", "white right-pointing triangle");
		mocodes.put("25B8", "black right-pointing  triangle");
		mocodes.put("25B9", "white right-pointing  triangle");
		mocodes.put("25BC", "black down-pointing triangle");
		mocodes.put("25BD", "white down-pointing triangle");
		mocodes.put("25BE", "black down-pointing  triangle");
		mocodes.put("25BF", "white down-pointing  triangle");
		mocodes.put("25C0", "black left-pointing triangle");
		mocodes.put("25C1", "white left-pointing triangle");
		mocodes.put("25C2", "black left-pointing  triangle");
		mocodes.put("25C3", "white left-pointing  triangle");
		mocodes.put("25C4", "black left-pointing pointer");
		mocodes.put("25C5", "white left-pointing pointer");
		mocodes.put("25C6", "black diamond");
		mocodes.put("25C7", "white diamond");
		mocodes.put("25C8", "white diamond containing black  diamond");
		mocodes.put("25C9", "fisheye");
		mocodes.put("25CC", "dotted circle");
		mocodes.put("25CD", "circle with vertical fill");
		mocodes.put("25CE", "bullseye");
		mocodes.put("25CF", "black circle");
		mocodes.put("25D6", "left half black circle");
		mocodes.put("25D7", "right half black circle");
		mocodes.put("25E6", "white bullet");
		mocodes.put("29C0", "circled less-than");
		mocodes.put("29C1", "circled greater-than");
		mocodes.put("29E3", "equals sign and slanted parallel");
		mocodes.put("29E4", "equals sign and slanted parallel with tilde above");
		mocodes.put("29E5", "identical to and slanted parallel");
		mocodes.put("29E6", "gleich stark");
		mocodes.put("29F3", "error-barred black circle");
		mocodes.put("2A87", "less-than and single-line not equal to");
		mocodes.put("2A88", "greater-than and single-line not equal to");
		mocodes.put("2AAF", "precedes above single-line equals sign");
		mocodes.put("2AAF;&#x338", "precedes above single-line equals sign with slash");
		mocodes.put("2AB0", "succeeds above single-line equals sign");
		mocodes.put("2AB0;&#x338", "succeeds above single-line equals sign with slash");
		mocodes.put("2044", "fraction slash");
		mocodes.put("2206", "increment");
		mocodes.put("220A", " element of");
		mocodes.put("220D", " contains as member");
		mocodes.put("220E", "end of proof");
		mocodes.put("2215", "division slash");
		mocodes.put("2217", "asterisk operator");
		mocodes.put("2218", "ring operator");
		mocodes.put("2219", "bullet operator");
		mocodes.put("221F", "right angle");
		mocodes.put("2223", "divides");
		mocodes.put("2236", "ratio");
		mocodes.put("2237", "proportion");
		mocodes.put("2238", "dot minus");
		mocodes.put("2239", "excess");
		mocodes.put("223A", "geometric proportion");
		mocodes.put("223B", "homothetic");
		mocodes.put("223D", "reversed tilde");
		mocodes.put("223D;&#x331", "reversed tilde with underline");
		mocodes.put("223E", "inverted lazy s");
		mocodes.put("223F", "sine wave");
		mocodes.put("2242", "minus tilde");
		mocodes.put("2242;&#x338", "minus tilde with slash");
		mocodes.put("224A", "almost equal or equal to");
		mocodes.put("224B", "triple tilde");
		mocodes.put("224C", "all equal to");
		mocodes.put("224E", "geometrically equivalent to");
		mocodes.put("224E;&#x338", "geometrically equivalent to with slash");
		mocodes.put("224F", "difference between");
		mocodes.put("224F;&#x338", "difference between with slash");
		mocodes.put("2250", "approaches the limit");
		mocodes.put("2251", "geometrically equal to");
		mocodes.put("2252", "approximately equal to or the image of");
		mocodes.put("2253", "image of or approximately equal to");
		mocodes.put("2255", "equals colon");
		mocodes.put("2256", "ring in equal to");
		mocodes.put("2258", "corresponds to");
		mocodes.put("225D", "equal to by definition");
		mocodes.put("225E", "measured by");
		mocodes.put("2263", "strictly equivalent to");
		mocodes.put("2266", "less-than over equal to");
		mocodes.put("2266;&#x338", "less-than over equal to with slash");
		mocodes.put("2267", "greater-than over equal to");
		mocodes.put("226C", "between");
		mocodes.put("2272", "less-than or equivalent to");
		mocodes.put("2273", "greater-than or equivalent to");
		mocodes.put("2274", "neither less-than nor equivalent to");
		mocodes.put("2275", "neither greater-than nor equivalent to");
		mocodes.put("2276", "less-than or greater-than");
		mocodes.put("2277", "greater-than or less-than");
		mocodes.put("2278", "neither less-than nor greater-than");
		mocodes.put("2279", "neither greater-than nor less-than");
		mocodes.put("227E", "precedes or equivalent to");
		mocodes.put("227F", "succeeds or equivalent to");
		mocodes.put("227F;&#x338", "succeeds or equivalent to with slash");
		mocodes.put("228C", "multiset");
		mocodes.put("228D", "multiset multiplication");
		mocodes.put("228E", "multiset union");
		mocodes.put("228F", "square image of");
		mocodes.put("228F;&#x338", "square image of with slash");
		mocodes.put("2290", "square original of");
		mocodes.put("2290;&#x338", "square original of with slash");
		mocodes.put("2291", "square image of or equal to");
		mocodes.put("2292", "square original of or equal to");
		mocodes.put("2293", "square cap");
		mocodes.put("2294", "square cup");
		mocodes.put("229A", "circled ring operator");
		mocodes.put("229B", "circled asterisk operator");
		mocodes.put("229C", "circled equals");
		mocodes.put("229D", "circled dash");
		mocodes.put("22A6", "assertion");
		mocodes.put("22A7", "models");
		mocodes.put("22AA", "triple vertical bar right turnstile");
		mocodes.put("22AB", "double vertical bar double right turnstile");
		mocodes.put("22B0", "precedes under relation");
		mocodes.put("22B1", "succeeds under relation");
		mocodes.put("22B2", "normal subgroup of");
		mocodes.put("22B3", "contains as normal subgroup");
		mocodes.put("22B6", "original of");
		mocodes.put("22B7", "image of");
		mocodes.put("22B9", "hermitian conjugate matrix");
		mocodes.put("22BA", "intercalate");
		mocodes.put("22BB", "xor");
		mocodes.put("22BC", "nand");
		mocodes.put("22BD", "nor");
		mocodes.put("22BE", "right angle with arc");
		mocodes.put("22BF", "right triangle");
		mocodes.put("22C4", "diamond operator");
		mocodes.put("22C6", "star operator");
		mocodes.put("22C7", "division times");
		mocodes.put("22C8", "bowtie");
		mocodes.put("22CD", "reversed tilde equals");
		mocodes.put("22CE", "curly logical or");
		mocodes.put("22CF", "curly logical and");
		mocodes.put("22D0", "double subset");
		mocodes.put("22D1", "double superset");
		mocodes.put("22D2", "double intersection");
		mocodes.put("22D3", "double union");
		mocodes.put("22D5", "equal and parallel to");
		mocodes.put("22DA", "less-than equal to or greater-than");
		mocodes.put("22DB", "greater-than equal to or less-than");
		mocodes.put("22DC", "equal to or less-than");
		mocodes.put("22DD", "equal to or greater-than");
		mocodes.put("22DE", "equal to or precedes");
		mocodes.put("22DF", "equal to or succeeds");
		mocodes.put("22E0", "does not precede or equal");
		mocodes.put("22E1", "does not succeed or equal");
		mocodes.put("22E2", "not square image of or equal to");
		mocodes.put("22E3", "not square original of or equal to");
		mocodes.put("22E4", "square image of or not equal to");
		mocodes.put("22E5", "square original of or not equal to");
		mocodes.put("22E6", "less-than but not equivalent to");
		mocodes.put("22E7", "greater-than but not equivalent to");
		mocodes.put("22E8", "precedes but not equivalent to");
		mocodes.put("22E9", "succeeds but not equivalent to");
		mocodes.put("22F0", "up right diagonal ellipsis");
		mocodes.put("22F1", "down right diagonal ellipsis");
		mocodes.put("22F2", "element of with long horizontal stroke");
		mocodes.put("22F3", "element of with vertical bar at end of horizontal stroke");
		mocodes.put("22F4", "element of with vertical bar at end of horizontal stroke");
		mocodes.put("22F5", "element of with dot above");
		mocodes.put("22F6", "element of with overbar");
		mocodes.put("22F7", " element of with overbar");
		mocodes.put("22F8", "element of with underbar");
		mocodes.put("22F9", "element of with two horizontal strokes");
		mocodes.put("22FA", "contains with long horizontal stroke");
		mocodes.put("22FB", "contains with vertical bar at end of horizontal stroke");
		mocodes.put("22FC", " contains with vertical bar at end of horizontal stroke");
		mocodes.put("22FD", "contains with overbar");
		mocodes.put("22FE", " contains with overbar");
		mocodes.put("22FF", "z notation bag membership");
		mocodes.put("25B2", "black up-pointing triangle");
		mocodes.put("2758", "light vertical bar");
		mocodes.put("2981", "z notation spot");
		mocodes.put("2982", "z notation type colon");
		mocodes.put("29A0", "spherical angle opening left");
		mocodes.put("29A1", "spherical angle opening up");
		mocodes.put("29A2", "turned angle");
		mocodes.put("29A3", "reversed angle");
		mocodes.put("29A4", "angle with underbar");
		mocodes.put("29A5", "reversed angle with underbar");
		mocodes.put("29A6", "oblique angle opening up");
		mocodes.put("29A7", "oblique angle opening down");
		mocodes.put("29A8", "measured angle with open arm ending in arrow pointing up and right");
		mocodes.put("29A9", "measured angle with open arm ending in arrow pointing up and left");
		mocodes.put("29AA", "measured angle with open arm ending in arrow pointing down and right");
		mocodes.put("29AB", "measured angle with open arm ending in arrow pointing down and left");
		mocodes.put("29AC", "measured angle with open arm ending in arrow pointing right and up");
		mocodes.put("29AD", "measured angle with open arm ending in arrow pointing left and up");
		mocodes.put("29AE", "measured angle with open arm ending in arrow pointing right and down");
		mocodes.put("29AF", "measured angle with open arm ending in arrow pointing left and down");
		mocodes.put("29B0", "reversed empty set");
		mocodes.put("29B1", "empty set with overbar");
		mocodes.put("29B2", "empty set with  circle above");
		mocodes.put("29B3", "empty set with right arrow above");
		mocodes.put("29B4", "empty set with left arrow above");
		mocodes.put("29B5", "circle with horizontal bar");
		mocodes.put("29B6", "circled vertical bar");
		mocodes.put("29B7", "circled parallel");
		mocodes.put("29B8", "circled reverse solidus");
		mocodes.put("29B9", "circled perpendicular");
		mocodes.put("29BA", "circle divided by horizontal bar and top half divided by vertical bar");
		mocodes.put("29BB", "circle with superimposed x");
		mocodes.put("29BC", "circled anticlockwise-rotated division sign");
		mocodes.put("29BD", "up arrow through circle");
		mocodes.put("29BE", "circled white bullet");
		mocodes.put("29BF", "circled bullet");
		mocodes.put("29C2", "circle with  circle to the right");
		mocodes.put("29C3", "circle with two horizontal strokes to the right");
		mocodes.put("29C4", "squared rising diagonal slash");
		mocodes.put("29C5", "squared falling diagonal slash");
		mocodes.put("29C6", "squared asterisk");
		mocodes.put("29C7", "squared  circle");
		mocodes.put("29C8", "squared square");
		mocodes.put("29C9", "two joined squares");
		mocodes.put("29CA", "triangle with dot above");
		mocodes.put("29CB", "triangle with underbar");
		mocodes.put("29CC", "s in triangle");
		mocodes.put("29CD", "triangle with serifs at bottom");
		mocodes.put("29CE", "right triangle above left triangle");
		mocodes.put("29CF", "left triangle beside vertical bar");
		mocodes.put("29CF;&#x338", "left triangle beside vertical bar with slash");
		mocodes.put("29D0", "vertical bar beside right triangle");
		mocodes.put("29D0;&#x338", "vertical bar beside right triangle with slash");
		mocodes.put("29D1", "bowtie with left half black");
		mocodes.put("29D2", "bowtie with right half black");
		mocodes.put("29D3", "black bowtie");
		mocodes.put("29D4", "times with left half black");
		mocodes.put("29D5", "times with right half black");
		mocodes.put("29D6", "white hourglass");
		mocodes.put("29D7", "black hourglass");
		mocodes.put("29D8", "left wiggly fence");
		mocodes.put("29D9", "right wiggly fence");
		mocodes.put("29DB", "right double wiggly fence");
		mocodes.put("29DC", "incomplete infinity");
		mocodes.put("29DD", "tie over infinity");
		mocodes.put("29DE", "infinity negated with vertical bar");
		mocodes.put("29E0", "square with contoured outline");
		mocodes.put("29E1", "increases as");
		mocodes.put("29E2", "shuffle product");
		mocodes.put("29E7", "thermodynamic");
		mocodes.put("29E8", "down-pointing triangle with left half black");
		mocodes.put("29E9", "down-pointing triangle with right half black");
		mocodes.put("29EA", "black diamond with down arrow");
		mocodes.put("29EB", "black lozenge");
		mocodes.put("29EC", "white circle with down arrow");
		mocodes.put("29ED", "black circle with down arrow");
		mocodes.put("29EE", "error-barred white square");
		mocodes.put("29F0", "error-barred white diamond");
		mocodes.put("29F1", "error-barred black diamond");
		mocodes.put("29F2", "error-barred white circle");
		mocodes.put("29F5", "reverse solidus operator");
		mocodes.put("29F6", "solidus with overbar");
		mocodes.put("29F7", "reverse solidus with horizontal stroke");
		mocodes.put("29F8", "big solidus");
		mocodes.put("29F9", "big reverse solidus");
		mocodes.put("29FA", "double plus");
		mocodes.put("29FB", "triple plus");
		mocodes.put("29FE", "tiny");
		mocodes.put("29FF", "miny");
		mocodes.put("2A1D", "join");
		mocodes.put("2A1E", "large left triangle operator");
		mocodes.put("2A1F", "z notation schema composition");
		mocodes.put("2A20", "z notation schema piping");
		mocodes.put("2A21", "z notation schema projection");
		mocodes.put("2A22", "plus sign with  circle above");
		mocodes.put("2A23", "plus sign with circumflex accent above");
		mocodes.put("2A24", "plus sign with tilde above");
		mocodes.put("2A25", "plus sign with dot below");
		mocodes.put("2A26", "plus sign with tilde below");
		mocodes.put("2A27", "plus sign with subscript two");
		mocodes.put("2A28", "plus sign with black triangle");
		mocodes.put("2A29", "minus sign with comma above");
		mocodes.put("2A2A", "minus sign with dot below");
		mocodes.put("2A2B", "minus sign with falling dots");
		mocodes.put("2A2C", "minus sign with rising dots");
		mocodes.put("2A2D", "plus sign in left half circle");
		mocodes.put("2A2E", "plus sign in right half circle");
		mocodes.put("2A30", "multiplication sign with dot above");
		mocodes.put("2A31", "multiplication sign with underbar");
		mocodes.put("2A32", "semidirect product with bottom closed");
		mocodes.put("2A33", "smash product");
		mocodes.put("2A34", "multiplication sign in left half circle");
		mocodes.put("2A35", "multiplication sign in right half circle");
		mocodes.put("2A36", "circled multiplication sign with circumflex accent");
		mocodes.put("2A37", "multiplication sign in double circle");
		mocodes.put("2A38", "circled division sign");
		mocodes.put("2A39", "plus sign in triangle");
		mocodes.put("2A3A", "minus sign in triangle");
		mocodes.put("2A3B", "multiplication sign in triangle");
		mocodes.put("2A3C", "interior product");
		mocodes.put("2A3D", "righthand interior product");
		mocodes.put("2A3E", "z notation relational composition");
		mocodes.put("2A40", "intersection with dot");
		mocodes.put("2A41", "union with minus sign");
		mocodes.put("2A42", "union with overbar");
		mocodes.put("2A43", "intersection with overbar");
		mocodes.put("2A44", "intersection with logical and");
		mocodes.put("2A45", "union with logical or");
		mocodes.put("2A46", "union above intersection");
		mocodes.put("2A47", "intersection above union");
		mocodes.put("2A48", "union above bar above intersection");
		mocodes.put("2A49", "intersection above bar above union");
		mocodes.put("2A4A", "union beside and joined with union");
		mocodes.put("2A4B", "intersection beside and joined with intersection");
		mocodes.put("2A4C", "closed union with serifs");
		mocodes.put("2A4D", "closed intersection with serifs");
		mocodes.put("2A4E", "double square intersection");
		mocodes.put("2A4F", "double square union");
		mocodes.put("2A50", "closed union with serifs and smash product");
		mocodes.put("2A51", "logical and with dot above");
		mocodes.put("2A52", "logical or with dot above");
		mocodes.put("2A53", "double logical and");
		mocodes.put("2A54", "double logical or");
		mocodes.put("2A55", "two intersecting logical and");
		mocodes.put("2A56", "two intersecting logical or");
		mocodes.put("2A57", "sloping large or");
		mocodes.put("2A58", "sloping large and");
		mocodes.put("2A59", "logical or overlapping logical and");
		mocodes.put("2A5A", "logical and with middle stem");
		mocodes.put("2A5B", "logical or with middle stem");
		mocodes.put("2A5C", "logical and with horizontal dash");
		mocodes.put("2A5D", "logical or with horizontal dash");
		mocodes.put("2A5E", "logical and with double overbar");
		mocodes.put("2A5F", "logical and with underbar");
		mocodes.put("2A60", "logical and with double underbar");
		mocodes.put("2A61", " vee with underbar");
		mocodes.put("2A62", "logical or with double overbar");
		mocodes.put("2A63", "logical or with double underbar");
		mocodes.put("2A64", "z notation domain antirestriction");
		mocodes.put("2A65", "z notation range antirestriction");
		mocodes.put("2A66", "equals sign with dot below");
		mocodes.put("2A67", "identical with dot above");
		mocodes.put("2A68", "triple horizontal bar with double vertical stroke");
		mocodes.put("2A69", "triple horizontal bar with triple vertical stroke");
		mocodes.put("2A6A", "tilde operator with dot above");
		mocodes.put("2A6B", "tilde operator with rising dots");
		mocodes.put("2A6C", "similar minus similar");
		mocodes.put("2A6D", "congruent with dot above");
		mocodes.put("2A6E", "equals with asterisk");
		mocodes.put("2A6F", "almost equal to with circumflex accent");
		mocodes.put("2A70", "approximately equal or equal to");
		mocodes.put("2A71", "equals sign above plus sign");
		mocodes.put("2A72", "plus sign above equals sign");
		mocodes.put("2A73", "equals sign above tilde operator");
		mocodes.put("2A74", "double colon equal");
		mocodes.put("2A75", "two consecutive equals signs");
		mocodes.put("2A76", "three consecutive equals signs");
		mocodes.put("2A77", "equals sign with two dots above and two dots below");
		mocodes.put("2A78", "equivalent with four dots above");
		mocodes.put("2A79", "less-than with circle inside");
		mocodes.put("2A7A", "greater-than with circle inside");
		mocodes.put("2A7B", "less-than with question mark above");
		mocodes.put("2A7C", "greater-than with question mark above");
		mocodes.put("2A7D", "less-than or slanted equal to");
		mocodes.put("2A7D;&#x338", "less-than or slanted equal to with slash");
		mocodes.put("2A7E", "greater-than or slanted equal to");
		mocodes.put("2A7E;&#x338", "greater-than or slanted equal to with slash");
		mocodes.put("2A7F", "less-than or slanted equal to with dot inside");
		mocodes.put("2A80", "greater-than or slanted equal to with dot inside");
		mocodes.put("2A81", "less-than or slanted equal to with dot above");
		mocodes.put("2A82", "greater-than or slanted equal to with dot above");
		mocodes.put("2A83", "less-than or slanted equal to with dot above right");
		mocodes.put("2A84", "greater-than or slanted equal to with dot above left");
		mocodes.put("2A85", "less-than or approximate");
		mocodes.put("2A86", "greater-than or approximate");
		mocodes.put("2A89", "less-than and not approximate");
		mocodes.put("2A8A", "greater-than and not approximate");
		mocodes.put("2A8B", "less-than above double-line equal above greater-than");
		mocodes.put("2A8C", "greater-than above double-line equal above less-than");
		mocodes.put("2A8D", "less-than above similar or equal");
		mocodes.put("2A8E", "greater-than above similar or equal");
		mocodes.put("2A8F", "less-than above similar above greater-than");
		mocodes.put("2A90", "greater-than above similar above less-than");
		mocodes.put("2A91", "less-than above greater-than above double-line equal");
		mocodes.put("2A92", "greater-than above less-than above double-line equal");
		mocodes.put("2A93", "less-than above slanted equal above greater-than above slanted equal");
		mocodes.put("2A94", "greater-than above slanted equal above less-than above slanted equal");
		mocodes.put("2A95", "slanted equal to or less-than");
		mocodes.put("2A96", "slanted equal to or greater-than");
		mocodes.put("2A97", "slanted equal to or less-than with dot inside");
		mocodes.put("2A98", "slanted equal to or greater-than with dot inside");
		mocodes.put("2A99", "double-line equal to or less-than");
		mocodes.put("2A9A", "double-line equal to or greater-than");
		mocodes.put("2A9B", "double-line slanted equal to or less-than");
		mocodes.put("2A9C", "double-line slanted equal to or greater-than");
		mocodes.put("2A9D", "similar or less-than");
		mocodes.put("2A9E", "similar or greater-than");
		mocodes.put("2A9F", "similar above less-than above equals sign");
		mocodes.put("2AA0", "similar above greater-than above equals sign");
		mocodes.put("2AA1", "double nested less-than");
		mocodes.put("2AA1;&#x338", "double nested less-than with slash");
		mocodes.put("2AA2", "double nested greater-than");
		mocodes.put("2AA2;&#x338", "double nested greater-than with slash");
		mocodes.put("2AA3", "double nested less-than with underbar");
		mocodes.put("2AA4", "greater-than overlapping less-than");
		mocodes.put("2AA5", "greater-than beside less-than");
		mocodes.put("2AA6", "less-than closed by curve");
		mocodes.put("2AA7", "greater-than closed by curve");
		mocodes.put("2AA8", "less-than closed by curve above slanted equal");
		mocodes.put("2AA9", "greater-than closed by curve above slanted equal");
		mocodes.put("2AAA", "er than");
		mocodes.put("2AAB", "larger than");
		mocodes.put("2AAC", "er than or equal to");
		mocodes.put("2AAD", "larger than or equal to");
		mocodes.put("2AAE", "equals sign with bumpy above");
		mocodes.put("2AB1", "precedes above single-line not equal to");
		mocodes.put("2AB2", "succeeds above single-line not equal to");
		mocodes.put("2AB3", "precedes above equals sign");
		mocodes.put("2AB4", "succeeds above equals sign");
		mocodes.put("2AB5", "precedes above not equal to");
		mocodes.put("2AB6", "succeeds above not equal to");
		mocodes.put("2AB7", "precedes above almost equal to");
		mocodes.put("2AB8", "succeeds above almost equal to");
		mocodes.put("2AB9", "precedes above not almost equal to");
		mocodes.put("2ABA", "succeeds above not almost equal to");
		mocodes.put("2ABB", "double precedes");
		mocodes.put("2ABC", "double succeeds");
		mocodes.put("2ABD", "subset with dot");
		mocodes.put("2ABE", "superset with dot");
		mocodes.put("2ABF", "subset with plus sign below");
		mocodes.put("2AC0", "superset with plus sign below");
		mocodes.put("2AC1", "subset with multiplication sign below");
		mocodes.put("2AC2", "superset with multiplication sign below");
		mocodes.put("2AC3", "subset of or equal to with dot above");
		mocodes.put("2AC4", "superset of or equal to with dot above");
		mocodes.put("2AC5", "subset of above equals sign");
		mocodes.put("2AC6", "superset of above equals sign");
		mocodes.put("2AC7", "subset of above tilde operator");
		mocodes.put("2AC8", "superset of above tilde operator");
		mocodes.put("2AC9", "subset of above almost equal to");
		mocodes.put("2ACA", "superset of above almost equal to");
		mocodes.put("2ACB", "subset of above not equal to");
		mocodes.put("2ACC", "superset of above not equal to");
		mocodes.put("2ACD", "square left open box operator");
		mocodes.put("2ACE", "square right open box operator");
		mocodes.put("2ACF", "closed subset");
		mocodes.put("2AD0", "closed superset");
		mocodes.put("2AD1", "closed subset or equal to");
		mocodes.put("2AD2", "closed superset or equal to");
		mocodes.put("2AD3", "subset above superset");
		mocodes.put("2AD4", "superset above subset");
		mocodes.put("2AD5", "subset above subset");
		mocodes.put("2AD6", "superset above superset");
		mocodes.put("2AD7", "superset beside subset");
		mocodes.put("2AD8", "superset beside and joined by dash with subset");
		mocodes.put("2AD9", "element of opening downwards");
		mocodes.put("2ADA", "pitchfork with tee top");
		mocodes.put("2ADB", "transversal intersection");
		mocodes.put("2ADC", "forking");
		mocodes.put("2ADD", "nonforking");
		mocodes.put("2ADE", "short left tack");
		mocodes.put("2ADF", "short down tack");
		mocodes.put("2AE0", "short up tack");
		mocodes.put("2AE1", "perpendicular with s");
		mocodes.put("2AE2", "vertical bar triple right turnstile");
		mocodes.put("2AE3", "double vertical bar left turnstile");
		mocodes.put("2AE4", "vertical bar double left turnstile");
		mocodes.put("2AE5", "double vertical bar double left turnstile");
		mocodes.put("2AE6", "long dash from left member of double vertical");
		mocodes.put("2AE7", "short down tack with overbar");
		mocodes.put("2AE8", "short up tack with underbar");
		mocodes.put("2AE9", "short up tack above short down tack");
		mocodes.put("2AEA", "double down tack");
		mocodes.put("2AEB", "double up tack");
		mocodes.put("2AEC", "double stroke not sign");
		mocodes.put("2AED", "reversed double stroke not sign");
		mocodes.put("2AEE", "does not divide with reversed negation slash");
		mocodes.put("2AEF", "vertical line with circle above");
		mocodes.put("2AF0", "vertical line with circle below");
		mocodes.put("2AF1", "down tack with circle below");
		mocodes.put("2AF2", "parallel with horizontal stroke");
		mocodes.put("2AF3", "parallel with tilde operator");
		mocodes.put("2AF4", "triple vertical bar binary relation");
		mocodes.put("2AF5", "triple vertical bar with horizontal stroke");
		mocodes.put("2AF6", "triple colon operator");
		mocodes.put("2AF7", "triple nested less-than");
		mocodes.put("2AF8", "triple nested greater-than");
		mocodes.put("2AF9", "double-line slanted less-than or equal to");
		mocodes.put("2AFA", "double-line slanted greater-than or equal to");
		mocodes.put("2AFB", "triple solidus binary relation");
		mocodes.put("2AFD", "double solidus operator");
		mocodes.put("2AFE", "white vertical bar");
		mocodes.put("|", "vertical line");
		mocodes.put("||", "multiple character operator: ||");
		mocodes.put("|||", "multiple character operator: |||");
		mocodes.put("2190", "left-arrow");
		mocodes.put("2191", "upwards arrow");
		mocodes.put("2192", "right-arrow");
		mocodes.put("2193", "downwards arrow");
		mocodes.put("2194", "left right arrow");
		mocodes.put("2195", "up down arrow");
		mocodes.put("2196", "north west arrow");
		mocodes.put("2197", "north east arrow");
		mocodes.put("2198", "south east arrow");
		mocodes.put("2199", "south west arrow");
		mocodes.put("219A", "leftwards arrow with stroke");
		mocodes.put("219B", "rightwards arrow with stroke");
		mocodes.put("219C", "leftwards wave arrow");
		mocodes.put("219D", "rightwards wave arrow");
		mocodes.put("219E", "leftwards two headed arrow");
		mocodes.put("219F", "upwards two headed arrow");
		mocodes.put("21A0", "rightwards two headed arrow");
		mocodes.put("21A1", "downwards two headed arrow");
		mocodes.put("21A2", "leftwards arrow with tail");
		mocodes.put("21A3", "rightwards arrow with tail");
		mocodes.put("21A4", "leftwards arrow from bar");
		mocodes.put("21A5", "upwards arrow from bar");
		mocodes.put("21A6", "rightwards arrow from bar");
		mocodes.put("21A7", "downwards arrow from bar");
		mocodes.put("21A8", "up down arrow with base");
		mocodes.put("21A9", "leftwards arrow with hook");
		mocodes.put("21AA", "rightwards arrow with hook");
		mocodes.put("21AB", "leftwards arrow with loop");
		mocodes.put("21AC", "rightwards arrow with loop");
		mocodes.put("21AD", "left right wave arrow");
		mocodes.put("21AE", "left right arrow with stroke");
		mocodes.put("21AF", "downwards zigzag arrow");
		mocodes.put("21B0", "upwards arrow with tip leftwards");
		mocodes.put("21B1", "upwards arrow with tip rightwards");
		mocodes.put("21B2", "downwards arrow with tip leftwards");
		mocodes.put("21B3", "downwards arrow with tip rightwards");
		mocodes.put("21B4", "rightwards arrow with corner downwards");
		mocodes.put("21B5", "downwards arrow with corner leftwards");
		mocodes.put("21B6", "anticlockwise top semicircle arrow");
		mocodes.put("21B7", "clockwise top semicircle arrow");
		mocodes.put("21B8", "north west arrow to long bar");
		mocodes.put("21B9", "leftwards arrow to bar over rightwards arrow to bar");
		mocodes.put("21BA", "anticlockwise open circle arrow");
		mocodes.put("21BB", "clockwise open circle arrow");
		mocodes.put("21BC", "leftwards harpoon with barb upwards");
		mocodes.put("21BD", "leftwards harpoon with barb downwards");
		mocodes.put("21BE", "upwards harpoon with barb rightwards");
		mocodes.put("21BF", "upwards harpoon with barb leftwards");
		mocodes.put("21C0", "rightwards harpoon with barb upwards");
		mocodes.put("21C1", "rightwards harpoon with barb downwards");
		mocodes.put("21C2", "downwards harpoon with barb rightwards");
		mocodes.put("21C3", "downwards harpoon with barb leftwards");
		mocodes.put("21C4", "rightwards arrow over leftwards arrow");
		mocodes.put("21C5", "upwards arrow leftwards of downwards arrow");
		mocodes.put("21C6", "leftwards arrow over rightwards arrow");
		mocodes.put("21C7", "leftwards paired arrows");
		mocodes.put("21C8", "upwards paired arrows");
		mocodes.put("21C9", "rightwards paired arrows");
		mocodes.put("21CA", "downwards paired arrows");
		mocodes.put("21CB", "leftwards harpoon over rightwards harpoon");
		mocodes.put("21CC", "rightwards harpoon over leftwards harpoon");
		mocodes.put("21CD", "leftwards double arrow with stroke");
		mocodes.put("21CE", "left right double arrow with stroke");
		mocodes.put("21CF", "rightwards double arrow with stroke");
		mocodes.put("21D0", "leftwards double arrow");
		mocodes.put("21D1", "upwards double arrow");
		mocodes.put("21D2", "rightwards double arrow");
		mocodes.put("21D3", "downwards double arrow");
		mocodes.put("21D4", "left right double arrow");
		mocodes.put("21D5", "up down double arrow");
		mocodes.put("21D6", "north west double arrow");
		mocodes.put("21D7", "north east double arrow");
		mocodes.put("21D8", "south east double arrow");
		mocodes.put("21D9", "south west double arrow");
		mocodes.put("21DA", "leftwards triple arrow");
		mocodes.put("21DB", "rightwards triple arrow");
		mocodes.put("21DC", "leftwards squiggle arrow");
		mocodes.put("21DD", "rightwards squiggle arrow");
		mocodes.put("21DE", "upwards arrow with double stroke");
		mocodes.put("21DF", "downwards arrow with double stroke");
		mocodes.put("21E0", "leftwards dashed arrow");
		mocodes.put("21E1", "upwards dashed arrow");
		mocodes.put("21E2", "rightwards dashed arrow");
		mocodes.put("21E3", "downwards dashed arrow");
		mocodes.put("21E4", "leftwards arrow to bar");
		mocodes.put("21E5", "rightwards arrow to bar");
		mocodes.put("21E6", "leftwards white arrow");
		mocodes.put("21E7", "upwards white arrow");
		mocodes.put("21E8", "rightwards white arrow");
		mocodes.put("21E9", "downwards white arrow");
		mocodes.put("21EA", "upwards white arrow from bar");
		mocodes.put("21EB", "upwards white arrow on pedestal");
		mocodes.put("21EC", "upwards white arrow on pedestal with horizontal bar");
		mocodes.put("21ED", "upwards white arrow on pedestal with vertical bar");
		mocodes.put("21EE", "upwards white double arrow");
		mocodes.put("21EF", "upwards white double arrow on pedestal");
		mocodes.put("21F0", "rightwards white arrow from wall");
		mocodes.put("21F1", "north west arrow to corner");
		mocodes.put("21F2", "south east arrow to corner");
		mocodes.put("21F3", "up down white arrow");
		mocodes.put("21F4", "right arrow with  circle");
		mocodes.put("21F5", "downwards arrow leftwards of upwards arrow");
		mocodes.put("21F6", "three rightwards arrows");
		mocodes.put("21F7", "leftwards arrow with vertical stroke");
		mocodes.put("21F8", "rightwards arrow with vertical stroke");
		mocodes.put("21F9", "left right arrow with vertical stroke");
		mocodes.put("21FA", "leftwards arrow with double vertical stroke");
		mocodes.put("21FB", "rightwards arrow with double vertical stroke");
		mocodes.put("21FC", "left right arrow with double vertical stroke");
		mocodes.put("21FD", "leftwards open-headed arrow");
		mocodes.put("21FE", "rightwards open-headed arrow");
		mocodes.put("21FF", "left right open-headed arrow");
		mocodes.put("22B8", "multimap");
		mocodes.put("27F0", "upwards quadruple arrow");
		mocodes.put("27F1", "downwards quadruple arrow");
		mocodes.put("27F5", "long leftwards arrow");
		mocodes.put("27F6", "long rightwards arrow");
		mocodes.put("27F7", "long left right arrow");
		mocodes.put("27F8", "long leftwards double arrow");
		mocodes.put("27F9", "long rightwards double arrow");
		mocodes.put("27FA", "long left right double arrow");
		mocodes.put("27FB", "long leftwards arrow from bar");
		mocodes.put("27FC", "long rightwards arrow from bar");
		mocodes.put("27FD", "long leftwards double arrow from bar");
		mocodes.put("27FE", "long rightwards double arrow from bar");
		mocodes.put("27FF", "long rightwards squiggle arrow");
		mocodes.put("2900", "rightwards two-headed arrow with vertical stroke");
		mocodes.put("2901", "rightwards two-headed arrow with double vertical stroke");
		mocodes.put("2902", "leftwards double arrow with vertical stroke");
		mocodes.put("2903", "rightwards double arrow with vertical stroke");
		mocodes.put("2904", "left right double arrow with vertical stroke");
		mocodes.put("2905", "rightwards two-headed arrow from bar");
		mocodes.put("2906", "leftwards double arrow from bar");
		mocodes.put("2907", "rightwards double arrow from bar");
		mocodes.put("2908", "downwards arrow with horizontal stroke");
		mocodes.put("2909", "upwards arrow with horizontal stroke");
		mocodes.put("290A", "upwards triple arrow");
		mocodes.put("290B", "downwards triple arrow");
		mocodes.put("290C", "leftwards double dash arrow");
		mocodes.put("290D", "rightwards double dash arrow");
		mocodes.put("290E", "leftwards triple dash arrow");
		mocodes.put("290F", "rightwards triple dash arrow");
		mocodes.put("2910", "rightwards two-headed triple dash arrow");
		mocodes.put("2911", "rightwards arrow with dotted stem");
		mocodes.put("2912", "upwards arrow to bar");
		mocodes.put("2913", "downwards arrow to bar");
		mocodes.put("2914", "rightwards arrow with tail with vertical stroke");
		mocodes.put("2915", "rightwards arrow with tail with double vertical stroke");
		mocodes.put("2916", "rightwards two-headed arrow with tail");
		mocodes.put("2917", "rightwards two-headed arrow with tail with vertical stroke");
		mocodes.put("2918", "rightwards two-headed arrow with tail with double vertical stroke");
		mocodes.put("2919", "leftwards arrow-tail");
		mocodes.put("291A", "rightwards arrow-tail");
		mocodes.put("291B", "leftwards double arrow-tail");
		mocodes.put("291C", "rightwards double arrow-tail");
		mocodes.put("291D", "leftwards arrow to black diamond");
		mocodes.put("291E", "rightwards arrow to black diamond");
		mocodes.put("291F", "leftwards arrow from bar to black diamond");
		mocodes.put("2920", "rightwards arrow from bar to black diamond");
		mocodes.put("2921", "north west and south east arrow");
		mocodes.put("2922", "north east and south west arrow");
		mocodes.put("2923", "north west arrow with hook");
		mocodes.put("2924", "north east arrow with hook");
		mocodes.put("2925", "south east arrow with hook");
		mocodes.put("2926", "south west arrow with hook");
		mocodes.put("2927", "north west arrow and north east arrow");
		mocodes.put("2928", "north east arrow and south east arrow");
		mocodes.put("2929", "south east arrow and south west arrow");
		mocodes.put("292A", "south west arrow and north west arrow");
		mocodes.put("292B", "rising diagonal crossing falling diagonal");
		mocodes.put("292C", "falling diagonal crossing rising diagonal");
		mocodes.put("292D", "south east arrow crossing north east arrow");
		mocodes.put("292E", "north east arrow crossing south east arrow");
		mocodes.put("292F", "falling diagonal crossing north east arrow");
		mocodes.put("2930", "rising diagonal crossing south east arrow");
		mocodes.put("2931", "north east arrow crossing north west arrow");
		mocodes.put("2932", "north west arrow crossing north east arrow");
		mocodes.put("2933", "wave arrow pointing directly right");
		mocodes.put("2934", "arrow pointing rightwards then curving upwards");
		mocodes.put("2935", "arrow pointing rightwards then curving downwards");
		mocodes.put("2936", "arrow pointing downwards then curving leftwards");
		mocodes.put("2937", "arrow pointing downwards then curving rightwards");
		mocodes.put("2938", "right-side arc clockwise arrow");
		mocodes.put("2939", "left-side arc anticlockwise arrow");
		mocodes.put("293A", "top arc anticlockwise arrow");
		mocodes.put("293B", "bottom arc anticlockwise arrow");
		mocodes.put("293C", "top arc clockwise arrow with minus");
		mocodes.put("293D", "top arc anticlockwise arrow with plus");
		mocodes.put("293E", "lower right semicircular clockwise arrow");
		mocodes.put("293F", "lower left semicircular anticlockwise arrow");
		mocodes.put("2940", "anticlockwise closed circle arrow");
		mocodes.put("2941", "clockwise closed circle arrow");
		mocodes.put("2942", "rightwards arrow above short leftwards arrow");
		mocodes.put("2943", "leftwards arrow above short rightwards arrow");
		mocodes.put("2944", "short rightwards arrow above leftwards arrow");
		mocodes.put("2945", "rightwards arrow with plus below");
		mocodes.put("2946", "leftwards arrow with plus below");
		mocodes.put("2947", "rightwards arrow through x");
		mocodes.put("2948", "left right arrow through  circle");
		mocodes.put("2949", "upwards two-headed arrow from  circle");
		mocodes.put("294A", "left barb up right barb down harpoon");
		mocodes.put("294B", "left barb down right barb up harpoon");
		mocodes.put("294C", "up barb right down barb left harpoon");
		mocodes.put("294D", "up barb left down barb right harpoon");
		mocodes.put("294E", "left barb up right barb up harpoon");
		mocodes.put("294F", "up barb right down barb right harpoon");
		mocodes.put("2950", "left barb down right barb down harpoon");
		mocodes.put("2951", "up barb left down barb left harpoon");
		mocodes.put("2952", "leftwards harpoon with barb up to bar");
		mocodes.put("2953", "rightwards harpoon with barb up to bar");
		mocodes.put("2954", "upwards harpoon with barb right to bar");
		mocodes.put("2955", "downwards harpoon with barb right to bar");
		mocodes.put("2956", "leftwards harpoon with barb down to bar");
		mocodes.put("2957", "rightwards harpoon with barb down to bar");
		mocodes.put("2958", "upwards harpoon with barb left to bar");
		mocodes.put("2959", "downwards harpoon with barb left to bar");
		mocodes.put("295A", "leftwards harpoon with barb up from bar");
		mocodes.put("295B", "rightwards harpoon with barb up from bar");
		mocodes.put("295C", "upwards harpoon with barb right from bar");
		mocodes.put("295D", "downwards harpoon with barb right from bar");
		mocodes.put("295E", "leftwards harpoon with barb down from bar");
		mocodes.put("295F", "rightwards harpoon with barb down from bar");
		mocodes.put("2960", "upwards harpoon with barb left from bar");
		mocodes.put("2961", "downwards harpoon with barb left from bar");
		mocodes.put("2962", "leftwards harpoon with barb up above leftwards harpoon with barb down");
		mocodes.put("2963", "upwards harpoon with barb left beside upwards harpoon with barb right");
		mocodes.put("2964", "rightwards harpoon with barb up above rightwards harpoon with barb down");
		mocodes.put("2965", "downwards harpoon with barb left beside downwards harpoon with barb right");
		mocodes.put("2966", "leftwards harpoon with barb up above rightwards harpoon with barb up");
		mocodes.put("2967", "leftwards harpoon with barb down above rightwards harpoon with barb down");
		mocodes.put("2968", "rightwards harpoon with barb up above leftwards harpoon with barb up");
		mocodes.put("2969", "rightwards harpoon with barb down above leftwards harpoon with barb down");
		mocodes.put("296A", "leftwards harpoon with barb up above long dash");
		mocodes.put("296B", "leftwards harpoon with barb down below long dash");
		mocodes.put("296C", "rightwards harpoon with barb up above long dash");
		mocodes.put("296D", "rightwards harpoon with barb down below long dash");
		mocodes.put("296E", "upwards harpoon with barb left beside downwards harpoon with barb right");
		mocodes.put("296F", "downwards harpoon with barb left beside upwards harpoon with barb right");
		mocodes.put("2970", "right double arrow with rounded head");
		mocodes.put("2971", "equals sign above rightwards arrow");
		mocodes.put("2972", "tilde operator above rightwards arrow");
		mocodes.put("2973", "leftwards arrow above tilde operator");
		mocodes.put("2974", "rightwards arrow above tilde operator");
		mocodes.put("2975", "rightwards arrow above almost equal to");
		mocodes.put("2976", "less-than above leftwards arrow");
		mocodes.put("2977", "leftwards arrow through less-than");
		mocodes.put("2978", "greater-than above rightwards arrow");
		mocodes.put("2979", "subset above rightwards arrow");
		mocodes.put("297A", "leftwards arrow through subset");
		mocodes.put("297B", "superset above leftwards arrow");
		mocodes.put("297C", "left fish tail");
		mocodes.put("297D", "right fish tail");
		mocodes.put("297E", "up fish tail");
		mocodes.put("297F", "down fish tail");
		mocodes.put("2999", "dotted fence");
		mocodes.put("299A", "vertical zigzag line");
		mocodes.put("299B", "measured angle opening left");
		mocodes.put("299C", "right angle variant with square");
		mocodes.put("299D", "measured right angle with dot");
		mocodes.put("299E", "angle with s inside");
		mocodes.put("299F", "acute angle");
		mocodes.put("29DF", "double-ended multimap");
		mocodes.put("29EF", "error-barred black square");
		mocodes.put("29F4", "rule-delayed");
		mocodes.put("2B45", "leftwards quadruple arrow");
		mocodes.put("2B46", "rightwards quadruple arrow");
		mocodes.put("+", "Plus");
		mocodes.put("-", "Minus");
		mocodes.put("B1", "Plus-Minus");
		mocodes.put("2212", "Minus");
		mocodes.put("2213", "minus-or-plus sign");
		mocodes.put("2214", "dot plus");
		mocodes.put("229E", "squared plus");
		mocodes.put("229F", "squared minus");
		mocodes.put("2211", "n-ary summation");
		mocodes.put("2A0A", "modulo two sum");
		mocodes.put("2A0B", "summation with integral");
		mocodes.put("222C", "double integral");
		mocodes.put("222D", "triple integral");
		mocodes.put("2295", "circled plus");
		mocodes.put("2296", "circled minus");
		mocodes.put("2298", "circled division slash");
		mocodes.put("2A01", "n-ary circled plus operator");
		mocodes.put("222B", "integral");
		mocodes.put("222E", "contour integral");
		mocodes.put("222F", "surface integral");
		mocodes.put("2230", "volume integral");
		mocodes.put("2231", "clockwise integral");
		mocodes.put("2232", "clockwise contour integral");
		mocodes.put("2233", "anticlockwise contour integral");
		mocodes.put("2A0C", "quadruple integral operator");
		mocodes.put("2A0D", "finite part integral");
		mocodes.put("2A0E", "integral with double stroke");
		mocodes.put("2A0F", "integral average with slash");
		mocodes.put("2A10", "circulation function");
		mocodes.put("2A11", "anticlockwise integration");
		mocodes.put("2A12", "line integration with rectangular path around pole");
		mocodes.put("2A13", "line integration with semicircular path around pole");
		mocodes.put("2A14", "line integration not including the pole");
		mocodes.put("2A15", "integral around a point operator");
		mocodes.put("2A16", "quaternion integral operator");
		mocodes.put("2A17", "integral with leftwards arrow with hook");
		mocodes.put("2A18", "integral with times sign");
		mocodes.put("2A19", "integral with intersection");
		mocodes.put("2A1A", "integral with union");
		mocodes.put("2A1B", "integral with overbar");
		mocodes.put("2A1C", "integral with underbar");
		mocodes.put("22C3", "n-ary union");
		mocodes.put("2A03", "n-ary union operator with dot");
		mocodes.put("2A04", "n-ary union operator with plus");
		mocodes.put("22C0", "n-ary logical and");
		mocodes.put("22C1", "n-ary logical or");
		mocodes.put("22C2", "n-ary intersection");
		mocodes.put("2A00", "n-ary circled dot operator");
		mocodes.put("2A02", "n-ary circled times operator");
		mocodes.put("2A05", "n-ary square intersection operator");
		mocodes.put("2A06", "n-ary square union operator");
		mocodes.put("2A07", "two logical and operator");
		mocodes.put("2A08", "two logical or operator");
		mocodes.put("2A09", "n-ary times operator");
		mocodes.put("2AFC", "large triple vertical bar operator");
		mocodes.put("2AFF", "n-ary white vertical bar");
		mocodes.put("2240", "wreath product");
		mocodes.put("220F", "n-ary product");
		mocodes.put("2210", "n-ary coproduct");
		mocodes.put("2229", "intersection");
		mocodes.put("222A", "union");
		mocodes.put("*", "asterisk");
		mocodes.put(".", "point");
		mocodes.put("D7", "multiplication sign");
		mocodes.put("2022", "bullet");
		mocodes.put("2062", "invisible times");
		mocodes.put("22A0", "squared times");
		mocodes.put("22A1", "squared dot operator");
		mocodes.put("22C5", "dot operator");
		mocodes.put("2A2F", "vector or cross product");
		mocodes.put("2A3F", "amalgamation or coproduct");
		mocodes.put("B7", "middle dot");
		mocodes.put("2297", "circled times");
		mocodes.put("%", "percent sign");
		mocodes.put("\"", "reverse solidus");
		mocodes.put("2216", "set minus");
		mocodes.put("/", "solidus");
		mocodes.put("F7", "division sign");
		mocodes.put("2220", "angle");
		mocodes.put("2221", "measured angle");
		mocodes.put("2222", "spherical angle");
		mocodes.put("AC", "not sign");
		mocodes.put("2299", "circled dot operator");
		mocodes.put("2202", "partial differential");
		mocodes.put("2207", "nabla");
		mocodes.put("**", "multiple character operator: **");
		mocodes.put("&lt;>", "multiple character operator: <>");
		mocodes.put("^", "circumflex accent");
		mocodes.put("2032", "prime");
		mocodes.put("266D", "music flat sign");
		mocodes.put("266E", "music natural sign");
		mocodes.put("266F", "music sharp sign");
		mocodes.put("!", "exclamation mark");
		mocodes.put("!!", "multiple character operator: !!");
		mocodes.put("//", "multiple character operator: //");
		mocodes.put("@", "commercial at");
		mocodes.put("?", "question mark");
		mocodes.put("2145", "double-struck italic Upper d");
		mocodes.put("2146", "double-struck italic  d");
		mocodes.put("221A", "square root");
		mocodes.put("221B", "cube root");
		mocodes.put("221C", "fourth root");
		mocodes.put("2061", "function application");
		mocodes.put("&amp", "ampersand");
		mocodes.put("'", "prime");
		mocodes.put("++", "multiple character operator: ++");
		mocodes.put("--", "multiple character operator: --");
		mocodes.put("^", "circumflex accent");
		mocodes.put("_", "low line");
		mocodes.put("`", "grave accent");
		mocodes.put("~", "tilde");
		mocodes.put("A8", "diaeresis");
		mocodes.put("AF", "macron");
		mocodes.put("B0", "degree sign");
		mocodes.put("B4", "acute accent");
		mocodes.put("B8", "cedilla");
		mocodes.put("2C6", "modifier letter circumflex accent");
		mocodes.put("2C7", "caron");
		mocodes.put("2C9", "modifier letter macron");
		mocodes.put("2CA", "modifier letter acute accent");
		mocodes.put("2CB", "modifier letter grave accent");
		mocodes.put("2CD", "modifier letter low macron");
		mocodes.put("2D8", "breve");
		mocodes.put("2D9", "dot above");
		mocodes.put("2DA", "ring above");
		mocodes.put("2DC", " tilde");
		mocodes.put("2DD", "double acute accent");
		mocodes.put("2F7", "modifier letter low tilde");
		mocodes.put("302", "combining circumflex accent");
		mocodes.put("311", "combining inverted breve");
		mocodes.put("203E", "overline");
		mocodes.put("2064", "invisible plus");
		mocodes.put("20DB", "combining three dots above");
		mocodes.put("20DC", "combining four dots above");
		mocodes.put("23B4", "top square bracket");
		mocodes.put("23B5", "bottom square bracket");
		mocodes.put("23DC", "top parenthesis");
		mocodes.put("23DD", "bottom parenthesis");
		mocodes.put("23DE", "top curly bracket");
		mocodes.put("23DF", "bottom curly bracket");
		mocodes.put("23E0", "top tortoise shell bracket");
		mocodes.put("23E1", "bottom tortoise shell bracket");
		mocodes.put("_", "low line");
	}


}
