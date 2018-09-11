package builder;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactoryBuild{

	@Override
	public MassaFina massa() {
		// TODO Auto-generated method stub
		return new MassaFina();
	}

	@Override
	public MolhoVermelho molho() {
		// TODO Auto-generated method stub
		return new MolhoVermelho();
	}

	@Override
	public Queijo queijo() {
		// TODO Auto-generated method stub
		return  new QueijoPrata();
	}

	@Override
	public Vegetais[] vegetais() {
		Vegetais vegetais[] = { new AzeitonasPretas(),
		                      new Espinafre(),
		                      new Berinjela() };
		return vegetais;
	}
	@Override
	public CalabresaFrita calabresa() {
		// TODO Auto-generated method stub
		return new CalabresaFrita();
	}

	@Override
	public Mexilao mexilao() {
		// TODO Auto-generated method stub
		return new Lagosta();
	}

}
