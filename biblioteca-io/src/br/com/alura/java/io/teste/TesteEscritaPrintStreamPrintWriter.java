package br.com.alura.java.io.teste;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("escrevendo um arquivo txt");
		ps.print("testando");
		
		ps.close();
	

	}

}
