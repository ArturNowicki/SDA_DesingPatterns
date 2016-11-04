package exercise4.calculator.operations;

public class Divide implements Operation {
	@Override
	public double execute(double arg1, double arg2) {
		if(arg2 == 0) {
			throw new IllegalArgumentException("Division by zero!");
		}
		return arg1 / arg2;
	}
}
