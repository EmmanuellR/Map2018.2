package composicao;

public class Agente {
	private int idAgente;
	private Pessoa pessoa;
	
	public Agente(int idAgente, Pessoa pessoa) {
		// TODO Auto-generated constructor stub
		this.idAgente = idAgente;
		this.pessoa = pessoa;
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}
	
	public String getNome() {
		return this.pessoa.getNome();
		
	}
	public void setNome(String nome) {
		pessoa.setNome(nome);
		
	}

	public void setEndereco (String endereco) {
		pessoa.setEndereco(endereco);
	}

	public String getEndereco() {
		return this.pessoa.getEndereco();
	}

}
