package model;

public class EmissorCreate {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Emissor create (int tipoDoEmissor ) {
		
		if(tipoDoEmissor == EmissorCreate.VISA) {

			return new EmissorVisa() ;
		} 
		
		else if(tipoDoEmissor == EmissorCreate.MASTERCARD) {
			
			return new EmissorMastercard();
		}
		
		else {
			
			throw new IllegalArgumentException("Tipo de emissor não suportado");
		}
	}
}
