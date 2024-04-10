package datos;

public class ContenedorArraySaludo implements GuardarSaludo{
	
	private String[] arregloSaludos= new String[2];
	

	@Override
	public void guardar(String saludo) {
		
		arregloSaludos[0]=saludo;
		System.out.println("Guardando en un Arreglo");
		
	}

}
