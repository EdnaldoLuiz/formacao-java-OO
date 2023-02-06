
public class TestaReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		g1.setNome("Foi");
		g1.setSalario(5000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer ds = new Designer();
		ds.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(ds);

        System.out.println(controle.getSoma());


	}

}
