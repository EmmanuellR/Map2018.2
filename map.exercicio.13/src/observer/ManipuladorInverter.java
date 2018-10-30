package observer;

public class ManipuladorInverter extends ManipuladorAbstrato {

	@Override
	protected String transformarString(String string) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		
		return buffer.toString();
	}

}
