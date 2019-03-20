package com.kmit.InterestProject;

public class CalculateInterest {
	
	double calculateSimpleInterest(double amount,double years,double rateOfInterest)
	{
		double simpleInterest=(amount*years*rateOfInterest)/100;
		return simpleInterest;
	}
	
	double calculateCompoundInterest(double amount,double years,double rateOfInterest)
	{
		double compoundInterest=amount*Math.pow(1.0+rateOfInterest/100.0,years)-amount;
		return compoundInterest;
	}
}
