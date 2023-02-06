package br.com.bytebank.banco.modelo;
/**
 * 
 * @author Ednaldo
 * @version 0.1
 */
public abstract class Conta {

protected double saldo;
private int agencia;
private int numero;
private Cliente titular;
private static int total = 0;

/**
 * Construtor para inicializar o objeto apartir da agencia e o número 
 * @param agencia
 * @param numero
 */

public Conta(int agencia, int numero) {
	Conta.total++;
	this.agencia = agencia;
	this.numero = numero;
	/* código omitido */
}


   public abstract void deposita (double valor);
   
   /**
    * Valor precisa ser menor ou igual o saldo
    * @param valor
    * @throws SaldoInsuficienteException
    */
   public void saca (double valor) throws SaldoInsuficienteException {

       if (this.saldo < valor) {
         throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
         /* codigo omitido */
  }
       this.saldo -= valor;
   }
   public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
       this.saca(valor);
          this.saldo -= valor;
          destino.deposita(valor);
   }
   

   public double getSaldo() {
     return this.saldo;
   }
   
   public int getNumero() {
	   return this.numero;
   }
   
   public void setNumero () {
	   if(numero <= 0) {
		   System.out.println("NNNNN");
		   return;
	   }
	
   }

   public int getAgencia() {
     return this.agencia;
   }

   public void setAgencia(int agencia) {
   if (agencia <= 0) {
   System.out.println("Não pode valor igual ou menor que 0");
   return;
   }
   
     this.agencia = agencia;
   }
   
   public void setTitular(Cliente titular){
       this.titular = titular;
   }

   public Cliente getTitular(){
       return this.titular;
   }

   public static int getTotal(){
       return Conta.total;
   }
   
   @Override
	public String toString() {
	   return "Numero: " + this.numero + ", Agencia: " + this.agencia;
//	   return super.toString();
	}
   @Override
   public boolean equals(Object ref) {
	   
	   Conta outra = (Conta) ref;
	   
	   if(this.agencia != outra.agencia) {
		   return false;
	   }
	   if(this.numero != outra.numero) {
		   return false;
	   }
		   return true;
   }
}
