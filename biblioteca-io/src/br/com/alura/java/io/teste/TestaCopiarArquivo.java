package br.com.alura.java.io.teste;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("hhhhuhhhuhuhu");
		bw.write(System.lineSeparator());
		bw.write("ffffffffff");
		
		bw.close();

}
}
