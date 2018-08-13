package questao4;

public class ContaBancariaExe extends ContaBancaria{

	public ContaBancariaExe(String nome, String cpf, double saldoConta) {
		super(nome, cpf, saldoConta, numeroDaConta);
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args) {
		ContaBancaria contabancaria = new ContaBancaria("Emmanuell de Araujo Ramalho", "627.567.264-19", 100, 309283044);
		System.out.println("O cliente: " + nome);
		contabancaria.extratoSaldo();
		System.out.println("DEPOSITO REALIZADO");
		contabancaria.depositar(100);
		contabancaria.extratoSaldo();
		
		
	}

}
