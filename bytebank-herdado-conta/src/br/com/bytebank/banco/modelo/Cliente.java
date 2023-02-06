package br.com.bytebank.banco.modelo;
/**
 * 
 * @author Ednaldo
 * @version 0.1
 *
 */
public class Cliente {
	/* código omitido */

String cpf;
String profissao;
String localidade;
String nome;
public String getNome() {
  return this.nome;
}

public void setNome(String nome) {
  this.nome = nome;
}
public String getProfissao() {
  return this.profissao;
}
public void setProfissao(String nome) {
  this.profissao = nome;
}
}