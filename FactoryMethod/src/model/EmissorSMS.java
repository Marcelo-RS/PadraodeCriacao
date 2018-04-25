package model;

public class EmissorSMS implements Emissor {

	public void envia(String mensagem) {

		Emissor emissor = new EmissorSMS();
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println(mensagem);
	}
}
