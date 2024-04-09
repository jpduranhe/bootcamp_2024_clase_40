package wallet;

public interface Moneda {

	String getSimbolo();
	double getFactorConversion();
	double convertir(double cantidadCLP); 
}
