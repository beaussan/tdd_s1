package iut.tdd;

import org.junit.Assert;
import org.junit.Test;


public class TestConvertRo {
	String local = "ro_RO";
	
	@Test
	public void test_num2text_0() {
		Assert.assertEquals("\u007a\u0065\u0072\u006f", Convert.num2text("0", local));
	}

	@Test
	public void test_num2text_1() {
		Assert.assertEquals("\u0075\u006e\u0075", Convert.num2text("1", local));
	}

	@Test
	public void test_num2text_2() {
		Assert.assertEquals("\u0064\u006f\u0069", Convert.num2text("2", local));
	}

	@Test
	public void test_num2text_3() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069", Convert.num2text("3", local));
	}

	@Test
	public void test_num2text_4() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075", Convert.num2text("4", local));
	}

	@Test
	public void test_num2text_5() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069", Convert.num2text("5", local));
	}

	@Test
	public void test_num2text_6() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065", Convert.num2text("6", local));
	}

	@Test
	public void test_num2text_7() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065", Convert.num2text("7", local));
	}

	@Test
	public void test_num2text_8() {
		Assert.assertEquals("\u006f\u0070\u0074", Convert.num2text("8", local));
	}

	@Test
	public void test_num2text_9() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061", Convert.num2text("9", local));
	}

	@Test
	public void test_num2text_10() {
		Assert.assertEquals("\u007a\u0065\u0063\u0065", Convert.num2text("10", local));
	}

	@Test
	public void test_num2text_11() {
		Assert.assertEquals("\u0075\u006e\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("11", local));
	}

	@Test
	public void test_num2text_12() {
		Assert.assertEquals("\u0064\u006f\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("12", local));
	}

	@Test
	public void test_num2text_13() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("13", local));
	}

	@Test
	public void test_num2text_14() {
		Assert.assertEquals("\u0070\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065\u002c", Convert.num2text("14", local));
	}

	@Test
	public void test_num2text_15() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("15", local));
	}

	@Test
	public void test_num2text_16() {
		Assert.assertEquals("\u0073\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("16", local));
	}

	@Test
	public void test_num2text_17() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("17", local));
	}

	@Test
	public void test_num2text_18() {
		Assert.assertEquals("\u006f\u0070\u0074\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("18", local));
	}

	@Test
	public void test_num2text_19() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("19", local));
	}

	@Test
	public void test_num2text_20() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("20", local));
	}

	@Test
	public void test_num2text_21() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("21", local));
	}

	@Test
	public void test_num2text_22() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("22", local));
	}

	@Test
	public void test_num2text_23() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("23", local));
	}

	@Test
	public void test_num2text_24() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("24", local));
	}

	@Test
	public void test_num2text_25() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("25", local));
	}

	@Test
	public void test_num2text_26() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("26", local));
	}

	@Test
	public void test_num2text_27() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("27", local));
	}

	@Test
	public void test_num2text_28() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("28", local));
	}

	@Test
	public void test_num2text_29() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("29", local));
	}

	@Test
	public void test_num2text_30() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069", Convert.num2text("30", local));
	}

	@Test
	public void test_num2text_31() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("31", local));
	}

	@Test
	public void test_num2text_32() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("32", local));
	}

	@Test
	public void test_num2text_33() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("33", local));
	}

	@Test
	public void test_num2text_34() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("34", local));
	}

	@Test
	public void test_num2text_35() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("35", local));
	}

	@Test
	public void test_num2text_36() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("36", local));
	}

	@Test
	public void test_num2text_37() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("37", local));
	}

	@Test
	public void test_num2text_38() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("38", local));
	}

	@Test
	public void test_num2text_39() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("39", local));
	}

	@Test
	public void test_num2text_40() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069", Convert.num2text("40", local));
	}

	@Test
	public void test_num2text_41() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("41", local));
	}

	@Test
	public void test_num2text_42() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("42", local));
	}

	@Test
	public void test_num2text_43() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("43", local));
	}

	@Test
	public void test_num2text_44() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("44", local));
	}

	@Test
	public void test_num2text_45() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("45", local));
	}

	@Test
	public void test_num2text_46() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("46", local));
	}

	@Test
	public void test_num2text_47() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("47", local));
	}

	@Test
	public void test_num2text_48() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("48", local));
	}

	@Test
	public void test_num2text_49() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("49", local));
	}

	@Test
	public void test_num2text_50() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069", Convert.num2text("50", local));
	}

	@Test
	public void test_num2text_51() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("51", local));
	}

	@Test
	public void test_num2text_52() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("52", local));
	}

	@Test
	public void test_num2text_53() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("53", local));
	}

	@Test
	public void test_num2text_54() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("54", local));
	}

	@Test
	public void test_num2text_55() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("55", local));
	}

	@Test
	public void test_num2text_56() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("56", local));
	}

	@Test
	public void test_num2text_57() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("57", local));
	}

	@Test
	public void test_num2text_58() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("58", local));
	}

	@Test
	public void test_num2text_59() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("59", local));
	}

	@Test
	public void test_num2text_60() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069", Convert.num2text("60", local));
	}

	@Test
	public void test_num2text_61() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("61", local));
	}

	@Test
	public void test_num2text_62() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("62", local));
	}

	@Test
	public void test_num2text_63() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("63", local));
	}

	@Test
	public void test_num2text_64() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("64", local));
	}

	@Test
	public void test_num2text_65() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("65", local));
	}

	@Test
	public void test_num2text_66() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("66", local));
	}

	@Test
	public void test_num2text_67() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("67", local));
	}

	@Test
	public void test_num2text_68() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("68", local));
	}

	@Test
	public void test_num2text_69() {
		Assert.assertEquals("\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("69", local));
	}

	@Test
	public void test_num2text_70() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069", Convert.num2text("70", local));
	}

	@Test
	public void test_num2text_71() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("71", local));
	}

	@Test
	public void test_num2text_72() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("72", local));
	}

	@Test
	public void test_num2text_73() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("73", local));
	}

	@Test
	public void test_num2text_74() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("74", local));
	}

	@Test
	public void test_num2text_75() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("75", local));
	}

	@Test
	public void test_num2text_76() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("76", local));
	}

	@Test
	public void test_num2text_77() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("77", local));
	}

	@Test
	public void test_num2text_78() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("78", local));
	}

	@Test
	public void test_num2text_79() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("79", local));
	}

	@Test
	public void test_num2text_80() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069", Convert.num2text("80", local));
	}

	@Test
	public void test_num2text_81() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("81", local));
	}

	@Test
	public void test_num2text_82() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("82", local));
	}

	@Test
	public void test_num2text_83() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("83", local));
	}

	@Test
	public void test_num2text_84() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("84", local));
	}

	@Test
	public void test_num2text_85() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("85", local));
	}

	@Test
	public void test_num2text_86() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("86", local));
	}

	@Test
	public void test_num2text_87() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("87", local));
	}

	@Test
	public void test_num2text_88() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("88", local));
	}

	@Test
	public void test_num2text_89() {
		Assert.assertEquals("\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("89", local));
	}

	@Test
	public void test_num2text_90() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("90", local));
	}

	@Test
	public void test_num2text_91() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("91", local));
	}

	@Test
	public void test_num2text_92() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("92", local));
	}

	@Test
	public void test_num2text_93() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("93", local));
	}

	@Test
	public void test_num2text_94() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("94", local));
	}

	@Test
	public void test_num2text_95() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("95", local));
	}

	@Test
	public void test_num2text_96() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("96", local));
	}

	@Test
	public void test_num2text_97() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("97", local));
	}

	@Test
	public void test_num2text_98() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("98", local));
	}

	@Test
	public void test_num2text_99() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("99", local));
	}

	@Test
	public void test_num2text_100() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020", Convert.num2text("100", local));
	}

	@Test
	public void test_num2text_103() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0074\u0072\u0065\u0069", Convert.num2text("103", local));
	}

	@Test
	public void test_num2text_106() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0073\u0065", Convert.num2text("106", local));
	}

	@Test
	public void test_num2text_109() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006e\u006f\u0075\u0061", Convert.num2text("109", local));
	}

	@Test
	public void test_num2text_112() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0064\u006f\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("112", local));
	}

	@Test
	public void test_num2text_115() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0063\u0069\u006e\u0063\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("115", local));
	}

	@Test
	public void test_num2text_118() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006f\u0070\u0074\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("118", local));
	}

	@Test
	public void test_num2text_121() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("121", local));
	}

	@Test
	public void test_num2text_124() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("124", local));
	}

	@Test
	public void test_num2text_127() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("127", local));
	}

	@Test
	public void test_num2text_130() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069", Convert.num2text("130", local));
	}

	@Test
	public void test_num2text_133() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("133", local));
	}

	@Test
	public void test_num2text_136() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("136", local));
	}

	@Test
	public void test_num2text_139() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("139", local));
	}

	@Test
	public void test_num2text_142() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("142", local));
	}

	@Test
	public void test_num2text_145() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("145", local));
	}

	@Test
	public void test_num2text_148() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("148", local));
	}

	@Test
	public void test_num2text_151() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("151", local));
	}

	@Test
	public void test_num2text_154() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("154", local));
	}

	@Test
	public void test_num2text_157() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("157", local));
	}

	@Test
	public void test_num2text_160() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069", Convert.num2text("160", local));
	}

	@Test
	public void test_num2text_163() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("163", local));
	}

	@Test
	public void test_num2text_166() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("166", local));
	}

	@Test
	public void test_num2text_169() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("169", local));
	}

	@Test
	public void test_num2text_172() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("172", local));
	}

	@Test
	public void test_num2text_175() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("175", local));
	}

	@Test
	public void test_num2text_178() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("178", local));
	}

	@Test
	public void test_num2text_181() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("181", local));
	}

	@Test
	public void test_num2text_184() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("184", local));
	}

	@Test
	public void test_num2text_187() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("187", local));
	}

	@Test
	public void test_num2text_190() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("190", local));
	}

	@Test
	public void test_num2text_193() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("193", local));
	}

	@Test
	public void test_num2text_196() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("196", local));
	}

	@Test
	public void test_num2text_199() {
		Assert.assertEquals("\u006f\u0020\u0073\u0075\u0074\u0061\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("199", local));
	}

	@Test
	public void test_num2text_202() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0069", Convert.num2text("202", local));
	}

	@Test
	public void test_num2text_205() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069", Convert.num2text("205", local));
	}

	@Test
	public void test_num2text_208() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074", Convert.num2text("208", local));
	}

	@Test
	public void test_num2text_211() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("211", local));
	}

	@Test
	public void test_num2text_214() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065\u002c", Convert.num2text("214", local));
	}

	@Test
	public void test_num2text_217() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("217", local));
	}

	@Test
	public void test_num2text_220() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("220", local));
	}

	@Test
	public void test_num2text_223() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("223", local));
	}

	@Test
	public void test_num2text_226() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("226", local));
	}

	@Test
	public void test_num2text_229() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("229", local));
	}

	@Test
	public void test_num2text_232() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("232", local));
	}

	@Test
	public void test_num2text_235() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("235", local));
	}

	@Test
	public void test_num2text_238() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("238", local));
	}

	@Test
	public void test_num2text_241() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("241", local));
	}

	@Test
	public void test_num2text_244() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("244", local));
	}

	@Test
	public void test_num2text_247() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("247", local));
	}

	@Test
	public void test_num2text_250() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069", Convert.num2text("250", local));
	}

	@Test
	public void test_num2text_253() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("253", local));
	}

	@Test
	public void test_num2text_256() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("256", local));
	}

	@Test
	public void test_num2text_259() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("259", local));
	}

	@Test
	public void test_num2text_262() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("262", local));
	}

	@Test
	public void test_num2text_265() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("265", local));
	}

	@Test
	public void test_num2text_268() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("268", local));
	}

	@Test
	public void test_num2text_271() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("271", local));
	}

	@Test
	public void test_num2text_274() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("274", local));
	}

	@Test
	public void test_num2text_277() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("277", local));
	}

	@Test
	public void test_num2text_280() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069", Convert.num2text("280", local));
	}

	@Test
	public void test_num2text_283() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("283", local));
	}

	@Test
	public void test_num2text_286() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("286", local));
	}

	@Test
	public void test_num2text_289() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("289", local));
	}

	@Test
	public void test_num2text_292() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("292", local));
	}

	@Test
	public void test_num2text_295() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("295", local));
	}

	@Test
	public void test_num2text_298() {
		Assert.assertEquals("\u0064\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("298", local));
	}

	@Test
	public void test_num2text_301() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0075", Convert.num2text("301", local));
	}

	@Test
	public void test_num2text_304() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075", Convert.num2text("304", local));
	}

	@Test
	public void test_num2text_307() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065", Convert.num2text("307", local));
	}

	@Test
	public void test_num2text_310() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u007a\u0065\u0063\u0065", Convert.num2text("310", local));
	}

	@Test
	public void test_num2text_313() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("313", local));
	}

	@Test
	public void test_num2text_316() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("316", local));
	}

	@Test
	public void test_num2text_319() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("319", local));
	}

	@Test
	public void test_num2text_322() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("322", local));
	}

	@Test
	public void test_num2text_325() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("325", local));
	}

	@Test
	public void test_num2text_328() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("328", local));
	}

	@Test
	public void test_num2text_331() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("331", local));
	}

	@Test
	public void test_num2text_334() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("334", local));
	}

	@Test
	public void test_num2text_337() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("337", local));
	}

	@Test
	public void test_num2text_340() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069", Convert.num2text("340", local));
	}

	@Test
	public void test_num2text_343() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("343", local));
	}

	@Test
	public void test_num2text_346() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("346", local));
	}

	@Test
	public void test_num2text_349() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("349", local));
	}

	@Test
	public void test_num2text_352() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("352", local));
	}

	@Test
	public void test_num2text_355() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("355", local));
	}

	@Test
	public void test_num2text_358() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("358", local));
	}

	@Test
	public void test_num2text_361() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("361", local));
	}

	@Test
	public void test_num2text_364() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("364", local));
	}

	@Test
	public void test_num2text_367() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("367", local));
	}

	@Test
	public void test_num2text_370() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069", Convert.num2text("370", local));
	}

	@Test
	public void test_num2text_373() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("373", local));
	}

	@Test
	public void test_num2text_376() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("376", local));
	}

	@Test
	public void test_num2text_379() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("379", local));
	}

	@Test
	public void test_num2text_382() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("382", local));
	}

	@Test
	public void test_num2text_385() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("385", local));
	}

	@Test
	public void test_num2text_388() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("388", local));
	}

	@Test
	public void test_num2text_391() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("391", local));
	}

	@Test
	public void test_num2text_394() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("394", local));
	}

	@Test
	public void test_num2text_397() {
		Assert.assertEquals("\u0074\u0072\u0065\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("397", local));
	}

	@Test
	public void test_num2text_400() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020", Convert.num2text("400", local));
	}

	@Test
	public void test_num2text_403() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069", Convert.num2text("403", local));
	}

	@Test
	public void test_num2text_406() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0073\u0065", Convert.num2text("406", local));
	}

	@Test
	public void test_num2text_409() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061", Convert.num2text("409", local));
	}

	@Test
	public void test_num2text_412() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("412", local));
	}

	@Test
	public void test_num2text_415() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("415", local));
	}

	@Test
	public void test_num2text_418() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("418", local));
	}

	@Test
	public void test_num2text_421() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("421", local));
	}

	@Test
	public void test_num2text_424() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("424", local));
	}

	@Test
	public void test_num2text_427() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("427", local));
	}

	@Test
	public void test_num2text_430() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069", Convert.num2text("430", local));
	}

	@Test
	public void test_num2text_433() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("433", local));
	}

	@Test
	public void test_num2text_436() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("436", local));
	}

	@Test
	public void test_num2text_439() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("439", local));
	}

	@Test
	public void test_num2text_442() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("442", local));
	}

	@Test
	public void test_num2text_445() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("445", local));
	}

	@Test
	public void test_num2text_448() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("448", local));
	}

	@Test
	public void test_num2text_451() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("451", local));
	}

	@Test
	public void test_num2text_454() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("454", local));
	}

	@Test
	public void test_num2text_457() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("457", local));
	}

	@Test
	public void test_num2text_460() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069", Convert.num2text("460", local));
	}

	@Test
	public void test_num2text_463() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("463", local));
	}

	@Test
	public void test_num2text_466() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("466", local));
	}

	@Test
	public void test_num2text_469() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("469", local));
	}

	@Test
	public void test_num2text_472() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("472", local));
	}

	@Test
	public void test_num2text_475() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("475", local));
	}

	@Test
	public void test_num2text_478() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("478", local));
	}

	@Test
	public void test_num2text_481() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("481", local));
	}

	@Test
	public void test_num2text_484() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("484", local));
	}

	@Test
	public void test_num2text_487() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("487", local));
	}

	@Test
	public void test_num2text_490() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("490", local));
	}

	@Test
	public void test_num2text_493() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("493", local));
	}

	@Test
	public void test_num2text_496() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("496", local));
	}

	@Test
	public void test_num2text_499() {
		Assert.assertEquals("\u0070\u0061\u0074\u0072\u0075\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("499", local));
	}

	@Test
	public void test_num2text_502() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0069", Convert.num2text("502", local));
	}

	@Test
	public void test_num2text_505() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069", Convert.num2text("505", local));
	}

	@Test
	public void test_num2text_508() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074", Convert.num2text("508", local));
	}

	@Test
	public void test_num2text_511() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("511", local));
	}

	@Test
	public void test_num2text_514() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065\u002c", Convert.num2text("514", local));
	}

	@Test
	public void test_num2text_517() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("517", local));
	}

	@Test
	public void test_num2text_520() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("520", local));
	}

	@Test
	public void test_num2text_523() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("523", local));
	}

	@Test
	public void test_num2text_526() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("526", local));
	}

	@Test
	public void test_num2text_529() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("529", local));
	}

	@Test
	public void test_num2text_532() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("532", local));
	}

	@Test
	public void test_num2text_535() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("535", local));
	}

	@Test
	public void test_num2text_538() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("538", local));
	}

	@Test
	public void test_num2text_541() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("541", local));
	}

	@Test
	public void test_num2text_544() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("544", local));
	}

	@Test
	public void test_num2text_547() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("547", local));
	}

	@Test
	public void test_num2text_550() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069", Convert.num2text("550", local));
	}

	@Test
	public void test_num2text_553() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("553", local));
	}

	@Test
	public void test_num2text_556() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("556", local));
	}

	@Test
	public void test_num2text_559() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("559", local));
	}

	@Test
	public void test_num2text_562() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("562", local));
	}

	@Test
	public void test_num2text_565() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("565", local));
	}

	@Test
	public void test_num2text_568() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("568", local));
	}

	@Test
	public void test_num2text_571() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("571", local));
	}

	@Test
	public void test_num2text_574() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("574", local));
	}

	@Test
	public void test_num2text_577() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("577", local));
	}

	@Test
	public void test_num2text_580() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069", Convert.num2text("580", local));
	}

	@Test
	public void test_num2text_583() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("583", local));
	}

	@Test
	public void test_num2text_586() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("586", local));
	}

	@Test
	public void test_num2text_589() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("589", local));
	}

	@Test
	public void test_num2text_592() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("592", local));
	}

	@Test
	public void test_num2text_595() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("595", local));
	}

	@Test
	public void test_num2text_598() {
		Assert.assertEquals("\u0063\u0069\u006e\u0063\u0069\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("598", local));
	}

	@Test
	public void test_num2text_601() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0075", Convert.num2text("601", local));
	}

	@Test
	public void test_num2text_604() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075", Convert.num2text("604", local));
	}

	@Test
	public void test_num2text_607() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065", Convert.num2text("607", local));
	}

	@Test
	public void test_num2text_610() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u007a\u0065\u0063\u0065", Convert.num2text("610", local));
	}

	@Test
	public void test_num2text_613() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("613", local));
	}

	@Test
	public void test_num2text_616() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("616", local));
	}

	@Test
	public void test_num2text_619() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("619", local));
	}

	@Test
	public void test_num2text_622() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("622", local));
	}

	@Test
	public void test_num2text_625() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("625", local));
	}

	@Test
	public void test_num2text_628() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("628", local));
	}

	@Test
	public void test_num2text_631() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("631", local));
	}

	@Test
	public void test_num2text_634() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("634", local));
	}

	@Test
	public void test_num2text_637() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("637", local));
	}

	@Test
	public void test_num2text_640() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069", Convert.num2text("640", local));
	}

	@Test
	public void test_num2text_643() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("643", local));
	}

	@Test
	public void test_num2text_646() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("646", local));
	}

	@Test
	public void test_num2text_649() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("649", local));
	}

	@Test
	public void test_num2text_652() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("652", local));
	}

	@Test
	public void test_num2text_655() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("655", local));
	}

	@Test
	public void test_num2text_658() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("658", local));
	}

	@Test
	public void test_num2text_661() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("661", local));
	}

	@Test
	public void test_num2text_664() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("664", local));
	}

	@Test
	public void test_num2text_667() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("667", local));
	}

	@Test
	public void test_num2text_670() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069", Convert.num2text("670", local));
	}

	@Test
	public void test_num2text_673() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("673", local));
	}

	@Test
	public void test_num2text_676() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("676", local));
	}

	@Test
	public void test_num2text_679() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("679", local));
	}

	@Test
	public void test_num2text_682() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("682", local));
	}

	@Test
	public void test_num2text_685() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("685", local));
	}

	@Test
	public void test_num2text_688() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("688", local));
	}

	@Test
	public void test_num2text_691() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("691", local));
	}

	@Test
	public void test_num2text_694() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("694", local));
	}

	@Test
	public void test_num2text_697() {
		Assert.assertEquals("\u0073\u0061\u0073\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("697", local));
	}

	@Test
	public void test_num2text_700() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020", Convert.num2text("700", local));
	}

	@Test
	public void test_num2text_703() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069", Convert.num2text("703", local));
	}

	@Test
	public void test_num2text_706() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0073\u0065", Convert.num2text("706", local));
	}

	@Test
	public void test_num2text_709() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061", Convert.num2text("709", local));
	}

	@Test
	public void test_num2text_712() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("712", local));
	}

	@Test
	public void test_num2text_715() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("715", local));
	}

	@Test
	public void test_num2text_718() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("718", local));
	}

	@Test
	public void test_num2text_721() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("721", local));
	}

	@Test
	public void test_num2text_724() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("724", local));
	}

	@Test
	public void test_num2text_727() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("727", local));
	}

	@Test
	public void test_num2text_730() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069", Convert.num2text("730", local));
	}

	@Test
	public void test_num2text_733() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("733", local));
	}

	@Test
	public void test_num2text_736() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("736", local));
	}

	@Test
	public void test_num2text_739() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("739", local));
	}

	@Test
	public void test_num2text_742() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("742", local));
	}

	@Test
	public void test_num2text_745() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("745", local));
	}

	@Test
	public void test_num2text_748() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("748", local));
	}

	@Test
	public void test_num2text_751() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("751", local));
	}

	@Test
	public void test_num2text_754() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("754", local));
	}

	@Test
	public void test_num2text_757() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("757", local));
	}

	@Test
	public void test_num2text_760() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069", Convert.num2text("760", local));
	}

	@Test
	public void test_num2text_763() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("763", local));
	}

	@Test
	public void test_num2text_766() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("766", local));
	}

	@Test
	public void test_num2text_769() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("769", local));
	}

	@Test
	public void test_num2text_772() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("772", local));
	}

	@Test
	public void test_num2text_775() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("775", local));
	}

	@Test
	public void test_num2text_778() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("778", local));
	}

	@Test
	public void test_num2text_781() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("781", local));
	}

	@Test
	public void test_num2text_784() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("784", local));
	}

	@Test
	public void test_num2text_787() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("787", local));
	}

	@Test
	public void test_num2text_790() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("790", local));
	}

	@Test
	public void test_num2text_793() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("793", local));
	}

	@Test
	public void test_num2text_796() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("796", local));
	}

	@Test
	public void test_num2text_799() {
		Assert.assertEquals("\u0073\u0061\u0070\u0074\u0065\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("799", local));
	}

	@Test
	public void test_num2text_802() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0069", Convert.num2text("802", local));
	}

	@Test
	public void test_num2text_805() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069", Convert.num2text("805", local));
	}

	@Test
	public void test_num2text_808() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074", Convert.num2text("808", local));
	}

	@Test
	public void test_num2text_811() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("811", local));
	}

	@Test
	public void test_num2text_814() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065\u002c", Convert.num2text("814", local));
	}

	@Test
	public void test_num2text_817() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("817", local));
	}

	@Test
	public void test_num2text_820() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069", Convert.num2text("820", local));
	}

	@Test
	public void test_num2text_823() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("823", local));
	}

	@Test
	public void test_num2text_826() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("826", local));
	}

	@Test
	public void test_num2text_829() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("829", local));
	}

	@Test
	public void test_num2text_832() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("832", local));
	}

	@Test
	public void test_num2text_835() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("835", local));
	}

	@Test
	public void test_num2text_838() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("838", local));
	}

	@Test
	public void test_num2text_841() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("841", local));
	}

	@Test
	public void test_num2text_844() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("844", local));
	}

	@Test
	public void test_num2text_847() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("847", local));
	}

	@Test
	public void test_num2text_850() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069", Convert.num2text("850", local));
	}

	@Test
	public void test_num2text_853() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("853", local));
	}

	@Test
	public void test_num2text_856() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("856", local));
	}

	@Test
	public void test_num2text_859() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("859", local));
	}

	@Test
	public void test_num2text_862() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("862", local));
	}

	@Test
	public void test_num2text_865() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("865", local));
	}

	@Test
	public void test_num2text_868() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("868", local));
	}

	@Test
	public void test_num2text_871() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("871", local));
	}

	@Test
	public void test_num2text_874() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("874", local));
	}

	@Test
	public void test_num2text_877() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("877", local));
	}

	@Test
	public void test_num2text_880() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069", Convert.num2text("880", local));
	}

	@Test
	public void test_num2text_883() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("883", local));
	}

	@Test
	public void test_num2text_886() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("886", local));
	}

	@Test
	public void test_num2text_889() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("889", local));
	}

	@Test
	public void test_num2text_892() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("892", local));
	}

	@Test
	public void test_num2text_895() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("895", local));
	}

	@Test
	public void test_num2text_898() {
		Assert.assertEquals("\u006f\u0070\u0074\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("898", local));
	}

	@Test
	public void test_num2text_901() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0075\u006e\u0075", Convert.num2text("901", local));
	}

	@Test
	public void test_num2text_904() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075", Convert.num2text("904", local));
	}

	@Test
	public void test_num2text_907() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065", Convert.num2text("907", local));
	}

	@Test
	public void test_num2text_910() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u007a\u0065\u0063\u0065", Convert.num2text("910", local));
	}

	@Test
	public void test_num2text_913() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("913", local));
	}

	@Test
	public void test_num2text_916() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("916", local));
	}

	@Test
	public void test_num2text_919() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u0073\u0070\u0072\u0065\u007a\u0065\u0063\u0065", Convert.num2text("919", local));
	}

	@Test
	public void test_num2text_922() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("922", local));
	}

	@Test
	public void test_num2text_925() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("925", local));
	}

	@Test
	public void test_num2text_928() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0064\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("928", local));
	}

	@Test
	public void test_num2text_931() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("931", local));
	}

	@Test
	public void test_num2text_934() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("934", local));
	}

	@Test
	public void test_num2text_937() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0074\u0072\u0065\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("937", local));
	}

	@Test
	public void test_num2text_940() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069", Convert.num2text("940", local));
	}

	@Test
	public void test_num2text_943() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("943", local));
	}

	@Test
	public void test_num2text_946() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("946", local));
	}

	@Test
	public void test_num2text_949() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0070\u0061\u0074\u0072\u0075\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("949", local));
	}

	@Test
	public void test_num2text_952() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("952", local));
	}

	@Test
	public void test_num2text_955() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("955", local));
	}

	@Test
	public void test_num2text_958() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0063\u0069\u006e\u0063\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("958", local));
	}

	@Test
	public void test_num2text_961() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("961", local));
	}

	@Test
	public void test_num2text_964() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("964", local));
	}

	@Test
	public void test_num2text_967() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0069\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("967", local));
	}

	@Test
	public void test_num2text_970() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069", Convert.num2text("970", local));
	}

	@Test
	public void test_num2text_973() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0074\u0072\u0065\u0069\u0020", Convert.num2text("973", local));
	}

	@Test
	public void test_num2text_976() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0073\u0065\u0020", Convert.num2text("976", local));
	}

	@Test
	public void test_num2text_979() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u0073\u0061\u0070\u0074\u0065\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006e\u006f\u0075\u0061\u0020", Convert.num2text("979", local));
	}

	@Test
	public void test_num2text_982() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0064\u006f\u0069\u0020", Convert.num2text("982", local));
	}

	@Test
	public void test_num2text_985() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0063\u0069\u006e\u0063\u0069\u0020", Convert.num2text("985", local));
	}

	@Test
	public void test_num2text_988() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006f\u0070\u0074\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u006f\u0070\u0074\u0020", Convert.num2text("988", local));
	}

	@Test
	public void test_num2text_991() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0075\u006e\u0075\u0020", Convert.num2text("991", local));
	}

	@Test
	public void test_num2text_994() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0070\u0061\u0074\u0072\u0075\u0020", Convert.num2text("994", local));
	}

	@Test
	public void test_num2text_997() {
		Assert.assertEquals("\u006e\u006f\u0075\u0061\u0020\u0073\u0075\u0074\u0065\u0020\u006e\u006f\u0075\u0061\u007a\u0065\u0063\u0069\u0020\u0073\u0069\u0020\u0073\u0061\u0070\u0074\u0065\u0020", Convert.num2text("997", local));
	}


}
