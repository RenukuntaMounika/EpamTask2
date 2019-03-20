package com.kmit.EstimateConstructionCostProject;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstimateConstructionCostTest {
	@Test
	public void test()
	{
		EstimateConstructionCost ec=new EstimateConstructionCost();
		assertEquals(600000.0,ec.estimateCost(500,"normal","no"),0.001);
		assertEquals(750000.0,ec.estimateCost(500,"medium","no"),0.001);
		assertEquals(900000.0,ec.estimateCost(500,"high","no"),0.001);
		assertEquals(1250000.0,ec.estimateCost(500,"high","yes"),0.001);
	}
}
