package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	private static Map<String, String> dataString = new HashMap<String, String>();
	static{
		dataString.put("0", "zero");
		dataString.put("1", "un");
		dataString.put("2", "deux");
		dataString.put("3", "trois");
		dataString.put("4", "quatre");
		dataString.put("5", "cinq");
		dataString.put("6", "six");
		dataString.put("7", "spet");
		dataString.put("8", "huit");
		dataString.put("9", "neuf");
	}
	public static String num2text(String input) {
		return (dataString.containsKey(input)) ? dataString.get(input) : null;
	}

	public static String text2num(String input) {
		if(!dataString.values().contains(input)){
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