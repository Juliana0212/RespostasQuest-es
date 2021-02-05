package exercicios;

public class Um {

	public static void main(String args[]) {

		int fat = 1;
		int valor = 5; // ou qualquer outro valor

		for (int i = 2; i <= valor; i++) {
			fat *= i;
		}

		System.out.println("CalcularFatorial(" + valor + ") = " + fat);
	}
}
