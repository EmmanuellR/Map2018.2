package questao4;

public class ContaBancaria {
	protected static String nome;
	protected String cpf;
	protected double saldoConta;
	protected static int numeroDaConta;
	
	public ContaBancaria(String nome, String cpf, double saldoConta, int numeroDaConta) {
		// TODO Auto-generated constructor stub
		ContaBancaria.nome = nome;
		this.cpf = cpf;
		this.saldoConta = saldoConta;
		ContaBancaria.numeroDaConta = numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		ContaBancaria.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		ContaBancaria.numeroDaConta = numeroDaConta;
	}
	
	public ContaBancaria (String cpf) {
		this.cpf = cpf;
	}
	
	public void depositar (double montante) {
		this.saldoConta += montante;
		
	}
	
	public void extratoSaldo() {
		System.out.println("Possui um valor disponivel de R$:" + saldoConta + " em sua conta.");
	}
	


}
