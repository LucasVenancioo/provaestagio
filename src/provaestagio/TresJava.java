package provaestagio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TresJava {
	static String[] numerosTexto = {"Primeira", "Segunda", "Terceira", "Quarta"}; 
	public static List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public static void NotasAlunos() {
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		System.out.println("|----- Listagem de Notas dos Alunos -----|");
		
		do {
			System.out.println("|- MENU NOTAS ---|");
			System.out.println("|SAIR         ---|");
			System.out.println("|INSERIR      ---|");
			opcao = sc.nextLine();
			
			switch (opcao.toUpperCase()){
			case "INSERIR":
				inserirAlunoENotas(sc);
				break;
			
			default:
				break;
			}
		}while(!opcao.toUpperCase().equals("SAIR"));
		
		listarAlunosENotas();
	}
	
	private static void inserirAlunoENotas(Scanner sc) {
		int countNotas = 0;
		Aluno aluno = new Aluno(getNovoIdAluno());
		System.out.println("Forneça o nome do aluno");
		aluno.setNome(sc.nextLine());

		System.out.println("Agora, você precisa fornecer quatro notas para o aluno " + aluno.getNome());
		
		while(countNotas < 4) {
			System.out.println("Informe a " + numerosTexto[countNotas] + " nota:");
			String notaString = sc.nextLine();
			int nota = notaString.isEmpty() ? 0: Integer.parseInt(notaString);
			aluno.getListNotas().add(nota);
			countNotas++;
		}
		
		listaAlunos.add(aluno);
	}
	
	private static void listarAlunosENotas() {
		String exibirLista = "", separacaoHorizontal = "|--------------------------------|\n";
		exibirLista += separacaoHorizontal;
		for (Aluno aluno : listaAlunos) {
			int media = aluno.getMediaNotas();
			exibirLista += String.format("|%s. %s - %s (%s) --|\n", aluno.getId(), aluno.getNome(), media, aluno.getStatus(media) );
			exibirLista += separacaoHorizontal;
		}
		
		System.out.println(exibirLista);
	}
	
	private static int getNovoIdAluno() {
		return listaAlunos.size() + 1;
	}
}
