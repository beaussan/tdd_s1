package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals("zero", Convert.num2text("0", "FR_fr"));
		Assert.assertEquals("zero", Convert.num2text("0", "EN_en"));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1", "FR_fr"));
		Assert.assertEquals("one", Convert.num2text("1", "EN_en"));
	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2", "FR_fr"));
		Assert.assertEquals("two", Convert.num2text("2", "EN_en"));
	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3", "FR_fr"));
		Assert.assertEquals("three", Convert.num2text("3", "EN_en"));
	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals("quatre", Convert.num2text("4", "FR_fr"));
		Assert.assertEquals("four", Convert.num2text("4", "EN_en"));
	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals("cinq", Convert.num2text("5", "FR_fr"));
		Assert.assertEquals("five", Convert.num2text("5", "EN_en"));
	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals("six", Convert.num2text("6", "FR_fr"));
		Assert.assertEquals("six", Convert.num2text("6", "EN_en"));
	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals("sept", Convert.num2text("7", "FR_fr"));
		Assert.assertEquals("seven", Convert.num2text("7", "EN_en"));
	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals("huit", Convert.num2text("8", "FR_fr"));
		Assert.assertEquals("eight", Convert.num2text("8", "EN_en"));
	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals("neuf", Convert.num2text("9", "FR_fr"));
		Assert.assertEquals("nine", Convert.num2text("9", "EN_en"));
	}

}
