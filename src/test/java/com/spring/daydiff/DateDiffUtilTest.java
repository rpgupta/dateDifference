package com.spring.daydiff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.spring.daydiff.util.DateDiffUtil;

class DateDiffUtilTest {

	@Test
	void test1() {

		String expected = "337.0";
		DateDiffUtil.evaluate("17-02-20", "17-03-19");
		String actual = DateDiffUtil.evaluate("17-02-20", "17-03-19");

		assertEquals(expected, actual);

	}

	@Test
	void test2() {

		String expected = "6.0";
		String actual = DateDiffUtil.evaluate("17-02-19", "17-03-20");

		assertNotEquals(expected, actual);

	}

}
