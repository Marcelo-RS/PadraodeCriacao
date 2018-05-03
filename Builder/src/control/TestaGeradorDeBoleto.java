package control;

import model.BBBoletoBuilder;
import model.BBrBoletoBuilder;
import model.BIBoletoBuilder;
import model.Boleto;
import model.BoletoBuilder;
import model.GeradorDeBoleto;

public class TestaGeradorDeBoleto {
	
	public static void main (String[] args) {
	
		BoletoBuilder boletoBuilder = new BBBoletoBuilder ();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto (boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto ();
		System.out.println (boleto);
		
		BoletoBuilder boletoBuilder2 = new BIBoletoBuilder ();
		GeradorDeBoleto geradorDeBoleto2 = new GeradorDeBoleto (boletoBuilder2);
		Boleto boleto2 = geradorDeBoleto2.geraBoleto ();
		System.out.println (boleto2);
		
		BoletoBuilder boletoBuilder3 = new BBrBoletoBuilder ();
		GeradorDeBoleto geradorDeBoleto3 = new GeradorDeBoleto (boletoBuilder3);		
		Boleto boleto3 = geradorDeBoleto3.geraBoleto ();
		System.out.println (boleto3);
	}	
}