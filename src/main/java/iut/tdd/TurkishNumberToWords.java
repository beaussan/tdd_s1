package iut.tdd;

import java.text.DecimalFormat;

public class TurkishNumberToWords {

	private static final String[] tensNames = { "", " on", " yirmi", " otuz",
			" kırk", " elli", " atmış", " yetmiş", " seksen", " doksan" };
	private static final String[] numNames = { "", " bir", " iki", " üç",
			" dört", " beş", " altı", " yedi", " sekiz", " dokuz", " on",
			" onbir", " oniki", " onüç", " ondört", " onbeş", " onaltı",
			" onyedi", " onsekiz", " ondokuz" };

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0) {
			return soFar;
		}
		// return numNames[number] + " hundred" + soFar;
		return numNames[number] + " yüz" + soFar;
	}

	public static String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			// return "zero";
			return "sıfır";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		// case 1: tradBillions = convertLessThanOneThousand(billions) +
		// " billion "; break;
		case 1:
			tradBillions = convertLessThanOneThousand(billions) + " milyar ";
			break;
		// default: tradBillions = convertLessThanOneThousand(billions) +
		// " billion ";
		default:
			tradBillions = convertLessThanOneThousand(billions) + " milyar ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		// case 1: tradMillions = convertLessThanOneThousand(millions) +
		// " million "; break;
		case 1:
			tradMillions = convertLessThanOneThousand(millions) + " milyon ";
			break;
		// default: tradMillions = convertLessThanOneThousand(millions) +
		// " million ";
		default:
			tradMillions = convertLessThanOneThousand(millions) + " milyon ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		// case 1: tradHundredThousands = "one thousand "; break;
		case 1:
			tradHundredThousands = "bin ";
			break;
		// default: tradHundredThousands =
		// convertLessThanOneThousand(hundredThousands) + " thousand ";
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands)
					+ " bin ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ")
				.replaceAll("bir yüz", "yüz").replaceAll("bir bin", "bin");
	}

	/**
	 * testing
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(TurkishNumberToWords.convert(0));
		System.out.println(TurkishNumberToWords.convert(1));
		System.out.println(TurkishNumberToWords.convert(16));
		System.out.println(TurkishNumberToWords.convert(100));
		System.out.println(TurkishNumberToWords.convert(118));
		System.out.println(TurkishNumberToWords.convert(200));
		System.out.println(TurkishNumberToWords.convert(219));
		System.out.println(TurkishNumberToWords.convert(800));
		System.out.println(TurkishNumberToWords.convert(801));
		System.out.println(TurkishNumberToWords.convert(1316));
		System.out.println(TurkishNumberToWords.convert(1000000));
		System.out.println(TurkishNumberToWords.convert(2000000));
		System.out.println(TurkishNumberToWords.convert(3000200));
		System.out.println(TurkishNumberToWords.convert(700000));
		System.out.println(TurkishNumberToWords.convert(9000000));
		System.out.println(TurkishNumberToWords.convert(9001000));
		System.out.println(TurkishNumberToWords.convert(123456789));
		System.out.println(TurkishNumberToWords.convert(2147483647));
		System.out.println(TurkishNumberToWords.convert(3000000010L));

	}
}