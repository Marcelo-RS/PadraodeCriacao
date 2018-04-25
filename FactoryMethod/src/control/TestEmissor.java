package control;

import model.Emissor;
import model.EmissorCreate;
import model.EmissorEmail;
import model.EmissorJMS;
import model.EmissorSMS;

public class TestEmissor {
	
	public static void main ( String [] args ) {
		
		EmissorCreate creator = new EmissorCreate () ;
		
		Emissor emissor1 = new EmissorSMS () ;
		emissor1 . envia ("K19 Treinamentos ") ;
		
		 Emissor emissor2 = new EmissorEmail () ;
		 emissor2 . envia ("K19 Treinamentos ") ;
		
		 Emissor emissor3 = new EmissorJMS () ;
		emissor3 . envia ("K19 Treinamentos ") ;
		//ss
	}
}
