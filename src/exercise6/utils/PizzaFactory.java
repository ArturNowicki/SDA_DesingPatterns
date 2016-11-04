package exercise6.utils;

import java.util.List;

import exercise6.pizza.Margherita;
import exercise6.pizza.Pizza;
import exercise6.pizza.Prosciutto;
import exercise6.pizza.QuattroFromaggi;

public class PizzaFactory {

	public Pizza makeEmptyPizza() {
		return new Pizza() {};
	}

	public Pizza makeEmptyPizza(List<String> ingredients) {
		return new Pizza(ingredients) {
		};
	}
	
	public Pizza makeMargherita() {
		return new Margherita();
	}

	public Pizza makeQuattroFromaggi() {
		return new QuattroFromaggi();
	}
	
	public Pizza makeProsciutto() {
		return new Prosciutto();
	}
}
