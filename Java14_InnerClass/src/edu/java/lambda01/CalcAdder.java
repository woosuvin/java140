package edu.java.lambda01;

import edu.java.lambda01.Calculator.Calculable;

public class CalcAdder implements Calculable { // 계산 규칙 만듦
	
	@Override
	public double calculate(double x, double y) {
		return x + y;
	}
	
}
