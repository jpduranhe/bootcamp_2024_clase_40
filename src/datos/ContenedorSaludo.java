package datos;

public class ContenedorSaludo implements GuardarSaludo {
	
	private String saludo;

	@Override
	public void guardar(String saludo) {
		this.saludo=saludo;
		System.out.println("Guardando en un atributo");
	}

}
