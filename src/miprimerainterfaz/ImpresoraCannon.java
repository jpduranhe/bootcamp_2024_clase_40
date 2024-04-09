package miprimerainterfaz;

public class ImpresoraCannon implements Imprimir,ImprimirConInjectores  {

	@Override
	public void imprimir() {
		System.out.println("Soy una impresora Cannon");
		
	}

	@Override
	public String printInject(String texto) {
		return "TextoInJectado: "+texto;
	}

}
