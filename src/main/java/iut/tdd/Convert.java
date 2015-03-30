package iut.tdd;

public class Convert {

	private static boolean canConvert(String input) {
		return input.matches("\\d+.\\d+");
	}

	public static String num2text(String input, String local) {
		if (!canConvert(input)) {
			return null;
		}
		Float num = new Float(input);
		int pos = (int) Math.floor(num);
		int min = (int) Math.floor((num - pos) * 100.0f);
		switch (local) {
		case "fr_FR":
			return FrenchNumberToWords.convert(pos)
					+ ((min == 0) ? "" : "." + FrenchNumberToWords.convert(min));
		case "en_EN":
			return EnglishNumberToWords.convert(pos)
					+ ((min == 0) ? "" : "."
							+ EnglishNumberToWords.convert(min));
		case "tu_TU":
			return TurkishNumberToWords.convert(pos)
					+ ((min == 0) ? "" : "."
							+ TurkishNumberToWords.convert(min));
		case "ro_RO":
			return RomanianNumbersToWords.convert(pos)
					+ ((min == 0) ? "" : "."
							+ RomanianNumbersToWords.convert(min));
		default:
			break;
		}
		return null;
	}

	public static String text2num(String input, String local) {

		return null;
	}

	public static String unicodeNumb(String in) {
		String ret = "";
		for (int i = 0; i < in.length(); i++) {
			ret += "\\u"
					+ Integer.toHexString(in.charAt(i) | 0x10000).substring(1);
		}
		return ret;
	}

}