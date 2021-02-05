package exercicios;

import java.text.NumberFormat;
import java.util.Locale;

public class Cinco {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt","BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		String numInicial = "6800.00";
		String desconto = "30"	;	
		String resultado = "0";
		
		
		double ni = Double.valueOf(numInicial);
	    System.out.println("Valor Inicial: " + dinheiro.format(ni));

		
	    double desc = Double.valueOf(desconto);
	    System.out.println("Procentagem: " + desconto + "%"); 

	    
	    double result = Double.valueOf(resultado);
	    result = ni * (1 - (desc/100));
	    
	    
	    System.out.println("Valor formatado: R$ " + dinheiro.format(result));

	}


}
