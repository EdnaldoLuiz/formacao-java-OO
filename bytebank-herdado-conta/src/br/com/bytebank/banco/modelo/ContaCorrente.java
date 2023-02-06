package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero){
	    super(agencia, numero);
	}
	@Override
	public void saca (double valor) throws SaldoInsuficienteException {

	       if (this.saldo < valor) {
	         throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor de saque: " + valor);
	  }
	       this.saldo -= valor;
	   }
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
		
	}
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}

}
