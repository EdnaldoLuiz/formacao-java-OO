package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
	
	public static void main(String[] args) {
		Object cc = new ContaCorrente(123, 456);
		Object cp = new ContaPoupanca(789, 222);
		
		System.out.println(cp);
		System.out.println(cc);
	}

}
