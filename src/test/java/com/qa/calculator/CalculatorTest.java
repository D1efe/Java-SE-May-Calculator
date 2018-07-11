package com.qa.calculator;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	
	@BeforeClass
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void subtractTest() {

		int expectedResult;
		int actualResult = Subtraction.subtract();
		
		assertEquals(expectedResult, actualResult);
		
	}

}
