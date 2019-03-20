package com.kmit.InterestProject;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateInterestTest {
	
	@Test
	public void test()
	{
		CalculateInterest cal=new CalculateInterest();
		assertEquals(300.0,cal.calculateSimpleInterest(1000,2,15),0.0001);
		assertEquals(322.4999999999998,cal.calculateCompoundInterest(1000,2,15),0.0001);
	}
}
