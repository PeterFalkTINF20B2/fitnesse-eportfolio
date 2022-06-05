package test;

import codeToTest.Calculator;

public class TestCalculator {
	private double op1, op2;
	Calculator cal = new Calculator();

	public double sum() {
		return cal.sum(op1, op2);
	}

	public double dif() {
		return cal.dif(op1, op2);
	}

	public double mul() {
		return cal.mul(op1, op2);
	}

	public double div() {
		return cal.div(op1, op2);
	}

	public void setOp1(double op1) {
		this.op1 = op1;
	}

	public void setOp2(double op2) {
		this.op2 = op2;
	}
}