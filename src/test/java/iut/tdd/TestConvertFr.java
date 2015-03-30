package iut.tdd;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestConvertFr {
	
	String local = "fr_FR";
	Map<String, String> data = Convert.dataConvert.get(local);
	
	@Test
	public void test_num2text_zero() {
		Assert.assertEquals(data.get("0"), Convert.num2text("0", local));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals(data.get("1"), Convert.num2text("1", local));
	}

	@Test
	public void test_num2text_deux() {
		Assert.assertEquals(data.get("2"), Convert.num2text("2", local));
	}

	@Test
	public void test_num2text_trois() {
		Assert.assertEquals(data.get("3"), Convert.num2text("3", local));
	}

	@Test
	public void test_num2text_quatre() {
		Assert.assertEquals(data.get("4"), Convert.num2text("4", local));
	}

	@Test
	public void test_num2text_cinq() {
		Assert.assertEquals(data.get("5"), Convert.num2text("5", local));
	}

	@Test
	public void test_num2text_six() {
		Assert.assertEquals(data.get("6"), Convert.num2text("6", local));
	}

	@Test
	public void test_num2text_sept() {
		Assert.assertEquals(data.get("7"), Convert.num2text("7", local));
	}

	@Test
	public void test_num2text_huit() {
		Assert.assertEquals(data.get("8"), Convert.num2text("8", local));
	}

	@Test
	public void test_num2text_neuf() {
		Assert.assertEquals(data.get("9"), Convert.num2text("9", local));
	}
	@Test
	public void test_num2text_dix() {
		Assert.assertEquals(data.get("10"), Convert.num2text("10", local));
	}
	@Test
	public void test_num2text_onze() {
		Assert.assertEquals(data.get("11"), Convert.num2text("11", local));
	}
	@Test
	public void test_num2text_douze() {
		Assert.assertEquals(data.get("12"), Convert.num2text("12", local));
	}
	@Test
	public void test_num2text_treize() {
		Assert.assertEquals(data.get("13"), Convert.num2text("13", local));
	}
	@Test
	public void test_num2text_quatorze() {
		Assert.assertEquals(data.get("14"), Convert.num2text("14", local));
	}
	@Test
	public void test_num2text_quinze() {
		Assert.assertEquals(data.get("15"), Convert.num2text("15", local));
	}
	@Test
	public void test_num2text_seize() {
		Assert.assertEquals(data.get("16"), Convert.num2text("16", local));
	}
	
}
