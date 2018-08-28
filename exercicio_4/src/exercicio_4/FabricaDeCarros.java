package exercicio_4;

import exercicio_4.Good.CarroPopular;
import exercicio_4.Good.CarroSedan;

public interface FabricaDeCarros {
	CarroSedan criacaoCarroSedan();
	CarroPopular criacaoCarroPopular();
}
