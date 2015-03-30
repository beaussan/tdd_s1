package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	private static Map<String, Map<String, String>> dataConvert = new HashMap<String, Map<String, String>>();

	private static Map<String, String> dataString = new HashMap<String, String>();

	static {
		dataConvert.put("FR_fr", new HashMap<String, String>());
		Map<String, String> fr = dataConvert.get("FR_fr");
		fr.put("0", "zero");
		fr.put("1", "un");
		fr.put("2", "deux");
		fr.put("3", "trois");
		fr.put("4", "quatre");
		fr.put("5", "cinq");
		fr.put("6", "six");
		fr.put("7", "sept");
		fr.put("8", "huit");
		fr.put("9", "neuf");

		dataConvert.put("EN_en", new HashMap<String, String>());
		Map<String, String> en = dataConvert.get("EN_en");
		en.put("0", "zero");
		en.put("1", "one");
		en.put("2", "two");
		en.put("3", "three");
		en.put("4", "four");
		en.put("5", "five");
		en.put("6", "six");
		en.put("7", "seven");
		en.put("8", "eight");
		en.put("9", "nine");

	}

	public static String num2text(String input, String local) {
		return (dataConvert.containsKey(local)) ? (dataConvert.get(local)
				.containsKey(input)) ? dataConvert.get(local).get(input) : null
				: null;
	}

	public static String text2num(String input, String local) {
		if (!dataString.values().contains(input)) {
			return null;
		}
		for (String str : dataString.keySet()) {
			if (dataString.get(str).equals(input)) {
				return str;
			}
		}
		return null;
	}
}