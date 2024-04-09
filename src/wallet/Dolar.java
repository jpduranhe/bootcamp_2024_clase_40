package wallet;

public class Dolar implements Moneda{

	@Override
	public String getSimbolo() {
		return "$USD";
	}

	@Override
	public double getFactorConversion() {
		return 0.0011;
	}

}
