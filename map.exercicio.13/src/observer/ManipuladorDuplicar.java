package observer;

public class ManipuladorDuplicar extends ManipuladorAbstrato {

	@Override
	protected String transformarString(String string) {
		// TODO Auto-generated method stub
		return string + " " + string;
	}

}
