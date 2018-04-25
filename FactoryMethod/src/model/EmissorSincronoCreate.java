package model;

public class EmissorSincronoCreate extends EmissorCreate{
		
	public Emissor create (int tipoDeEmissor ) {		
		
		EmissorCreate creator = new EmissorSincronoCreate () ;
		Emissor emissor = creator . create ( EmissorCreate .JMS);
		emissor . envia ("K19 - Treinamentos ") ;
		
		if( tipoDeEmissor == EmissorCreate.SMS ) {
			return new EmissorSMS () ;
		} 
		
		else if( tipoDeEmissor == EmissorCreate . EMAIL ) {
			return new EmissorEmail () ;
		}
		
		else if( tipoDeEmissor == EmissorCreate . JMS ) {
			return new EmissorJMS () ;
		} 
		
		else {
			throw new IllegalArgumentException (" Tipo de emissor não suportado ") ;
		}	
	}
}
