package exercicio_4;

public class Good {
	 abstract class FabricaFiat implements FabricaDeCarros {
		 
		    public CarroSedan criacaoCarroSedan() {
		        return new CarroSedan();
		    }
		 
		    public CarroPopular criacaoCarroPopular() {
		        return new CarroPopular();
		    }
		    
		    
		    
		  }
		  class FabricaFord implements FabricaDeCarros{

			public CarroSedan criacaoCarroSedan() {
				return new FordKaSedan();
			}

			
			public CarroPopular criacaoCarroPopular() {
				return new FordaKa();
			}
			  
		  }
		  
		  interface CarroPopular {
		    void exibirInfoPopular();
		  }
		  interface CarroSedan {
		    void exibirInfoSedan();
		  }
		  class FordKaSedan implements CarroSedan{

			public void exibirInfoSedan() {
				System.out.println("Modelo: Forda Ka Sedan\n Fábrica: Ford\nCategoria:Sedan");
				
			}
			  
		  }
		  class FordaKa implements CarroPopular{

			
			public void exibirInfoPopular() {
				System.out.println("Modelo: Forda Ka\n Fábrica: Ford\nCategoria:Popular");
				
			}
			  
		  }
		  
		  class Palio implements CarroPopular {
			  
			  
			    public void exibirInfoPopular() {
			        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
			    }
			  }
			  class Siena implements CarroSedan {
			 
			    public void exibirInfoSedan() {
			        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
			    }
			  }
			  public static void main(String[] args) {
				  Good g = new Good();
				  FabricaFiat fabrica = g.new FabricaFiat();
			    CarroSedan sedan = fabrica.criacaoCarroSedan();
			    CarroPopular popular = fabrica.criacaoCarroPopular();
			    sedan.exibirInfoSedan();
			    System.out.println();
			    popular.exibirInfoPopular();
			    System.out.println();
			    
			    FabricaFord fabrica2 = g.new FabricaFord();
			    sedan = fabrica2.criacaoCarroSedan();
			    popular = fabrica2.criacaoCarroPopular();
			    sedan.exibirInfoSedan();
			    System.out.println();
			    popular.exibirInfoPopular();
			  }


}
