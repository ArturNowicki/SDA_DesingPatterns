package exercise4.calculator.operations;

public class Add implements Operation {
	@Override
	public double execute(double arg1, double arg2) {
		return arg1 + arg2;
	}
}
