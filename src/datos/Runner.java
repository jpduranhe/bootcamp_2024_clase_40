package datos;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hola="Hola Jose";
		
		ContenedorArraySaludo objContenedorArraySaludo= new ContenedorArraySaludo();
		ContendorArrayListString obContendorArrayListString= new ContendorArrayListString();
		ContenedorSaludo objContenedorSaludo= new ContenedorSaludo();
		
		guardarSaludo(objContenedorArraySaludo,hola);
		guardarSaludo(obContendorArrayListString,hola);
		guardarSaludo(objContenedorSaludo,hola);
	}
	
	private static void guardarSaludo(GuardarSaludo guardarSaludo,String saludo) {
		guardarSaludo.guardar(saludo);
	}

}
