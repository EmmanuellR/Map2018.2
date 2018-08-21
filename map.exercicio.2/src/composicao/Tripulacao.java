package composicao;

public class Tripulacao {
		private int idTripulacao;
		private Pessoa pessoa;
	
	public Tripulacao(int idTripulacao, Pessoa pessoa) {
		// TODO Auto-generated constructor stub
		this.idTripulacao = idTripulacao;
		this.pessoa = pessoa;
	}

	public int getIdTripulacao() {
		return idTripulacao;
	}
	
	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
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
