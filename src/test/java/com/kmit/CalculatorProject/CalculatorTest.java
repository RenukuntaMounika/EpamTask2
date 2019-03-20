package com.kmit.CalculatorProject;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {
	
	@Test
	public void test()
	{
		Calculator calculator=new Calculator();
		assertEquals(5,calculator.addNumbers(2,3));
		assertEquals(10,calculator.multiplyNumbers(2,5));
		assertEquals(2,calculator.divideNumbers(6,3));
		assertEquals(-1,calculator.divideNumbers(5,0));
	}
}
