package datos;

import java.util.ArrayList;
import java.util.List;

public class ContendorArrayListString implements GuardarSaludo{
	
	private List listadoDeSaludos= new ArrayList();

	@Override
	public void guardar(String saludo) {
		listadoDeSaludos.add(saludo);
		System.out.println("Guardando en un List");	
	}

}
