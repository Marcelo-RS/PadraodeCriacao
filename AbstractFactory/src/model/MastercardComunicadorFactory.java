package model;

public class MastercardComunicadorFactory implements ComunicadorFactory {

	private EmissorCreate emissorCreator = new EmissorCreate();
	private ReceptorCreate receptorCreator = new ReceptorCreate();

	public Emissor createEmissor() {

		return emissorCreator.create(EmissorCreate.MASTERCARD);
	}

	public Receptor createReceptor() {
		
		return receptorCreator.create(ReceptorCreate.MASTERCARD);
	}
}
