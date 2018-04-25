package model;

public class EmissorJMS implements Emissor {

	public void envia(String mensagem) {

		Emissor emissor = new EmissorJMS();
		System.out.println(" Enviando por JMS a mensagem : ");
		System.out.println(mensagem);
	}
}
