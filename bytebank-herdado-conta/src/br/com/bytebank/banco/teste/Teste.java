package br.com.bytebank.banco.teste;

//import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22,33);
		ContaPoupanca cp = new ContaPoupanca(33,22);
		Cliente c = new Cliente();
		Object ocp = new ContaPoupanca(22, 33);

		System.out.println(cc.toString());
		//System.out.println(cc);
		System.out.println(cp);
		println(cp);
	}

	static void println() {}

	static void println(int a) {}

	static void println(boolean valor) {}

	static void println(Object conta) {}
}