package model;

public class EmissorCreate {
	
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;
	
	public Emissor create (int tipoDeEmissor ) {
		
		EmissorCreate creator = new EmissorAssincronoCreate();
		Emissor emissor = creator . create ( EmissorCreate . SMS);
		emissor.envia ("K19 - Treinamentos ") ;
		
		if( tipoDeEmissor == EmissorCreate.SMS ) {
			return new EmissorSMS () ;
		}
		
		else if( tipoDeEmissor == EmissorCreate.EMAIL ) {
			return new EmissorEmail () ;
		} 
		
		else if( tipoDeEmissor == EmissorCreate.JMS ) {
			return new EmissorJMS () ;
		}
		
		else {
			throw new IllegalArgumentException (" Tipo de emissor não suportado ") ;
		}
	}
}
