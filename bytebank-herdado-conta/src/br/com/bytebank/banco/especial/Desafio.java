package br.com.bytebank.banco.especial;

import java.util.Scanner;

public class Desafio {

	  public static void main(String[] args) {
	  System.out.print("Quantas notas deseja informar? ");

	  Scanner scanner = new Scanner(System.in);

	  int notasAlunos = scanner.nextInt();

	  double[] notas = new double[notasAlunos];
	  scanner.close();

	  for(int i = 1; i <= notas.length; i++) {
	    System.out.println("Informe a " + i + "° nota: ");
	    scanner.nextDouble();
	  }


	  }

	}
