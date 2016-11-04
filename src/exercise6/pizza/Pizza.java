package exercise6.pizza;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Pizza {

	String name;
	ArrayList<String> ingredients;
	
	public Pizza() {
		name = "empty pizza";
		ingredients = new ArrayList<String>();
		ingredients.add("tomato sauce");
		ingredients.add("mozzarella");
	}
	
	public Pizza(List<String> ingredients) {
		name = "custom pizza";
		this.ingredients = new ArrayList<String>();
		this.ingredients.add("tomato sauce");
		this.ingredients.add("mozzarella");
		this.ingredients.addAll(ingredients);
	}
	
	public void addIngredient(String ingredient) {
		ingredients.add(ingredient);
	}
	
	@Override
	public String toString() {
		StringBuilder pizzaInfo = new StringBuilder(name + "\n");
		pizzaInfo.append("Ingredients:\n");
		Iterator<String> it = ingredients.iterator();
		while(it.hasNext()) {
			pizzaInfo.append(it.next().toString() + "\n");
		}
		return pizzaInfo.toString();
	}

}
