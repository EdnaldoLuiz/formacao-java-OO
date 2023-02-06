package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		Conta[] conta = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 99);
		ContaPoupanca cc2 = new ContaPoupanca(22, 88);
		
		conta[0] = cc1;
		conta[1] = cc2;
		
		System.out.println(conta[0].getNumero());
		
		ContaCorrente ref = (ContaCorrente) conta[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
