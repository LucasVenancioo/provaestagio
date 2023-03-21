package provaestagio;

import java.util.ArrayList;
import java.util.Scanner;

public class UmJava {
	static String[] numerosTexto = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"}; 
	
	public static void InserirCincoNumeros() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listNumerosPares = new ArrayList<>();
		ArrayList<Integer> listNumerosImpares = new ArrayList<>();
		int media=0;
		String exibicao = "";
		System.out.println("|------ Informe Cinco números ------|");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + numerosTexto[i] + " número:");
			int numTemp = sc.nextInt();
			
			if(numTemp % 2 == 0)
				listNumerosPares.add(numTemp);
			else
				listNumerosImpares.add(numTemp);
			
			media += numTemp / 5;
		}
		
		for (int num: listNumerosPares) {
			if(!exibicao.equals(""))
				exibicao += "," + num;
			else
				exibicao += "" + num;			
		}

		System.out.println("Números Pares: " + exibicao);
		exibicao = "";		
		
		for (int num: listNumerosImpares) {
			if(!exibicao.equals(""))
				exibicao += "," + num;
			else
				exibicao += "" + num;			
		}

		System.out.println("Números Ímpares: " + exibicao);	
		System.out.println("Média: " + media);	
	}
}
