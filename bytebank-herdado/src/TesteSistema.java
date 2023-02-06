
public class TesteSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		
		Autenticavel referencia0 = new Gerente();

		Autenticavel referencia1 = new Cliente();

		Autenticavel referencia2 = new Administrador();

	}

}
