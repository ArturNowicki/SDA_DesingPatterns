package exercise6.pizza;

public class QuattroFromaggi extends Pizza {
	public QuattroFromaggi() {
		name = PizzaType.QUATTRO_FROMAGGI.toString();
		ingredients.add("pecorino");
		ingredients.add("gorgonzola");
		ingredients.add("groviera");
		ingredients.add("parmesan");
		ingredients.add("fontina");
	}
}
