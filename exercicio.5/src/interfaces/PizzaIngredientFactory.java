package interfaces;

import abstractFactory.Vegetais;

public interface PizzaIngredientFactory {
	Massa criandoMassas();
	Molho criandoMolhos();
	Queijo criandoQueijos();
	Vegetais [] criandoVegetais();
	Calabresa criandoCalabresa();
	Mexilhoes criandoMexilhoes();
	

}
