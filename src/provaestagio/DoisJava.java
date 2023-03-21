package provaestagio;

import java.util.ArrayList;
import java.util.Scanner;

public class DoisJava {
	static String[] numerosTexto = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"}; 
	
	public static void NumeroMenorEMaior() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listNumeros = new ArrayList<>();
		int maior=0, menor=99999;
		String exibicao = "";
		System.out.println("|------ Informe Cinco números ------|");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + numerosTexto[i] + " número:");
			int numTemp = sc.nextInt();
			listNumeros.add(numTemp);
			
			if(numTemp < menor)
				menor = numTemp;
			
			if(numTemp > maior)
				maior = numTemp;
		}
		

		System.out.println("Numero Menor: " + menor);
		System.out.println("Numero Maior: " + maior);
	}

}
