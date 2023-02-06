package stack.test;

//caso a exception criada estenda diretamente a Exception, devera ficar explicito do lado do metodo atraves da palavra throws
public class MinhaExcecao extends RuntimeException{
	
	public MinhaExcecao(String msg) {
		super(msg);
	}

}
