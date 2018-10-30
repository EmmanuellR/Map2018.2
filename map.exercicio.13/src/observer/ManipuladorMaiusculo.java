package observer;

public class ManipuladorMaiusculo extends ManipuladorAbstrato{

	@Override
	protected String transformarString(String string) {
		// TODO Auto-generated method stub
		return string.toUpperCase();
	}

}
