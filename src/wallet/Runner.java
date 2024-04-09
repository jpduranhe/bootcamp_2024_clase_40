package wallet;

public class Runner {
	public static void main(String[] args) {
		
		Dolar monedaDolar= new Dolar();
		Euro monedaEuro= new Euro();
		Rupia monedaRupiaNepali= new Rupia();
		
		
		double pesoChileno=10000;
		double dolares=monedaDolar.convertir(pesoChileno);
		double euros=monedaEuro.convertir(pesoChileno); 
		double rupias= monedaRupiaNepali.convertir(pesoChileno);
		System.out.println(monedaDolar.getSimbolo()+" "+dolares );
		System.out.println(monedaEuro.getSimbolo()+" "+euros );
		System.out.println(monedaRupiaNepali.getSimbolo()+" "+rupias );
		
	}
}
