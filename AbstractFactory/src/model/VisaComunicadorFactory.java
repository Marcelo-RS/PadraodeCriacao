package model;

public class VisaComunicadorFactory implements ComunicadorFactory {

	private EmissorCreate emissorCreator = new EmissorCreate();
	private ReceptorCreate receptorCreator = new ReceptorCreate();

	public Emissor createEmissor() {

		return emissorCreator.create(EmissorCreate.VISA);
	}

	public Receptor createReceptor() {

		return receptorCreator.create(ReceptorCreate.VISA);
	}
}
