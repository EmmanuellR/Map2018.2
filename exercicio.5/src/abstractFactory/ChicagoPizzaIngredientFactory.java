package abstractFactory;

import interfaces.Calabresa;
import interfaces.Massa;
import interfaces.Mexilhoes;
import interfaces.Molho;
import interfaces.PizzaIngredientFactory;
import interfaces.Queijo;

public abstract class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Massa criandoMassas() {
		// TODO Auto-generated method stub
		return new MassasFinas();
	}

	@Override
	public Molho criandoMolhos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Queijo criandoQueijos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vegetais[] criandoVegetais() {
		Vegetais veggies[] = {
			new AzeitonaPreta(),
			new Espinafre(),
			new Berinjela()			
		};
		// TODO Auto-generated method stub
		return veggies;
	}

	@Override
	public Calabresa criandoCalabresa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mexilhoes criandoMexilhoes() {
		// TODO Auto-generated method stub
		return null;
	}

}
