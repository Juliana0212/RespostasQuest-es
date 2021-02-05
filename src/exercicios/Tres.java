package exercicios;

public class Tres {

	public static void main(String[] args) {

		int totalPrimos = contarPrimos(237); //Insira qualquer número dentro dos parenteses 
		System.out.println("Total de números primos: " + totalPrimos);
	
	}

	private static boolean ehPrimo(int num) {
		if (num == 1)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static int contarPrimos(int limite) {
		int count = 0;

		for (int i = 1; i <= limite; i++) {
			if (ehPrimo(i) == true) {
				count += 1;
			}
		}
		return count;
	}

}
