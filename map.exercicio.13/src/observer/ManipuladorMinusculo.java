package observer;

public class ManipuladorMinusculo extends ManipuladorAbstrato{

	@Override
	protected String transformarString(String string) {
		// TODO Auto-generated method stub
		return string.toLowerCase();
	}

}
