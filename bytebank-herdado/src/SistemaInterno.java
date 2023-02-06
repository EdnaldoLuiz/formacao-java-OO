
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel f1) {
		boolean autenticou = f1.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar");
		}
	}

}
