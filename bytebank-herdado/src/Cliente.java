
public class Cliente implements Autenticavel{
	
	private int senha;

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
