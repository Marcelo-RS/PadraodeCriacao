package control;

import model.ComunicadorFactory;
import model.Emissor;
import model.Receptor;
import model.VisaComunicadorFactory;

public class TestaVisaComunicadorFactory {

	public static void main(String[] args) {
		
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		
		String transacao = "\nValor = 560\nSenha = 123";		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
