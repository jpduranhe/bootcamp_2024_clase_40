package miprimerainterfaz;

public class ImpresoraEpson implements Imprimir, ImpresionMatrizDePunto {

	
	@Override
	public void imprimir() {
		System.out.println("Soy una impresora Epson");
	}

	@Override
	public void printDotMatrix() {
		System.out.println("::..::..::..::");
		
	}
}
