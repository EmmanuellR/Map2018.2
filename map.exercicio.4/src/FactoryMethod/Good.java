package FactoryMethod;
import FactoryMethod.CarroPopular;
import FactoryMethod.CarroSedan;

public class Good {
	
	class FabricaFiat implements FabricaDeCarro {
		 
	    @Override
	    public CarroSedan criarCarroSedan() {
	        return new GranSiena();
	    }
	 
	    @Override
	    public CarroPopular criarCarroPopular() {
	        return new Mobi();
	    }
	  }
	  class FabricaChevolet implements FabricaDeCarro{

		public CarroSedan criarCarroSedan() {
			return new Camaro();
		}

		
		public CarroPopular criarCarroPopular() {
			return new CruzeSedan();
		}
		  
	  }
	  
	  }
	  class Camaro implements CarroSedan{

		public void exibirInfoSedan() {
			System.out.println("Modelo: Camaro \n F�brica: Chevrolet\nCategoria:Sedan");
			
		}

		@Override
		public void impressaoDoCarroSedan() {
			// TODO Auto-generated method stub
			
		}
		  
	  }
	  class CruzeSedan implements CarroPopular{

		
		public void exibirInfoPopular() {
			System.out.println("Modelo: Cruze Hacth\n F�brica: Chevrolet\nCategoria:Popular");
			
		}

		@Override
		public void impressaoDoCarroPopular() {
			// TODO Auto-generated method stub
			
		}
		  
	  }
	  
	  class Mobi implements CarroPopular {
	 
	 
	    public void exibirInfoPopular() {
	        System.out.println("Modelo: Mobi\nF�brica: Fiat\nCategoria:Popular");
	    }

		@Override
		public void impressaoDoCarroPopular() {
			// TODO Auto-generated method stub
			
		}
	  }
	  class GranSiena implements CarroSedan {
	 
	    public void exibirInfoSedan() {
	        System.out.println("Modelo: Gran Siena\nF�brica: Fiat\nCategoria:Sedan");
	    }

		@Override
		public void impressaoDoCarroSedan() {
		
		}
	  }


