package wallet;

public class Rupia implements Moneda {

	@Override
	public String getSimbolo() {
		return "$";
	}

	@Override
	public double getFactorConversion() {
		return 0.14;
	}

	@Override
	public double convertir(double cantidadCLP) {
		return getFactorConversion()*cantidadCLP;
	}

}
