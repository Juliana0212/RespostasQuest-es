package exercicios;

import java.util.Scanner;

public class Quatro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma frase:");
		String frase = sc.nextLine();

		int vog = 0;

		frase = frase.toLowerCase();
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c == 32)
				continue;
			if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117) {
				vog++;
				continue;
			}
			if (c >= 98 && c <= 122)
				;
		}

		System.out.println("Número de vogais: " + vog);

		sc.close();
	}

}
