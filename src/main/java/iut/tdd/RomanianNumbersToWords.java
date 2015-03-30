package iut.tdd;

import java.text.DecimalFormat;

public class RomanianNumbersToWords {
	private static final String[] tensNames = { "", "zece", "douazeci",
			"treizeci", "patruzeci", "cincizeci", "saizeci", "saptezeci",
			"optzeci", "nouazeci" };
	private static final String[] numNames = { "", "unu", "doi", "trei",
			"patru", "cinci", "sase", "sapte", "opt", "noua", "zece",
			"unsprezece", "doisprezece", "treisprezece", "paisprezece,",
			"cincisprezece", "saisprezece", "saptesprezece", "optsprezece",
			"nouasprezece" };

	public RomanianNumbersToWords() {
	}

	private static String convertLessThanOneThousand(int number) {
		String soFar;
		int original = number;
		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			if (number % 10 != 0)
				soFar = " si " + numNames[number % 10] + " ";
			else
				soFar = numNames[number % 10];
			number /= 10;
			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0) {
			return soFar;
		}
		if (original >= 100 && original <= 199)
			return "o suta " + soFar;
		else if (original >= 200 && original <= 299)
			return "doua sute " + soFar;
		else
			return numNames[number] + " sute " + soFar;
	}

	public static String convert(long number) {
		if (number == 0) {
			return "zero";
		}
		String sNumber = Long.toString(number);
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		sNumber = df.format(number);
		int billions = Integer.parseInt(sNumber.substring(0, 3));
		int millions = Integer.parseInt(sNumber.substring(3, 6));
		int hundredThousands = Integer.parseInt(sNumber.substring(6, 9));
		int thousands = Integer.parseInt(sNumber.substring(9, 12));
		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = " un bilion ";
			break;
		case 2:
			tradBillions = " doua bilioane ";
			break;
		default:
			tradBillions = convertLessThanOneThousand(billions).replaceAll(
					"doi", "doua")
					+ " bilioane ";
		}
		String result = tradBillions;
		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = " un milion ";
			break;
		case 2:
			tradMillions = " doua milioane ";
			break;
		default:
			tradMillions = convertLessThanOneThousand(millions).replaceAll(
					"doi", "doua")
					+ " milioane ";
		}
		result = result + tradMillions;
		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "o mie ";
			break;
		case 2:
			tradHundredThousands = "doua mii ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands)
					.replaceAll("doi", "doua") + " mii ";
		}
		result = result + tradHundredThousands;
		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;
		return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
	}



	public static void main(String[] args) {
		System.out.println(RomanianNumbersToWords.convert(951232567));
	}
}