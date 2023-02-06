package listas;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Eu", 20);
		Funcionario f2 = new Funcionario("Tu", 26);
		Funcionario f3 = new Funcionario("Eufff", 25);
		Funcionario f4 = new Funcionario("Tuhhhh", 46);
		
		Set<Funcionario> func = new TreeSet<>(new OrdenaPorIdade());
		
		func.add(f1);
		func.add(f2);

		func.add(f3);
		func.add(f4);

		
		Iterator<Funcionario> it = func.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getNome());
		}
	}

}
