package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.subtraction.Subtraction;

public class CalculatorTest {

	private Subtraction subtraction;
	private Addition addition;

	@Before
	public void setUp() {
		subtraction = new Subtraction();
	}

	@Test
	public void subtractTest() {

		int actualResult = subtraction.subtract(9, 4);

		assertEquals(5, actualResult);

	}

	@Before
	public void additionSetUp() {
		addition = new Addition();
	}

	@Test
	public void addTest() {

		int actualResult = addition.add(13, 7);

		assertEquals(20, actualResult);

	}

}
