package com.kmit.EstimateConstructionCostProject;

public class EstimateConstructionCost {
	public static final int NORMAL_COST=1200;
	public static final int MEDIUM_COST=1500;
	public static final int HIGH_COST=1800;
	public static final int HIGH_AUTOMATED_COST=2500;
	/*
	  ->material standards are considered as-
	     1.normal for standard materials
	     2.medium for above standard materials
	     3.high for high standard materials
	     4.high and automated for high standard materials and fully automated
	  ->fully automated is considered as-
	     1.yes for fully automated
	     2.no for not fully automated
	 */
	double estimateCost(double area,String materialStandard,String automated)
	{
		double totalCost=0;
		if(materialStandard.equals("normal"))
			totalCost=area*NORMAL_COST;
		else if(materialStandard.equals("medium"))
			totalCost=area*MEDIUM_COST;
		else 
		{
			if(materialStandard.equals("high") && !isAutomated(automated))
				totalCost=area*HIGH_COST;
			else
				totalCost=area*HIGH_AUTOMATED_COST;
		}
		return totalCost;
	}
	boolean isAutomated(String automated)
	{
		if(automated.equals("yes"))
			return true;
		else
			return false;
	}
}
