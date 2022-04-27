package codeToTest;

public class Calculation {
	private int first, second;

	public int addition() {
		return (first + second);
	}
	
	public int minus() {
		return (first - second);
	}
	
	public int multiply() {	
		return (first * second);
	}
	
	public double divide() {
		return (first/second);
	}
	
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}