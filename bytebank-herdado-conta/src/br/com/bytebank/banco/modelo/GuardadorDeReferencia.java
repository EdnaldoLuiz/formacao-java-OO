package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencia {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeReferencia() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0; 
	}

	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
	}
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;

}

	public Object getReferencia(int i) {
		return this.referencias[i];
	}
}
