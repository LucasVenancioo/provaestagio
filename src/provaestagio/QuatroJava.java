package provaestagio;

import java.util.Scanner;

public class QuatroJava {
	static String[] numerosTexto = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"}; 
	
	public static void VetorPosicaoTres() {
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + numerosTexto[i] + " número:");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numero na posicao 3: " + numeros[2]);
	}

}
