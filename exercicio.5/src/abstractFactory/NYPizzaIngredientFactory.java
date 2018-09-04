package abstractFactory;

import interfaces.Calabresa;
import interfaces.Mexilhoes;
import interfaces.PizzaIngredientFactory;
import interfaces.Queijo;

public abstract class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Queijo CriandoQueijo() {
		return new QueijoDoReino();
	}
	public Vegetais CriandoVegetais() {
		return new Vegetais();
	}
	public Calabresa CriandoCalabrasa() {
		return new CalabresasEmFatias();
	}
	public Mexilhoes CriandoMexilhoes() {
		return null;
	}

}
