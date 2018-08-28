package composicao;

public class Passageiro {
	private int numeroSmiles;
	private Pessoa pessoa;
	
	public Passageiro(int numeroSmiles, Pessoa pessoa) {
		// TODO Auto-generated constructor stub
		this.numeroSmiles = numeroSmiles;
		this.pessoa = pessoa;
	}

	public int getNumeroSmiles() {
		return numeroSmiles;
	}

	public void setNumeroSmiles(int numeroSmiles) {
		this.numeroSmiles = numeroSmiles;
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
