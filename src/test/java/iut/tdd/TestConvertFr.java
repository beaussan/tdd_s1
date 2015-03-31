package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestConvertFr {

	String local = "fr_FR";

	@Test
	public void test_num2text_zéro() {
		Assert.assertEquals("zéro", Convert.num2text("0", local));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1", local));
	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2", local));
	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3", local));
	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4", local));
	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5", local));
	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6", local));
	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7", local));
	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8", local));
	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("neuf", Convert.num2text("9", local));
	}

	@Test
	public void test_num2text_dix() {
		Assert.assertEquals("dix", Convert.num2text("10", local));
	}

	@Test
	public void test_num2text_onze() {
		Assert.assertEquals("onze", Convert.num2text("11", local));
	}

	@Test
	public void test_num2text_douze() {
		Assert.assertEquals("douze", Convert.num2text("12", local));
	}

	@Test
	public void test_num2text_treize() {
		Assert.assertEquals("treize", Convert.num2text("13", local));
	}

	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals("quatorze", Convert.num2text("14", local));
	}

	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals("quinze", Convert.num2text("15", local));
	}

	@Test
	public void test_num2text_seize() {
		Assert.assertEquals("seize", Convert.num2text("16", local));
	}

	@Test
	public void test_num2text_dix_sept() {
		Assert.assertEquals("dix-sept", Convert.num2text("17", local));
	}

	@Test
	public void test_num2text_dix_huit() {
		Assert.assertEquals("dix-huit", Convert.num2text("18", local));
	}

	@Test
	public void test_num2text_dix_neuf() {
		Assert.assertEquals("dix-neuf", Convert.num2text("19", local));
	}

	@Test
	public void test_num2text_vingt() {
		Assert.assertEquals("vingt", Convert.num2text("20", local));
	}

	@Test
	public void test_num2text_vingt_et_un() {
		Assert.assertEquals("vingt et un", Convert.num2text("21", local));
	}

	@Test
	public void test_num2text_vingt_deux() {
		Assert.assertEquals("vingt-deux", Convert.num2text("22", local));
	}

	@Test
	public void test_num2text_vingt_trois() {
		Assert.assertEquals("vingt-trois", Convert.num2text("23", local));
	}

	@Test
	public void test_num2text_vingt_quatre() {
		Assert.assertEquals("vingt-quatre", Convert.num2text("24", local));
	}

	@Test
	public void test_num2text_vingt_cinq() {
		Assert.assertEquals("vingt-cinq", Convert.num2text("25", local));
	}

	@Test
	public void test_num2text_vingt_six() {
		Assert.assertEquals("vingt-six", Convert.num2text("26", local));
	}

	@Test
	public void test_num2text_vingt_sept() {
		Assert.assertEquals("vingt-sept", Convert.num2text("27", local));
	}

	@Test
	public void test_num2text_vingt_huit() {
		Assert.assertEquals("vingt-huit", Convert.num2text("28", local));
	}

	@Test
	public void test_num2text_vingt_neuf() {
		Assert.assertEquals("vingt-neuf", Convert.num2text("29", local));
	}

	@Test
	public void test_num2text_trente() {
		Assert.assertEquals("trente", Convert.num2text("30", local));
	}

	@Test
	public void test_num2text_trente_et_un() {
		Assert.assertEquals("trente et un", Convert.num2text("31", local));
	}

	@Test
	public void test_num2text_trente_deux() {
		Assert.assertEquals("trente-deux", Convert.num2text("32", local));
	}

	@Test
	public void test_num2text_trente_trois() {
		Assert.assertEquals("trente-trois", Convert.num2text("33", local));
	}

	@Test
	public void test_num2text_trente_quatre() {
		Assert.assertEquals("trente-quatre", Convert.num2text("34", local));
	}

	@Test
	public void test_num2text_trente_cinq() {
		Assert.assertEquals("trente-cinq", Convert.num2text("35", local));
	}

	@Test
	public void test_num2text_trente_six() {
		Assert.assertEquals("trente-six", Convert.num2text("36", local));
	}

	@Test
	public void test_num2text_trente_sept() {
		Assert.assertEquals("trente-sept", Convert.num2text("37", local));
	}

	@Test
	public void test_num2text_trente_huit() {
		Assert.assertEquals("trente-huit", Convert.num2text("38", local));
	}

	@Test
	public void test_num2text_trente_neuf() {
		Assert.assertEquals("trente-neuf", Convert.num2text("39", local));
	}

	@Test
	public void test_num2text_quarante() {
		Assert.assertEquals("quarante", Convert.num2text("40", local));
	}

	@Test
	public void test_num2text_quarante_et_un() {
		Assert.assertEquals("quarante et un", Convert.num2text("41", local));
	}

	@Test
	public void test_num2text_quarante_deux() {
		Assert.assertEquals("quarante-deux", Convert.num2text("42", local));
	}

	@Test
	public void test_num2text_quarante_trois() {
		Assert.assertEquals("quarante-trois", Convert.num2text("43", local));
	}

	@Test
	public void test_num2text_quarante_quatre() {
		Assert.assertEquals("quarante-quatre", Convert.num2text("44", local));
	}

	@Test
	public void test_num2text_quarante_cinq() {
		Assert.assertEquals("quarante-cinq", Convert.num2text("45", local));
	}

	@Test
	public void test_num2text_quarante_six() {
		Assert.assertEquals("quarante-six", Convert.num2text("46", local));
	}

	@Test
	public void test_num2text_quarante_sept() {
		Assert.assertEquals("quarante-sept", Convert.num2text("47", local));
	}

	@Test
	public void test_num2text_quarante_huit() {
		Assert.assertEquals("quarante-huit", Convert.num2text("48", local));
	}

	@Test
	public void test_num2text_quarante_neuf() {
		Assert.assertEquals("quarante-neuf", Convert.num2text("49", local));
	}

	@Test
	public void test_num2text_cinquante() {
		Assert.assertEquals("cinquante", Convert.num2text("50", local));
	}

	@Test
	public void test_num2text_cinquante_et_un() {
		Assert.assertEquals("cinquante et un", Convert.num2text("51", local));
	}

	@Test
	public void test_num2text_cinquante_deux() {
		Assert.assertEquals("cinquante-deux", Convert.num2text("52", local));
	}

	@Test
	public void test_num2text_cinquante_trois() {
		Assert.assertEquals("cinquante-trois", Convert.num2text("53", local));
	}

	@Test
	public void test_num2text_cinquante_quatre() {
		Assert.assertEquals("cinquante-quatre", Convert.num2text("54", local));
	}

	@Test
	public void test_num2text_cinquante_cinq() {
		Assert.assertEquals("cinquante-cinq", Convert.num2text("55", local));
	}

	@Test
	public void test_num2text_cinquante_six() {
		Assert.assertEquals("cinquante-six", Convert.num2text("56", local));
	}

	@Test
	public void test_num2text_cinquante_sept() {
		Assert.assertEquals("cinquante-sept", Convert.num2text("57", local));
	}

	@Test
	public void test_num2text_cinquante_huit() {
		Assert.assertEquals("cinquante-huit", Convert.num2text("58", local));
	}

	@Test
	public void test_num2text_cinquante_neuf() {
		Assert.assertEquals("cinquante-neuf", Convert.num2text("59", local));
	}

	@Test
	public void test_num2text_soixante() {
		Assert.assertEquals("soixante", Convert.num2text("60", local));
	}

	@Test
	public void test_num2text_soixante_et_un() {
		Assert.assertEquals("soixante et un", Convert.num2text("61", local));
	}

	@Test
	public void test_num2text_soixante_deux() {
		Assert.assertEquals("soixante-deux", Convert.num2text("62", local));
	}

	@Test
	public void test_num2text_soixante_trois() {
		Assert.assertEquals("soixante-trois", Convert.num2text("63", local));
	}

	@Test
	public void test_num2text_soixante_quatre() {
		Assert.assertEquals("soixante-quatre", Convert.num2text("64", local));
	}

	@Test
	public void test_num2text_soixante_cinq() {
		Assert.assertEquals("soixante-cinq", Convert.num2text("65", local));
	}

	@Test
	public void test_num2text_soixante_six() {
		Assert.assertEquals("soixante-six", Convert.num2text("66", local));
	}

	@Test
	public void test_num2text_soixante_sept() {
		Assert.assertEquals("soixante-sept", Convert.num2text("67", local));
	}

	@Test
	public void test_num2text_soixante_huit() {
		Assert.assertEquals("soixante-huit", Convert.num2text("68", local));
	}

	@Test
	public void test_num2text_soixante_neuf() {
		Assert.assertEquals("soixante-neuf", Convert.num2text("69", local));
	}

	@Test
	public void test_num2text_soixante_dix() {
		Assert.assertEquals("soixante-dix", Convert.num2text("70", local));
	}

	@Test
	public void test_num2text_soixante_et_onze() {
		Assert.assertEquals("soixante et onze", Convert.num2text("71", local));
	}

	@Test
	public void test_num2text_soixante_douze() {
		Assert.assertEquals("soixante-douze", Convert.num2text("72", local));
	}

	@Test
	public void test_num2text_soixante_treize() {
		Assert.assertEquals("soixante-treize", Convert.num2text("73", local));
	}

	@Test
	public void test_num2text_soixante_quatorze() {
		Assert.assertEquals("soixante-quatorze", Convert.num2text("74", local));
	}

	@Test
	public void test_num2text_soixante_quinze() {
		Assert.assertEquals("soixante-quinze", Convert.num2text("75", local));
	}

	@Test
	public void test_num2text_soixante_seize() {
		Assert.assertEquals("soixante-seize", Convert.num2text("76", local));
	}

	@Test
	public void test_num2text_soixante_dix_sept() {
		Assert.assertEquals("soixante-dix-sept", Convert.num2text("77", local));
	}

	@Test
	public void test_num2text_soixante_dix_huit() {
		Assert.assertEquals("soixante-dix-huit", Convert.num2text("78", local));
	}

	@Test
	public void test_num2text_soixante_dix_neuf() {
		Assert.assertEquals("soixante-dix-neuf", Convert.num2text("79", local));
	}

	@Test
	public void test_num2text_quatre_vingt() {
		Assert.assertEquals("quatre-vingt", Convert.num2text("80", local));
	}

	@Test
	public void test_num2text_quatre_vingt_un() {
		Assert.assertEquals("quatre-vingt-un", Convert.num2text("81", local));
	}

	@Test
	public void test_num2text_quatre_vingt_deux() {
		Assert.assertEquals("quatre-vingt-deux", Convert.num2text("82", local));
	}

	@Test
	public void test_num2text_quatre_vingt_trois() {
		Assert.assertEquals("quatre-vingt-trois", Convert.num2text("83", local));
	}

	@Test
	public void test_num2text_quatre_vingt_quatre() {
		Assert.assertEquals("quatre-vingt-quatre",
				Convert.num2text("84", local));
	}

	@Test
	public void test_num2text_quatre_vingt_cinq() {
		Assert.assertEquals("quatre-vingt-cinq", Convert.num2text("85", local));
	}

	@Test
	public void test_num2text_quatre_vingt_six() {
		Assert.assertEquals("quatre-vingt-six", Convert.num2text("86", local));
	}

	@Test
	public void test_num2text_quatre_vingt_sept() {
		Assert.assertEquals("quatre-vingt-sept", Convert.num2text("87", local));
	}

	@Test
	public void test_num2text_quatre_vingt_huit() {
		Assert.assertEquals("quatre-vingt-huit", Convert.num2text("88", local));
	}

	@Test
	public void test_num2text_quatre_vingt_neuf() {
		Assert.assertEquals("quatre-vingt-neuf", Convert.num2text("89", local));
	}

	@Test
	public void test_num2text_quatre_vingt_dix() {
		Assert.assertEquals("quatre-vingt-dix", Convert.num2text("90", local));
	}

	@Test
	public void test_num2text_quatre_vingt_onze() {
		Assert.assertEquals("quatre-vingt-onze", Convert.num2text("91", local));
	}

	@Test
	public void test_num2text_quatre_vingt_douze() {
		Assert.assertEquals("quatre-vingt-douze", Convert.num2text("92", local));
	}

	@Test
	public void test_num2text_quatre_vingt_treize() {
		Assert.assertEquals("quatre-vingt-treize",
				Convert.num2text("93", local));
	}

	@Test
	public void test_num2text_quatre_vingt_quatorze() {
		Assert.assertEquals("quatre-vingt-quatorze",
				Convert.num2text("94", local));
	}

	@Test
	public void test_num2text_quatre_vingt_quinze() {
		Assert.assertEquals("quatre-vingt-quinze",
				Convert.num2text("95", local));
	}

	@Test
	public void test_num2text_quatre_vingt_seize() {
		Assert.assertEquals("quatre-vingt-seize", Convert.num2text("96", local));
	}

	@Test
	public void test_num2text_quatre_vingt_dix_sept() {
		Assert.assertEquals("quatre-vingt-dix-sept",
				Convert.num2text("97", local));
	}

	@Test
	public void test_num2text_quatre_vingt_dix_huit() {
		Assert.assertEquals("quatre-vingt-dix-huit",
				Convert.num2text("98", local));
	}

	@Test
	public void test_num2text_quatre_vingt_dix_neuf() {
		Assert.assertEquals("quatre-vingt-dix-neuf",
				Convert.num2text("99", local));
	}

	@Test
	public void test_num2text_cent() {
		Assert.assertEquals("cent", Convert.num2text("100", local));
	}

	@Test
	public void test_num2text_cent_trois() {
		Assert.assertEquals("cent trois", Convert.num2text("103", local));
	}

	@Test
	public void test_num2text_cent_six() {
		Assert.assertEquals("cent six", Convert.num2text("106", local));
	}

	@Test
	public void test_num2text_cent_neuf() {
		Assert.assertEquals("cent neuf", Convert.num2text("109", local));
	}

	@Test
	public void test_num2text_cent_douze() {
		Assert.assertEquals("cent douze", Convert.num2text("112", local));
	}

	@Test
	public void test_num2text_cent_quinze() {
		Assert.assertEquals("cent quinze", Convert.num2text("115", local));
	}

	@Test
	public void test_num2text_cent_dix_huit() {
		Assert.assertEquals("cent dix-huit", Convert.num2text("118", local));
	}

	@Test
	public void test_num2text_cent_vingt_et_un() {
		Assert.assertEquals("cent vingt et un", Convert.num2text("121", local));
	}

	@Test
	public void test_num2text_cent_vingt_quatre() {
		Assert.assertEquals("cent vingt-quatre", Convert.num2text("124", local));
	}

	@Test
	public void test_num2text_cent_vingt_sept() {
		Assert.assertEquals("cent vingt-sept", Convert.num2text("127", local));
	}

	@Test
	public void test_num2text_cent_trente() {
		Assert.assertEquals("cent trente", Convert.num2text("130", local));
	}

	@Test
	public void test_num2text_cent_trente_trois() {
		Assert.assertEquals("cent trente-trois", Convert.num2text("133", local));
	}

	@Test
	public void test_num2text_cent_trente_six() {
		Assert.assertEquals("cent trente-six", Convert.num2text("136", local));
	}

	@Test
	public void test_num2text_cent_trente_neuf() {
		Assert.assertEquals("cent trente-neuf", Convert.num2text("139", local));
	}

	@Test
	public void test_num2text_cent_quarante_deux() {
		Assert.assertEquals("cent quarante-deux",
				Convert.num2text("142", local));
	}

	@Test
	public void test_num2text_cent_quarante_cinq() {
		Assert.assertEquals("cent quarante-cinq",
				Convert.num2text("145", local));
	}

	@Test
	public void test_num2text_cent_quarante_huit() {
		Assert.assertEquals("cent quarante-huit",
				Convert.num2text("148", local));
	}

	@Test
	public void test_num2text_cent_cinquante_et_un() {
		Assert.assertEquals("cent cinquante et un",
				Convert.num2text("151", local));
	}

	@Test
	public void test_num2text_cent_cinquante_quatre() {
		Assert.assertEquals("cent cinquante-quatre",
				Convert.num2text("154", local));
	}

	@Test
	public void test_num2text_cent_cinquante_sept() {
		Assert.assertEquals("cent cinquante-sept",
				Convert.num2text("157", local));
	}

	@Test
	public void test_num2text_cent_soixante() {
		Assert.assertEquals("cent soixante", Convert.num2text("160", local));
	}

	@Test
	public void test_num2text_cent_soixante_trois() {
		Assert.assertEquals("cent soixante-trois",
				Convert.num2text("163", local));
	}

	@Test
	public void test_num2text_cent_soixante_six() {
		Assert.assertEquals("cent soixante-six", Convert.num2text("166", local));
	}

	@Test
	public void test_num2text_cent_soixante_neuf() {
		Assert.assertEquals("cent soixante-neuf",
				Convert.num2text("169", local));
	}

	@Test
	public void test_num2text_cent_soixante_douze() {
		Assert.assertEquals("cent soixante-douze",
				Convert.num2text("172", local));
	}

	@Test
	public void test_num2text_cent_soixante_quinze() {
		Assert.assertEquals("cent soixante-quinze",
				Convert.num2text("175", local));
	}

	@Test
	public void test_num2text_cent_soixante_dix_huit() {
		Assert.assertEquals("cent soixante-dix-huit",
				Convert.num2text("178", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_un() {
		Assert.assertEquals("cent quatre-vingt-un",
				Convert.num2text("181", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_quatre() {
		Assert.assertEquals("cent quatre-vingt-quatre",
				Convert.num2text("184", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_sept() {
		Assert.assertEquals("cent quatre-vingt-sept",
				Convert.num2text("187", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_dix() {
		Assert.assertEquals("cent quatre-vingt-dix",
				Convert.num2text("190", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_treize() {
		Assert.assertEquals("cent quatre-vingt-treize",
				Convert.num2text("193", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_seize() {
		Assert.assertEquals("cent quatre-vingt-seize",
				Convert.num2text("196", local));
	}

	@Test
	public void test_num2text_cent_quatre_vingt_dix_neuf() {
		Assert.assertEquals("cent quatre-vingt-dix-neuf",
				Convert.num2text("199", local));
	}

	@Test
	public void test_num2text_deux_cent_deux() {
		Assert.assertEquals("deux cent deux", Convert.num2text("202", local));
	}

	@Test
	public void test_num2text_deux_cent_cinq() {
		Assert.assertEquals("deux cent cinq", Convert.num2text("205", local));
	}

	@Test
	public void test_num2text_deux_cent_huit() {
		Assert.assertEquals("deux cent huit", Convert.num2text("208", local));
	}

	@Test
	public void test_num2text_deux_cent_onze() {
		Assert.assertEquals("deux cent onze", Convert.num2text("211", local));
	}

	@Test
	public void test_num2text_deux_cent_quatorze() {
		Assert.assertEquals("deux cent quatorze",
				Convert.num2text("214", local));
	}

	@Test
	public void test_num2text_deux_cent_dix_sept() {
		Assert.assertEquals("deux cent dix-sept",
				Convert.num2text("217", local));
	}

	@Test
	public void test_num2text_deux_cent_vingt() {
		Assert.assertEquals("deux cent vingt", Convert.num2text("220", local));
	}

	@Test
	public void test_num2text_deux_cent_vingt_trois() {
		Assert.assertEquals("deux cent vingt-trois",
				Convert.num2text("223", local));
	}

	@Test
	public void test_num2text_deux_cent_vingt_six() {
		Assert.assertEquals("deux cent vingt-six",
				Convert.num2text("226", local));
	}

	@Test
	public void test_num2text_deux_cent_vingt_neuf() {
		Assert.assertEquals("deux cent vingt-neuf",
				Convert.num2text("229", local));
	}

	@Test
	public void test_num2text_deux_cent_trente_deux() {
		Assert.assertEquals("deux cent trente-deux",
				Convert.num2text("232", local));
	}

	@Test
	public void test_num2text_deux_cent_trente_cinq() {
		Assert.assertEquals("deux cent trente-cinq",
				Convert.num2text("235", local));
	}

	@Test
	public void test_num2text_deux_cent_trente_huit() {
		Assert.assertEquals("deux cent trente-huit",
				Convert.num2text("238", local));
	}

	@Test
	public void test_num2text_deux_cent_quarante_et_un() {
		Assert.assertEquals("deux cent quarante et un",
				Convert.num2text("241", local));
	}

	@Test
	public void test_num2text_deux_cent_quarante_quatre() {
		Assert.assertEquals("deux cent quarante-quatre",
				Convert.num2text("244", local));
	}

	@Test
	public void test_num2text_deux_cent_quarante_sept() {
		Assert.assertEquals("deux cent quarante-sept",
				Convert.num2text("247", local));
	}

	@Test
	public void test_num2text_deux_cent_cinquante() {
		Assert.assertEquals("deux cent cinquante",
				Convert.num2text("250", local));
	}

	@Test
	public void test_num2text_deux_cent_cinquante_trois() {
		Assert.assertEquals("deux cent cinquante-trois",
				Convert.num2text("253", local));
	}

	@Test
	public void test_num2text_deux_cent_cinquante_six() {
		Assert.assertEquals("deux cent cinquante-six",
				Convert.num2text("256", local));
	}

	@Test
	public void test_num2text_deux_cent_cinquante_neuf() {
		Assert.assertEquals("deux cent cinquante-neuf",
				Convert.num2text("259", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_deux() {
		Assert.assertEquals("deux cent soixante-deux",
				Convert.num2text("262", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_cinq() {
		Assert.assertEquals("deux cent soixante-cinq",
				Convert.num2text("265", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_huit() {
		Assert.assertEquals("deux cent soixante-huit",
				Convert.num2text("268", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_et_onze() {
		Assert.assertEquals("deux cent soixante et onze",
				Convert.num2text("271", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_quatorze() {
		Assert.assertEquals("deux cent soixante-quatorze",
				Convert.num2text("274", local));
	}

	@Test
	public void test_num2text_deux_cent_soixante_dix_sept() {
		Assert.assertEquals("deux cent soixante-dix-sept",
				Convert.num2text("277", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt() {
		Assert.assertEquals("deux cent quatre-vingt",
				Convert.num2text("280", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_trois() {
		Assert.assertEquals("deux cent quatre-vingt-trois",
				Convert.num2text("283", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_six() {
		Assert.assertEquals("deux cent quatre-vingt-six",
				Convert.num2text("286", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_neuf() {
		Assert.assertEquals("deux cent quatre-vingt-neuf",
				Convert.num2text("289", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_douze() {
		Assert.assertEquals("deux cent quatre-vingt-douze",
				Convert.num2text("292", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_quinze() {
		Assert.assertEquals("deux cent quatre-vingt-quinze",
				Convert.num2text("295", local));
	}

	@Test
	public void test_num2text_deux_cent_quatre_vingt_dix_huit() {
		Assert.assertEquals("deux cent quatre-vingt-dix-huit",
				Convert.num2text("298", local));
	}

	@Test
	public void test_num2text_trois_cent_un() {
		Assert.assertEquals("trois cent un", Convert.num2text("301", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre() {
		Assert.assertEquals("trois cent quatre", Convert.num2text("304", local));
	}

	@Test
	public void test_num2text_trois_cent_sept() {
		Assert.assertEquals("trois cent sept", Convert.num2text("307", local));
	}

	@Test
	public void test_num2text_trois_cent_dix() {
		Assert.assertEquals("trois cent dix", Convert.num2text("310", local));
	}

	@Test
	public void test_num2text_trois_cent_treize() {
		Assert.assertEquals("trois cent treize", Convert.num2text("313", local));
	}

	@Test
	public void test_num2text_trois_cent_seize() {
		Assert.assertEquals("trois cent seize", Convert.num2text("316", local));
	}

	@Test
	public void test_num2text_trois_cent_dix_neuf() {
		Assert.assertEquals("trois cent dix-neuf",
				Convert.num2text("319", local));
	}

	@Test
	public void test_num2text_trois_cent_vingt_deux() {
		Assert.assertEquals("trois cent vingt-deux",
				Convert.num2text("322", local));
	}

	@Test
	public void test_num2text_trois_cent_vingt_cinq() {
		Assert.assertEquals("trois cent vingt-cinq",
				Convert.num2text("325", local));
	}

	@Test
	public void test_num2text_trois_cent_vingt_huit() {
		Assert.assertEquals("trois cent vingt-huit",
				Convert.num2text("328", local));
	}

	@Test
	public void test_num2text_trois_cent_trente_et_un() {
		Assert.assertEquals("trois cent trente et un",
				Convert.num2text("331", local));
	}

	@Test
	public void test_num2text_trois_cent_trente_quatre() {
		Assert.assertEquals("trois cent trente-quatre",
				Convert.num2text("334", local));
	}

	@Test
	public void test_num2text_trois_cent_trente_sept() {
		Assert.assertEquals("trois cent trente-sept",
				Convert.num2text("337", local));
	}

	@Test
	public void test_num2text_trois_cent_quarante() {
		Assert.assertEquals("trois cent quarante",
				Convert.num2text("340", local));
	}

	@Test
	public void test_num2text_trois_cent_quarante_trois() {
		Assert.assertEquals("trois cent quarante-trois",
				Convert.num2text("343", local));
	}

	@Test
	public void test_num2text_trois_cent_quarante_six() {
		Assert.assertEquals("trois cent quarante-six",
				Convert.num2text("346", local));
	}

	@Test
	public void test_num2text_trois_cent_quarante_neuf() {
		Assert.assertEquals("trois cent quarante-neuf",
				Convert.num2text("349", local));
	}

	@Test
	public void test_num2text_trois_cent_cinquante_deux() {
		Assert.assertEquals("trois cent cinquante-deux",
				Convert.num2text("352", local));
	}

	@Test
	public void test_num2text_trois_cent_cinquante_cinq() {
		Assert.assertEquals("trois cent cinquante-cinq",
				Convert.num2text("355", local));
	}

	@Test
	public void test_num2text_trois_cent_cinquante_huit() {
		Assert.assertEquals("trois cent cinquante-huit",
				Convert.num2text("358", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_et_un() {
		Assert.assertEquals("trois cent soixante et un",
				Convert.num2text("361", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_quatre() {
		Assert.assertEquals("trois cent soixante-quatre",
				Convert.num2text("364", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_sept() {
		Assert.assertEquals("trois cent soixante-sept",
				Convert.num2text("367", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_dix() {
		Assert.assertEquals("trois cent soixante-dix",
				Convert.num2text("370", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_treize() {
		Assert.assertEquals("trois cent soixante-treize",
				Convert.num2text("373", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_seize() {
		Assert.assertEquals("trois cent soixante-seize",
				Convert.num2text("376", local));
	}

	@Test
	public void test_num2text_trois_cent_soixante_dix_neuf() {
		Assert.assertEquals("trois cent soixante-dix-neuf",
				Convert.num2text("379", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_deux() {
		Assert.assertEquals("trois cent quatre-vingt-deux",
				Convert.num2text("382", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_cinq() {
		Assert.assertEquals("trois cent quatre-vingt-cinq",
				Convert.num2text("385", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_huit() {
		Assert.assertEquals("trois cent quatre-vingt-huit",
				Convert.num2text("388", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_onze() {
		Assert.assertEquals("trois cent quatre-vingt-onze",
				Convert.num2text("391", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_quatorze() {
		Assert.assertEquals("trois cent quatre-vingt-quatorze",
				Convert.num2text("394", local));
	}

	@Test
	public void test_num2text_trois_cent_quatre_vingt_dix_sept() {
		Assert.assertEquals("trois cent quatre-vingt-dix-sept",
				Convert.num2text("397", local));
	}

	@Test
	public void test_num2text_quatre_cents() {
		Assert.assertEquals("quatre cents", Convert.num2text("400", local));
	}

	@Test
	public void test_num2text_quatre_cent_trois() {
		Assert.assertEquals("quatre cent trois", Convert.num2text("403", local));
	}

	@Test
	public void test_num2text_quatre_cent_six() {
		Assert.assertEquals("quatre cent six", Convert.num2text("406", local));
	}

	@Test
	public void test_num2text_quatre_cent_neuf() {
		Assert.assertEquals("quatre cent neuf", Convert.num2text("409", local));
	}

	@Test
	public void test_num2text_quatre_cent_douze() {
		Assert.assertEquals("quatre cent douze", Convert.num2text("412", local));
	}

	@Test
	public void test_num2text_quatre_cent_quinze() {
		Assert.assertEquals("quatre cent quinze",
				Convert.num2text("415", local));
	}

	@Test
	public void test_num2text_quatre_cent_dix_huit() {
		Assert.assertEquals("quatre cent dix-huit",
				Convert.num2text("418", local));
	}

	@Test
	public void test_num2text_quatre_cent_vingt_et_un() {
		Assert.assertEquals("quatre cent vingt et un",
				Convert.num2text("421", local));
	}

	@Test
	public void test_num2text_quatre_cent_vingt_quatre() {
		Assert.assertEquals("quatre cent vingt-quatre",
				Convert.num2text("424", local));
	}

	@Test
	public void test_num2text_quatre_cent_vingt_sept() {
		Assert.assertEquals("quatre cent vingt-sept",
				Convert.num2text("427", local));
	}

	@Test
	public void test_num2text_quatre_cent_trente() {
		Assert.assertEquals("quatre cent trente",
				Convert.num2text("430", local));
	}

	@Test
	public void test_num2text_quatre_cent_trente_trois() {
		Assert.assertEquals("quatre cent trente-trois",
				Convert.num2text("433", local));
	}

	@Test
	public void test_num2text_quatre_cent_trente_six() {
		Assert.assertEquals("quatre cent trente-six",
				Convert.num2text("436", local));
	}

	@Test
	public void test_num2text_quatre_cent_trente_neuf() {
		Assert.assertEquals("quatre cent trente-neuf",
				Convert.num2text("439", local));
	}

	@Test
	public void test_num2text_quatre_cent_quarante_deux() {
		Assert.assertEquals("quatre cent quarante-deux",
				Convert.num2text("442", local));
	}

	@Test
	public void test_num2text_quatre_cent_quarante_cinq() {
		Assert.assertEquals("quatre cent quarante-cinq",
				Convert.num2text("445", local));
	}

	@Test
	public void test_num2text_quatre_cent_quarante_huit() {
		Assert.assertEquals("quatre cent quarante-huit",
				Convert.num2text("448", local));
	}

	@Test
	public void test_num2text_quatre_cent_cinquante_et_un() {
		Assert.assertEquals("quatre cent cinquante et un",
				Convert.num2text("451", local));
	}

	@Test
	public void test_num2text_quatre_cent_cinquante_quatre() {
		Assert.assertEquals("quatre cent cinquante-quatre",
				Convert.num2text("454", local));
	}

	@Test
	public void test_num2text_quatre_cent_cinquante_sept() {
		Assert.assertEquals("quatre cent cinquante-sept",
				Convert.num2text("457", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante() {
		Assert.assertEquals("quatre cent soixante",
				Convert.num2text("460", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_trois() {
		Assert.assertEquals("quatre cent soixante-trois",
				Convert.num2text("463", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_six() {
		Assert.assertEquals("quatre cent soixante-six",
				Convert.num2text("466", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_neuf() {
		Assert.assertEquals("quatre cent soixante-neuf",
				Convert.num2text("469", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_douze() {
		Assert.assertEquals("quatre cent soixante-douze",
				Convert.num2text("472", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_quinze() {
		Assert.assertEquals("quatre cent soixante-quinze",
				Convert.num2text("475", local));
	}

	@Test
	public void test_num2text_quatre_cent_soixante_dix_huit() {
		Assert.assertEquals("quatre cent soixante-dix-huit",
				Convert.num2text("478", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_un() {
		Assert.assertEquals("quatre cent quatre-vingt-un",
				Convert.num2text("481", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_quatre() {
		Assert.assertEquals("quatre cent quatre-vingt-quatre",
				Convert.num2text("484", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_sept() {
		Assert.assertEquals("quatre cent quatre-vingt-sept",
				Convert.num2text("487", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_dix() {
		Assert.assertEquals("quatre cent quatre-vingt-dix",
				Convert.num2text("490", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_treize() {
		Assert.assertEquals("quatre cent quatre-vingt-treize",
				Convert.num2text("493", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_seize() {
		Assert.assertEquals("quatre cent quatre-vingt-seize",
				Convert.num2text("496", local));
	}

	@Test
	public void test_num2text_quatre_cent_quatre_vingt_dix_neuf() {
		Assert.assertEquals("quatre cent quatre-vingt-dix-neuf",
				Convert.num2text("499", local));
	}

	@Test
	public void test_num2text_cinq_cent_deux() {
		Assert.assertEquals("cinq cent deux", Convert.num2text("502", local));
	}

	@Test
	public void test_num2text_cinq_cent_cinq() {
		Assert.assertEquals("cinq cent cinq", Convert.num2text("505", local));
	}

	@Test
	public void test_num2text_cinq_cent_huit() {
		Assert.assertEquals("cinq cent huit", Convert.num2text("508", local));
	}

	@Test
	public void test_num2text_cinq_cent_onze() {
		Assert.assertEquals("cinq cent onze", Convert.num2text("511", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatorze() {
		Assert.assertEquals("cinq cent quatorze",
				Convert.num2text("514", local));
	}

	@Test
	public void test_num2text_cinq_cent_dix_sept() {
		Assert.assertEquals("cinq cent dix-sept",
				Convert.num2text("517", local));
	}

	@Test
	public void test_num2text_cinq_cent_vingt() {
		Assert.assertEquals("cinq cent vingt", Convert.num2text("520", local));
	}

	@Test
	public void test_num2text_cinq_cent_vingt_trois() {
		Assert.assertEquals("cinq cent vingt-trois",
				Convert.num2text("523", local));
	}

	@Test
	public void test_num2text_cinq_cent_vingt_six() {
		Assert.assertEquals("cinq cent vingt-six",
				Convert.num2text("526", local));
	}

	@Test
	public void test_num2text_cinq_cent_vingt_neuf() {
		Assert.assertEquals("cinq cent vingt-neuf",
				Convert.num2text("529", local));
	}

	@Test
	public void test_num2text_cinq_cent_trente_deux() {
		Assert.assertEquals("cinq cent trente-deux",
				Convert.num2text("532", local));
	}

	@Test
	public void test_num2text_cinq_cent_trente_cinq() {
		Assert.assertEquals("cinq cent trente-cinq",
				Convert.num2text("535", local));
	}

	@Test
	public void test_num2text_cinq_cent_trente_huit() {
		Assert.assertEquals("cinq cent trente-huit",
				Convert.num2text("538", local));
	}

	@Test
	public void test_num2text_cinq_cent_quarante_et_un() {
		Assert.assertEquals("cinq cent quarante et un",
				Convert.num2text("541", local));
	}

	@Test
	public void test_num2text_cinq_cent_quarante_quatre() {
		Assert.assertEquals("cinq cent quarante-quatre",
				Convert.num2text("544", local));
	}

	@Test
	public void test_num2text_cinq_cent_quarante_sept() {
		Assert.assertEquals("cinq cent quarante-sept",
				Convert.num2text("547", local));
	}

	@Test
	public void test_num2text_cinq_cent_cinquante() {
		Assert.assertEquals("cinq cent cinquante",
				Convert.num2text("550", local));
	}

	@Test
	public void test_num2text_cinq_cent_cinquante_trois() {
		Assert.assertEquals("cinq cent cinquante-trois",
				Convert.num2text("553", local));
	}

	@Test
	public void test_num2text_cinq_cent_cinquante_six() {
		Assert.assertEquals("cinq cent cinquante-six",
				Convert.num2text("556", local));
	}

	@Test
	public void test_num2text_cinq_cent_cinquante_neuf() {
		Assert.assertEquals("cinq cent cinquante-neuf",
				Convert.num2text("559", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_deux() {
		Assert.assertEquals("cinq cent soixante-deux",
				Convert.num2text("562", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_cinq() {
		Assert.assertEquals("cinq cent soixante-cinq",
				Convert.num2text("565", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_huit() {
		Assert.assertEquals("cinq cent soixante-huit",
				Convert.num2text("568", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_et_onze() {
		Assert.assertEquals("cinq cent soixante et onze",
				Convert.num2text("571", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_quatorze() {
		Assert.assertEquals("cinq cent soixante-quatorze",
				Convert.num2text("574", local));
	}

	@Test
	public void test_num2text_cinq_cent_soixante_dix_sept() {
		Assert.assertEquals("cinq cent soixante-dix-sept",
				Convert.num2text("577", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt() {
		Assert.assertEquals("cinq cent quatre-vingt",
				Convert.num2text("580", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_trois() {
		Assert.assertEquals("cinq cent quatre-vingt-trois",
				Convert.num2text("583", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_six() {
		Assert.assertEquals("cinq cent quatre-vingt-six",
				Convert.num2text("586", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_neuf() {
		Assert.assertEquals("cinq cent quatre-vingt-neuf",
				Convert.num2text("589", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_douze() {
		Assert.assertEquals("cinq cent quatre-vingt-douze",
				Convert.num2text("592", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_quinze() {
		Assert.assertEquals("cinq cent quatre-vingt-quinze",
				Convert.num2text("595", local));
	}

	@Test
	public void test_num2text_cinq_cent_quatre_vingt_dix_huit() {
		Assert.assertEquals("cinq cent quatre-vingt-dix-huit",
				Convert.num2text("598", local));
	}

	@Test
	public void test_num2text_six_cent_un() {
		Assert.assertEquals("six cent un", Convert.num2text("601", local));
	}

	@Test
	public void test_num2text_six_cent_quatre() {
		Assert.assertEquals("six cent quatre", Convert.num2text("604", local));
	}

	@Test
	public void test_num2text_six_cent_sept() {
		Assert.assertEquals("six cent sept", Convert.num2text("607", local));
	}

	@Test
	public void test_num2text_six_cent_dix() {
		Assert.assertEquals("six cent dix", Convert.num2text("610", local));
	}

	@Test
	public void test_num2text_six_cent_treize() {
		Assert.assertEquals("six cent treize", Convert.num2text("613", local));
	}

	@Test
	public void test_num2text_six_cent_seize() {
		Assert.assertEquals("six cent seize", Convert.num2text("616", local));
	}

	@Test
	public void test_num2text_six_cent_dix_neuf() {
		Assert.assertEquals("six cent dix-neuf", Convert.num2text("619", local));
	}

	@Test
	public void test_num2text_six_cent_vingt_deux() {
		Assert.assertEquals("six cent vingt-deux",
				Convert.num2text("622", local));
	}

	@Test
	public void test_num2text_six_cent_vingt_cinq() {
		Assert.assertEquals("six cent vingt-cinq",
				Convert.num2text("625", local));
	}

	@Test
	public void test_num2text_six_cent_vingt_huit() {
		Assert.assertEquals("six cent vingt-huit",
				Convert.num2text("628", local));
	}

	@Test
	public void test_num2text_six_cent_trente_et_un() {
		Assert.assertEquals("six cent trente et un",
				Convert.num2text("631", local));
	}

	@Test
	public void test_num2text_six_cent_trente_quatre() {
		Assert.assertEquals("six cent trente-quatre",
				Convert.num2text("634", local));
	}

	@Test
	public void test_num2text_six_cent_trente_sept() {
		Assert.assertEquals("six cent trente-sept",
				Convert.num2text("637", local));
	}

	@Test
	public void test_num2text_six_cent_quarante() {
		Assert.assertEquals("six cent quarante", Convert.num2text("640", local));
	}

	@Test
	public void test_num2text_six_cent_quarante_trois() {
		Assert.assertEquals("six cent quarante-trois",
				Convert.num2text("643", local));
	}

	@Test
	public void test_num2text_six_cent_quarante_six() {
		Assert.assertEquals("six cent quarante-six",
				Convert.num2text("646", local));
	}

	@Test
	public void test_num2text_six_cent_quarante_neuf() {
		Assert.assertEquals("six cent quarante-neuf",
				Convert.num2text("649", local));
	}

	@Test
	public void test_num2text_six_cent_cinquante_deux() {
		Assert.assertEquals("six cent cinquante-deux",
				Convert.num2text("652", local));
	}

	@Test
	public void test_num2text_six_cent_cinquante_cinq() {
		Assert.assertEquals("six cent cinquante-cinq",
				Convert.num2text("655", local));
	}

	@Test
	public void test_num2text_six_cent_cinquante_huit() {
		Assert.assertEquals("six cent cinquante-huit",
				Convert.num2text("658", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_et_un() {
		Assert.assertEquals("six cent soixante et un",
				Convert.num2text("661", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_quatre() {
		Assert.assertEquals("six cent soixante-quatre",
				Convert.num2text("664", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_sept() {
		Assert.assertEquals("six cent soixante-sept",
				Convert.num2text("667", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_dix() {
		Assert.assertEquals("six cent soixante-dix",
				Convert.num2text("670", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_treize() {
		Assert.assertEquals("six cent soixante-treize",
				Convert.num2text("673", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_seize() {
		Assert.assertEquals("six cent soixante-seize",
				Convert.num2text("676", local));
	}

	@Test
	public void test_num2text_six_cent_soixante_dix_neuf() {
		Assert.assertEquals("six cent soixante-dix-neuf",
				Convert.num2text("679", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_deux() {
		Assert.assertEquals("six cent quatre-vingt-deux",
				Convert.num2text("682", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_cinq() {
		Assert.assertEquals("six cent quatre-vingt-cinq",
				Convert.num2text("685", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_huit() {
		Assert.assertEquals("six cent quatre-vingt-huit",
				Convert.num2text("688", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_onze() {
		Assert.assertEquals("six cent quatre-vingt-onze",
				Convert.num2text("691", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_quatorze() {
		Assert.assertEquals("six cent quatre-vingt-quatorze",
				Convert.num2text("694", local));
	}

	@Test
	public void test_num2text_six_cent_quatre_vingt_dix_sept() {
		Assert.assertEquals("six cent quatre-vingt-dix-sept",
				Convert.num2text("697", local));
	}

	@Test
	public void test_num2text_sept_cents() {
		Assert.assertEquals("sept cents", Convert.num2text("700", local));
	}

	@Test
	public void test_num2text_sept_cent_trois() {
		Assert.assertEquals("sept cent trois", Convert.num2text("703", local));
	}

	@Test
	public void test_num2text_sept_cent_six() {
		Assert.assertEquals("sept cent six", Convert.num2text("706", local));
	}

	@Test
	public void test_num2text_sept_cent_neuf() {
		Assert.assertEquals("sept cent neuf", Convert.num2text("709", local));
	}

	@Test
	public void test_num2text_sept_cent_douze() {
		Assert.assertEquals("sept cent douze", Convert.num2text("712", local));
	}

	@Test
	public void test_num2text_sept_cent_quinze() {
		Assert.assertEquals("sept cent quinze", Convert.num2text("715", local));
	}

	@Test
	public void test_num2text_sept_cent_dix_huit() {
		Assert.assertEquals("sept cent dix-huit",
				Convert.num2text("718", local));
	}

	@Test
	public void test_num2text_sept_cent_vingt_et_un() {
		Assert.assertEquals("sept cent vingt et un",
				Convert.num2text("721", local));
	}

	@Test
	public void test_num2text_sept_cent_vingt_quatre() {
		Assert.assertEquals("sept cent vingt-quatre",
				Convert.num2text("724", local));
	}

	@Test
	public void test_num2text_sept_cent_vingt_sept() {
		Assert.assertEquals("sept cent vingt-sept",
				Convert.num2text("727", local));
	}

	@Test
	public void test_num2text_sept_cent_trente() {
		Assert.assertEquals("sept cent trente", Convert.num2text("730", local));
	}

	@Test
	public void test_num2text_sept_cent_trente_trois() {
		Assert.assertEquals("sept cent trente-trois",
				Convert.num2text("733", local));
	}

	@Test
	public void test_num2text_sept_cent_trente_six() {
		Assert.assertEquals("sept cent trente-six",
				Convert.num2text("736", local));
	}

	@Test
	public void test_num2text_sept_cent_trente_neuf() {
		Assert.assertEquals("sept cent trente-neuf",
				Convert.num2text("739", local));
	}

	@Test
	public void test_num2text_sept_cent_quarante_deux() {
		Assert.assertEquals("sept cent quarante-deux",
				Convert.num2text("742", local));
	}

	@Test
	public void test_num2text_sept_cent_quarante_cinq() {
		Assert.assertEquals("sept cent quarante-cinq",
				Convert.num2text("745", local));
	}

	@Test
	public void test_num2text_sept_cent_quarante_huit() {
		Assert.assertEquals("sept cent quarante-huit",
				Convert.num2text("748", local));
	}

	@Test
	public void test_num2text_sept_cent_cinquante_et_un() {
		Assert.assertEquals("sept cent cinquante et un",
				Convert.num2text("751", local));
	}

	@Test
	public void test_num2text_sept_cent_cinquante_quatre() {
		Assert.assertEquals("sept cent cinquante-quatre",
				Convert.num2text("754", local));
	}

	@Test
	public void test_num2text_sept_cent_cinquante_sept() {
		Assert.assertEquals("sept cent cinquante-sept",
				Convert.num2text("757", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante() {
		Assert.assertEquals("sept cent soixante",
				Convert.num2text("760", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_trois() {
		Assert.assertEquals("sept cent soixante-trois",
				Convert.num2text("763", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_six() {
		Assert.assertEquals("sept cent soixante-six",
				Convert.num2text("766", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_neuf() {
		Assert.assertEquals("sept cent soixante-neuf",
				Convert.num2text("769", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_douze() {
		Assert.assertEquals("sept cent soixante-douze",
				Convert.num2text("772", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_quinze() {
		Assert.assertEquals("sept cent soixante-quinze",
				Convert.num2text("775", local));
	}

	@Test
	public void test_num2text_sept_cent_soixante_dix_huit() {
		Assert.assertEquals("sept cent soixante-dix-huit",
				Convert.num2text("778", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_un() {
		Assert.assertEquals("sept cent quatre-vingt-un",
				Convert.num2text("781", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_quatre() {
		Assert.assertEquals("sept cent quatre-vingt-quatre",
				Convert.num2text("784", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_sept() {
		Assert.assertEquals("sept cent quatre-vingt-sept",
				Convert.num2text("787", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_dix() {
		Assert.assertEquals("sept cent quatre-vingt-dix",
				Convert.num2text("790", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_treize() {
		Assert.assertEquals("sept cent quatre-vingt-treize",
				Convert.num2text("793", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_seize() {
		Assert.assertEquals("sept cent quatre-vingt-seize",
				Convert.num2text("796", local));
	}

	@Test
	public void test_num2text_sept_cent_quatre_vingt_dix_neuf() {
		Assert.assertEquals("sept cent quatre-vingt-dix-neuf",
				Convert.num2text("799", local));
	}

	@Test
	public void test_num2text_huit_cent_deux() {
		Assert.assertEquals("huit cent deux", Convert.num2text("802", local));
	}

	@Test
	public void test_num2text_huit_cent_cinq() {
		Assert.assertEquals("huit cent cinq", Convert.num2text("805", local));
	}

	@Test
	public void test_num2text_huit_cent_huit() {
		Assert.assertEquals("huit cent huit", Convert.num2text("808", local));
	}

	@Test
	public void test_num2text_huit_cent_onze() {
		Assert.assertEquals("huit cent onze", Convert.num2text("811", local));
	}

	@Test
	public void test_num2text_huit_cent_quatorze() {
		Assert.assertEquals("huit cent quatorze",
				Convert.num2text("814", local));
	}

	@Test
	public void test_num2text_huit_cent_dix_sept() {
		Assert.assertEquals("huit cent dix-sept",
				Convert.num2text("817", local));
	}

	@Test
	public void test_num2text_huit_cent_vingt() {
		Assert.assertEquals("huit cent vingt", Convert.num2text("820", local));
	}

	@Test
	public void test_num2text_huit_cent_vingt_trois() {
		Assert.assertEquals("huit cent vingt-trois",
				Convert.num2text("823", local));
	}

	@Test
	public void test_num2text_huit_cent_vingt_six() {
		Assert.assertEquals("huit cent vingt-six",
				Convert.num2text("826", local));
	}

	@Test
	public void test_num2text_huit_cent_vingt_neuf() {
		Assert.assertEquals("huit cent vingt-neuf",
				Convert.num2text("829", local));
	}

	@Test
	public void test_num2text_huit_cent_trente_deux() {
		Assert.assertEquals("huit cent trente-deux",
				Convert.num2text("832", local));
	}

	@Test
	public void test_num2text_huit_cent_trente_cinq() {
		Assert.assertEquals("huit cent trente-cinq",
				Convert.num2text("835", local));
	}

	@Test
	public void test_num2text_huit_cent_trente_huit() {
		Assert.assertEquals("huit cent trente-huit",
				Convert.num2text("838", local));
	}

	@Test
	public void test_num2text_huit_cent_quarante_et_un() {
		Assert.assertEquals("huit cent quarante et un",
				Convert.num2text("841", local));
	}

	@Test
	public void test_num2text_huit_cent_quarante_quatre() {
		Assert.assertEquals("huit cent quarante-quatre",
				Convert.num2text("844", local));
	}

	@Test
	public void test_num2text_huit_cent_quarante_sept() {
		Assert.assertEquals("huit cent quarante-sept",
				Convert.num2text("847", local));
	}

	@Test
	public void test_num2text_huit_cent_cinquante() {
		Assert.assertEquals("huit cent cinquante",
				Convert.num2text("850", local));
	}

	@Test
	public void test_num2text_huit_cent_cinquante_trois() {
		Assert.assertEquals("huit cent cinquante-trois",
				Convert.num2text("853", local));
	}

	@Test
	public void test_num2text_huit_cent_cinquante_six() {
		Assert.assertEquals("huit cent cinquante-six",
				Convert.num2text("856", local));
	}

	@Test
	public void test_num2text_huit_cent_cinquante_neuf() {
		Assert.assertEquals("huit cent cinquante-neuf",
				Convert.num2text("859", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_deux() {
		Assert.assertEquals("huit cent soixante-deux",
				Convert.num2text("862", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_cinq() {
		Assert.assertEquals("huit cent soixante-cinq",
				Convert.num2text("865", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_huit() {
		Assert.assertEquals("huit cent soixante-huit",
				Convert.num2text("868", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_et_onze() {
		Assert.assertEquals("huit cent soixante et onze",
				Convert.num2text("871", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_quatorze() {
		Assert.assertEquals("huit cent soixante-quatorze",
				Convert.num2text("874", local));
	}

	@Test
	public void test_num2text_huit_cent_soixante_dix_sept() {
		Assert.assertEquals("huit cent soixante-dix-sept",
				Convert.num2text("877", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt() {
		Assert.assertEquals("huit cent quatre-vingt",
				Convert.num2text("880", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_trois() {
		Assert.assertEquals("huit cent quatre-vingt-trois",
				Convert.num2text("883", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_six() {
		Assert.assertEquals("huit cent quatre-vingt-six",
				Convert.num2text("886", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_neuf() {
		Assert.assertEquals("huit cent quatre-vingt-neuf",
				Convert.num2text("889", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_douze() {
		Assert.assertEquals("huit cent quatre-vingt-douze",
				Convert.num2text("892", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_quinze() {
		Assert.assertEquals("huit cent quatre-vingt-quinze",
				Convert.num2text("895", local));
	}

	@Test
	public void test_num2text_huit_cent_quatre_vingt_dix_huit() {
		Assert.assertEquals("huit cent quatre-vingt-dix-huit",
				Convert.num2text("898", local));
	}

	@Test
	public void test_num2text_neuf_cent_un() {
		Assert.assertEquals("neuf cent un", Convert.num2text("901", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre() {
		Assert.assertEquals("neuf cent quatre", Convert.num2text("904", local));
	}

	@Test
	public void test_num2text_neuf_cent_sept() {
		Assert.assertEquals("neuf cent sept", Convert.num2text("907", local));
	}

	@Test
	public void test_num2text_neuf_cent_dix() {
		Assert.assertEquals("neuf cent dix", Convert.num2text("910", local));
	}

	@Test
	public void test_num2text_neuf_cent_treize() {
		Assert.assertEquals("neuf cent treize", Convert.num2text("913", local));
	}

	@Test
	public void test_num2text_neuf_cent_seize() {
		Assert.assertEquals("neuf cent seize", Convert.num2text("916", local));
	}

	@Test
	public void test_num2text_neuf_cent_dix_neuf() {
		Assert.assertEquals("neuf cent dix-neuf",
				Convert.num2text("919", local));
	}

	@Test
	public void test_num2text_neuf_cent_vingt_deux() {
		Assert.assertEquals("neuf cent vingt-deux",
				Convert.num2text("922", local));
	}

	@Test
	public void test_num2text_neuf_cent_vingt_cinq() {
		Assert.assertEquals("neuf cent vingt-cinq",
				Convert.num2text("925", local));
	}

	@Test
	public void test_num2text_neuf_cent_vingt_huit() {
		Assert.assertEquals("neuf cent vingt-huit",
				Convert.num2text("928", local));
	}

	@Test
	public void test_num2text_neuf_cent_trente_et_un() {
		Assert.assertEquals("neuf cent trente et un",
				Convert.num2text("931", local));
	}

	@Test
	public void test_num2text_neuf_cent_trente_quatre() {
		Assert.assertEquals("neuf cent trente-quatre",
				Convert.num2text("934", local));
	}

	@Test
	public void test_num2text_neuf_cent_trente_sept() {
		Assert.assertEquals("neuf cent trente-sept",
				Convert.num2text("937", local));
	}

	@Test
	public void test_num2text_neuf_cent_quarante() {
		Assert.assertEquals("neuf cent quarante",
				Convert.num2text("940", local));
	}

	@Test
	public void test_num2text_neuf_cent_quarante_trois() {
		Assert.assertEquals("neuf cent quarante-trois",
				Convert.num2text("943", local));
	}

	@Test
	public void test_num2text_neuf_cent_quarante_six() {
		Assert.assertEquals("neuf cent quarante-six",
				Convert.num2text("946", local));
	}

	@Test
	public void test_num2text_neuf_cent_quarante_neuf() {
		Assert.assertEquals("neuf cent quarante-neuf",
				Convert.num2text("949", local));
	}

	@Test
	public void test_num2text_neuf_cent_cinquante_deux() {
		Assert.assertEquals("neuf cent cinquante-deux",
				Convert.num2text("952", local));
	}

	@Test
	public void test_num2text_neuf_cent_cinquante_cinq() {
		Assert.assertEquals("neuf cent cinquante-cinq",
				Convert.num2text("955", local));
	}

	@Test
	public void test_num2text_neuf_cent_cinquante_huit() {
		Assert.assertEquals("neuf cent cinquante-huit",
				Convert.num2text("958", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_et_un() {
		Assert.assertEquals("neuf cent soixante et un",
				Convert.num2text("961", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_quatre() {
		Assert.assertEquals("neuf cent soixante-quatre",
				Convert.num2text("964", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_sept() {
		Assert.assertEquals("neuf cent soixante-sept",
				Convert.num2text("967", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_dix() {
		Assert.assertEquals("neuf cent soixante-dix",
				Convert.num2text("970", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_treize() {
		Assert.assertEquals("neuf cent soixante-treize",
				Convert.num2text("973", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_seize() {
		Assert.assertEquals("neuf cent soixante-seize",
				Convert.num2text("976", local));
	}

	@Test
	public void test_num2text_neuf_cent_soixante_dix_neuf() {
		Assert.assertEquals("neuf cent soixante-dix-neuf",
				Convert.num2text("979", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_deux() {
		Assert.assertEquals("neuf cent quatre-vingt-deux",
				Convert.num2text("982", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_cinq() {
		Assert.assertEquals("neuf cent quatre-vingt-cinq",
				Convert.num2text("985", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_huit() {
		Assert.assertEquals("neuf cent quatre-vingt-huit",
				Convert.num2text("988", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_onze() {
		Assert.assertEquals("neuf cent quatre-vingt-onze",
				Convert.num2text("991", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_quatorze() {
		Assert.assertEquals("neuf cent quatre-vingt-quatorze",
				Convert.num2text("994", local));
	}

	@Test
	public void test_num2text_neuf_cent_quatre_vingt_dix_sept() {
		Assert.assertEquals("neuf cent quatre-vingt-dix-sept",
				Convert.num2text("997", local));
	}
	
	@Test
	public void test_num2text_euro(){
		Assert.assertEquals("cinquante-deux euro et vingt centimes", Convert.num2text("52,20 €", local));
	}
	
	@Test
	public void test_num2text_euro_2(){
		Assert.assertEquals("cinquante-deux euro et cinq centimes", Convert.num2text("52,05 €", local));
	}

}
