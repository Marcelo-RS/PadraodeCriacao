package control;

import model.BBBoletoBuilder;
import model.Boleto;
import model.BoletoBuilder;
import model.GeradorDeBoleto;

public class TestaGeradorDeBoleto {
	
	public static void main (String[] args) {
	
		BoletoBuilder boletoBuilder = new BBBoletoBuilder ();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto (boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto ();
		System.out.println (boleto);
	}	
}
