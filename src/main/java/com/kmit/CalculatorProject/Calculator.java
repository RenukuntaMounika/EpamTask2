package com.kmit.CalculatorProject;

public class Calculator 
{
	int addNumbers(int firstNumber,int secondNumber)
	{
		int result=firstNumber+secondNumber;
		return result;
	}
	int multiplyNumbers(int firstNumber,int secondNumber)
	{
		int result=firstNumber*secondNumber;
		return result;
	}
	int divideNumbers(int firstNumber,int secondNumber)
	{
		int result=-1;
		if(secondNumber!=0)
			result=firstNumber/secondNumber;
		return result;
	}
}
