package FactoryMethod;

import FactoryMethod.Good.FabricaFiat;
import FactoryMethod.Good.FabricaChevolet;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Good good = new Good();
		
		FabricaFiat fabricafiat = good.new FabricaFiat();
	    CarroSedan sedan = fabricafiat.criarCarroSedan();
	    CarroPopular popular = fabricafiat.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	    
	    FabricaChevolet fabricaford = good.new FabricaChevolet();
	    sedan = fabricaford.criarCarroSedan();
	    popular = fabricaford.criarCarroPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	  }

	}

