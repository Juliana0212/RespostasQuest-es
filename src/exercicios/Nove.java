package exercicios;

import java.util.Arrays;

public class Nove {

	public static void main(String[] args) {
		
		String s = "1,2,3,4,5,6";
		String[] partes = s.split(",");
		int[][] result = new int[partes.length/2][2];
		
		
		for (int i = 0; i < partes.length; i += 2) {
		    result[i / 2] = new int[] { Integer.parseInt(partes[i]), Integer.parseInt(partes[i + 1]) };
		}
		System.out.println(Arrays.deepToString(result)); 
		
}
}

