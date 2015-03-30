package iut.tdd;

public class Convert {

	public static String num2text(String input, String local) {
		String sep = ".";
		String in = input.replace(" ", "");
		in = in.replace(",", ".");
		String out = "";
		if (in.endsWith("€")) {
			sep = "euro";
			in = in.replace("€", "");
			out = "centimes";
		}
		if (in.endsWith("$")) {
			sep = "dolards";
			in = in.replace("$", "");
			out = "cent";
		}
		if (in.endsWith("£")) {
			sep = "livre";
			in = in.replace("£", "");
			out = "pounds";
		}
		return num2text(in, local, sep, out);
	}
	
	public static void main(String[] args) {
		System.out.println(num2text("52,20 €", "fr_FR"));
	}
	
	public static String num2text(String input, String local, String separatorMidl, String sepEnd){
		
		Float num;
		try {
			num = new Float(input);
		} catch (NumberFormatException e) {
			return null;
		}
		int pos = (int) Math.floor(num);
		int min = (int) Math.floor((num - pos) * 100.0f);
		String tmp = "";
		switch (local) {
		case "fr_FR":
			tmp = FrenchNumberToWords.convert(pos);
			if (min != 0) {
				tmp += " " + separatorMidl + " et " + FrenchNumberToWords.convert(min) + ' ' + sepEnd;
			}else{
				if (separatorMidl !=".") {
					tmp += ' ' + separatorMidl;
				}
			}
			return tmp;
		case "en_EN":
			tmp = EnglishNumberToWords.convert(pos);
			if (min != 0) {
				tmp += " " + separatorMidl + " et " + EnglishNumberToWords.convert(min) + ' ' + sepEnd;
			}else{
				if (separatorMidl !=".") {
					tmp += ' ' + separatorMidl;
				}
			}
			return tmp;
		case "tu_TU":
			tmp = TurkishNumberToWords.convert(pos);
			if (min != 0) {
				tmp += " " + separatorMidl + " et " + TurkishNumberToWords.convert(min) + ' ' + sepEnd;
			}else{
				if (separatorMidl !=".") {
					tmp += ' ' + separatorMidl;
				}
			}
			return tmp;
		case "ro_RO":
			tmp = RomanianNumbersToWords.convert(pos);
			if (min != 0) {
				tmp += " " + separatorMidl + " et " + RomanianNumbersToWords.convert(min) + ' ' + sepEnd;
			}else{
				if (separatorMidl !=".") {
					tmp += separatorMidl;
				}
			}
			return tmp;
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