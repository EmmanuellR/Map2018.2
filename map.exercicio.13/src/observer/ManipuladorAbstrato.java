package observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class ManipuladorAbstrato {
	
	public final void manipularString() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite: ");
		String string = reader.readLine();

		System.out.println("Convertido: " + transformarString(string));
		System.out.println();
	}

	protected abstract String transformarString(String string);
}
