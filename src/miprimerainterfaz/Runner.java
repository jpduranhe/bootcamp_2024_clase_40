package miprimerainterfaz;

public class Runner {

	public static void main(String[] args) {
		
		ImpresoraEpson objImpresoraEpson= new ImpresoraEpson();
		ImpresoraCannon objImpresoraCannon = new ImpresoraCannon();
		
		
		
		objImpresoraEpson.imprimir();
		objImpresoraCannon.imprimir();
		
		
		String texto=objImpresoraCannon.printInject("Hola");
		System.out.println(texto);
		
		
		objImpresoraEpson.printDotMatrix();
	}

}
