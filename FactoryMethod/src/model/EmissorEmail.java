package model;

public class EmissorEmail implements Emissor {
	
	public void envia(String mensagem) {
	
		Emissor emissor = new EmissorEmail();
		System.out.println(" Enviando por email a mensagem : ");
		System.out.println(mensagem);
	}
}
