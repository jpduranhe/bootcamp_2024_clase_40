package wallet;

public class Euro implements Moneda {

	@Override
	public String getSimbolo() {
		return "€";
	}

	@Override
	public double getFactorConversion() {
		return 0.00098;
	}

	@Override
	public double convertir(double cantidadClP) {
		return getFactorConversion()*cantidadClP;
	}
	

}
