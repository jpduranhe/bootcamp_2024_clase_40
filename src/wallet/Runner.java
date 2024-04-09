package wallet;

public class Runner {
	public static void main(String[] args) {
		
		Dolar monedaDolar= new Dolar();
		Euro monedaEuro= new Euro();
		
		
		double pesoChileno=10000;
		double dolares=monedaDolar.getFactorConversion()*pesoChileno;
		double euros=monedaEuro.getFactorConversion()*pesoChileno; 
		System.out.print(monedaDolar.getSimbolo()+" "+dolares );
		System.out.print(monedaEuro.getSimbolo()+" "+euros );
		
	}
}
