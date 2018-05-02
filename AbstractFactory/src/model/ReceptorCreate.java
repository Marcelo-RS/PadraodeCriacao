package model;

public class ReceptorCreate {

	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Receptor create(int tipoDoReceptor) {

		if(tipoDoReceptor == ReceptorCreate.VISA) {

			return new ReceptorVisa();
		}
		
		else if (tipoDoReceptor == ReceptorCreate.MASTERCARD) {

			return new ReceptorMastercard();
		}
		
		else {

			throw new IllegalArgumentException ("Tipo de receptor não suportado");
		}
	}
}
