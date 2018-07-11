package com.qa.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.qa.calculations.Addition;
import com.qa.calculations.Subtraction;

public class CalculatorTest {

	private Subtraction subtraction;
	private Addition addition;
	private Multiplication multiplication;

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
	
	@Before
	public void setUp() {
		multiplication = new Multiplication();
	}

	@Test
	public void multiplyTest() {

		int actualResult = Multiplication.multiply(9, 4);

		assertEquals(0, actualResult);

	}

}
