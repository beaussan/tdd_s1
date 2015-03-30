package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	public static Map<String, Map<String, String>> dataConvert = new HashMap<String, Map<String, String>>();


	static {
		dataConvert.put("fr_FR", new HashMap<String, String>());
		Map<String, String> fr = dataConvert.get("fr_FR");
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
		fr.put("10", "dix");
		fr.put("11", "onze");
		fr.put("12", "douze");
		fr.put("13", "treize");
		fr.put("14", "quatorze");
		fr.put("15", "quinze");
		fr.put("16", "seize");

		dataConvert.put("en_EN", new HashMap<String, String>());
		Map<String, String> en = dataConvert.get("en_EN");
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
		en.put("10", "ten");
		en.put("11", "eleven");
		en.put("12", "twelve");
		en.put("13", "thirteen");
		en.put("14", "fourteen");
		en.put("15", "fifteen");
		en.put("16", "sixteen");


	}

	public static String num2text(String input, String local) {
		return (dataConvert.containsKey(local)) ? (dataConvert.get(local)
				.containsKey(input)) ? dataConvert.get(local).get(input) : null
				: null;
	}

	public static String text2num(String input, String local) {
		Map<String, String> dico = dataConvert.get(local);
		for(String str : dico.keySet()){
			if (dico.get(str).equals(input)) {
				return str;
			}
		}
		return null;
	}
}