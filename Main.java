package br.com.cdb.bancodigital;
public class Main {
	public static void main(String[] args) {
		Conta contaPoupanca = new Conta(123456);
		contaPoupanca.depositar(1000);
		
		Conta contaCorrente = new Conta(654321);
		contaCorrente.depositar(500);
		
		System.out.println("A conta: " + contaCorrente.getNumero() + ", possui "
				+ "R$" + contaCorrente.getSaldo() + " de saldo!");
		System.out.println("A conta: " + contaPoupanca.getNumero() + ", possui "
				+ "R$" + contaPoupanca.getSaldo() + " de saldo!");
	}
}
