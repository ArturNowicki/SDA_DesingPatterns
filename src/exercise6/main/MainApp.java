package exercise6.main;

import java.util.Arrays;
import java.util.List;

import exercise6.pizza.Pizza;
import exercise6.utils.PizzaFactory;

public class MainApp {

	public static void main(String[] args) {
		PizzaFactory factory = new PizzaFactory();
		Pizza somePizza = factory.makeProsciutto();
		System.out.println(somePizza);
		somePizza.addIngredient("bacon!!!!!!!");
		System.out.println(somePizza);
		Pizza emptyPizza = factory.makeEmptyPizza();
		System.out.println(emptyPizza);
		List ingredients = Arrays.asList("bacon", "bacon", "jalapeno", "onion");
		Pizza myPizza = factory.makeEmptyPizza(ingredients);
		System.out.println(myPizza);
	}

}
