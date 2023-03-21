package provaestagio;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException{
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		System.out.println("Prova para Pleiteio de Vaga de Estágio /n");
		
		while (!opcao.equals("00")) {
			System.out.println("|----- Menu -----|");
			System.out.println("|00--- SAIR -----|");
			System.out.println("|01- QUESTAO 1 --|");
			System.out.println("|02- QUESTAO 2 --|");
			System.out.println("|03- QUESTAO 3 --|");
			System.out.println("|04- QUESTAO 4 --|");
			System.out.println("|05- QUESTAO 5 --|");
			
			opcao = sc.nextLine();
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			switch (opcao) {
			case "01":
				UmJava.InserirCincoNumeros();
				break;
			case "02":
				DoisJava.NumeroMenorEMaior();
				break;
			case "03":
				TresJava.NotasAlunos();
				break;
			case "04":
				QuatroJava.VetorPosicaoTres();
				break;
			case "05":
				CincoJava.MatrizNotasAlunos();
				break;

			default:
				break;
			}

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		
	}

}
