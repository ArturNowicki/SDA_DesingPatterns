package exercise4.calculator;

import exercise4.calculator.operations.Operation;

public class Calculator {
	private Operation operation;
	
	public Calculator(Operation operation) {
		this.operation = operation;
	}
	
	public double calculate(double arg1, double arg2) {
		return operation.execute(arg1, arg2);
	}
}
