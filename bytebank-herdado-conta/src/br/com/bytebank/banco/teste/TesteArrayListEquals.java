package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 333);
		Conta cc2 = new ContaCorrente(22, 333);
		
		lista.add(cc1);
		
		boolean existe = lista.contains(cc2);
		System.out.println("Tem na lista " + existe);
		
		boolean igual = cc1.equals(cc2);
		System.out.println(igual);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}


	}


