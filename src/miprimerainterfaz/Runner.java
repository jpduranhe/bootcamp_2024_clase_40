package miprimerainterfaz;

public class Runner {

	public static void main(String[] args) {
		
		ImpresoraEpson  objImpresoraEpson  = new ImpresoraEpson();
		ImpresoraCannon objImpresoraCannon = new ImpresoraCannon();
		Animal objeAnimal= new Animal();
		
		procesarImpresion(objImpresoraEpson);
		procesarImpresion(objImpresoraCannon);
		procesarImpresion(objeAnimal);
	}
	
	
	
	public static void procesarImpresion(Imprimir impresion ) {
		impresion.imprimir();
	}

}
