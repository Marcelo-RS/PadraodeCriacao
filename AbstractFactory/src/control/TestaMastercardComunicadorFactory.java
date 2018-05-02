package control;

import model.ComunicadorFactory;
import model.Emissor;
import model.Receptor;
import model.MastercardComunicadorFactory;

public class TestaMastercardComunicadorFactory {
	
	public static void main (String[] args) {
		
		ComunicadorFactory comunicadorFactory = new MastercardComunicadorFactory();
		
		String transacao = "\nValor = 890\nSenha = 453";		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
