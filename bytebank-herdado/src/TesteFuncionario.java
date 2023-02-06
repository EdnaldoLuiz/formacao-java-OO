
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente edn = new Gerente();
		
		edn.setNome("Ednaldo");
		edn.setCpf("324.342.344-55");
		edn.setSalario(453.6);
		
		System.out.println(edn.getNome());
		System.out.println(edn.getCpf());
		System.out.println(edn.getSalario());
		
	}

}
