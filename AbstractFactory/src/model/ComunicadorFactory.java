package model;

public interface ComunicadorFactory {
		
	Emissor createEmissor();
	Receptor createReceptor();
	
}
