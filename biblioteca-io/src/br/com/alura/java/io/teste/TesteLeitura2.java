package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
		String linha = scanner.nextLine();
		System.out.println(linha);
		
		Scanner linhaScanner = new Scanner(linha);
		linhaScanner.useLocale(Locale.US);
		linhaScanner.useDelimiter(",");
		
		String tipoConta = linhaScanner.next();
		int agencia = linhaScanner.nextInt();
		int numero = linhaScanner.nextInt();
		String titular = linhaScanner.next();
		double saldo = linhaScanner.nextDouble();
		
		
		String valorFormatado = String.format("%s - %d-%d, %s: %f", tipoConta, agencia, numero, titular, saldo);
		System.out.println(valorFormatado);
		
		linhaScanner.close();
		}
		scanner.close();
		
	}

}
