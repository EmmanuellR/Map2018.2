package singleton;

import java.sql.DriverManager;

public class Conexao {
	private static Conexao conexao;
	private static String url = "localhost:000/exemplo";
	private static String username = "root";
	private static String password  = "root";
	private static Conexao instancia;
	
	private static Conexao conexao() {		
		if(instancia == null) {
			try {
				instancia = (Conexao) DriverManager.getConnection(url, username, password);
			} catch (Exception e) {
				 System.out.println("Falha ao conectar com banco de dados.");
			}
		}		
		return conexao;
		
	}
	
	public static Conexao getInstancia() {
		if (instancia == null) {
			instancia = new Conexao();
		}
		return conexao;
		}
	
	public Conexao getConectar() {
		return Conexao.conexao;
	}
	

}
