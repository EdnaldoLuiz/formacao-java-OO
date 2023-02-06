
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setNome("Ednaldo");
		g1.setCpf("324.342.344-55");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(1222);
		boolean autenticou = g1.autentica(1222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
