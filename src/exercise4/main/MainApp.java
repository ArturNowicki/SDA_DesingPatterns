package exercise4.main;

import exercise4.calculator.Calculator;
import exercise4.calculator.operations.Add;
import exercise4.calculator.operations.Divide;

public class MainApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator(new Add());
		System.out.println(calc.calculate(4, 6));
		calc = new Calculator(new Divide());
		System.out.println(calc.calculate(6, 2));
	}

}
