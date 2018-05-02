package control;

import model.Tema;

public class TestaTema {

	public static void main (String[] args) {
		
		Tema temaFire = Tema.getInstance (Tema.FIRE);
		System.out.println ("Tema" + temaFire.getNome ());
		System.out.println ("\nCor Da Fonte: " + temaFire.getCorDaFonte ());

		System.out.println ("Cor Do Fundo: " + temaFire.getCorDoFundo ());

		Tema temaFire2 = Tema.getInstance (Tema.FIRE);

		System.out.println ("\n-----------------------\n");
		System.out.println ("Comparando as referências...\n");
		System.out.println (temaFire == temaFire2);
	}
}
