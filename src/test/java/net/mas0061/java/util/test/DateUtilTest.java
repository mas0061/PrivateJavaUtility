package net.mas0061.java.util.test;

import static org.junit.Assert.*;

import net.mas0061.java.util.DateUtil;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testIsValidDate() {
		String okText = "2013-5-13";
		String okText2 = "2013-05-13";
		String ngText = "2013/5/13";
		String ngText2 = "2013/05/13";
		
		assertTrue(DateUtil.isValidDate(okText));
		assertTrue(DateUtil.isValidDate(okText2));
		assertFalse(DateUtil.isValidDate(ngText));
		assertFalse(DateUtil.isValidDate(ngText2));
	}

	@Test
	public void testIsValidTime() {
		String okText = "10:00";
		String okText2 = "1:0";
		String ngText = "10.00";
		String ngText2 = "1.0";
		
		assertTrue(DateUtil.isValidTime(okText));
		assertTrue(DateUtil.isValidTime(okText2));
		assertFalse(DateUtil.isValidTime(ngText));
		assertFalse(DateUtil.isValidTime(ngText2));
	}

}
