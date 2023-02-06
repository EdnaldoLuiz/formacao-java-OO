package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencia;

public class TestGuardadorReferencia {

	public static void main(String[] args) {
		
		GuardadorDeReferencia gd = new GuardadorDeReferencia();
		
		Conta cc = new ContaCorrente(11, 22);
		gd.adiciona(cc);
		
		Conta cp = new ContaPoupanca(99, 11);
		gd.adiciona(cp);
		
		int tamanho = gd.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) gd.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
