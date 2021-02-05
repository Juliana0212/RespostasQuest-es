package exercicios;

public class Oito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] vetor = new String[] { "John Doe", "Jane Doe", "Alice Jones", "Bobby Louis", "Lisa Romero" };
		String palavra;
		palavra = "Doe";

		for (int i =0; i< vetor.length; i++) {
			if (vetor[i].contains(palavra)) {
				System.out.println(vetor[i].toString());
			}
		}
	}
}
