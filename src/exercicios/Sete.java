package exercicios;

public class Sete {

	public static void main(String[] args) {

		int[] vetor = new int[] { 1, 2, 3, 4, 5 };
		int[] vetorPar = new int[vetor.length];
		int cont = 0; // posi��o no vetorPar
		for (int i = 0; i < vetor.length; i++) {
		    if ((vetor[i] % 2) == 0) {
		        vetorPar[cont] = vetor[i]; // adiciona no vetorPar
		        cont++; // vai para a pr�xima posi��o
		    }
		}

		
		System.out.println("Os n�meros pares s�o:");
		for (int i = 0; i < cont; i++) {
		    System.out.println(vetorPar[i]);
		}
	}
}

	

