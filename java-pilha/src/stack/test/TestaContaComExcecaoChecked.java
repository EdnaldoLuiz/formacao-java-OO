package stack.test;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao me) {
			System.out.println("tratamento...");
		}
	}

}
