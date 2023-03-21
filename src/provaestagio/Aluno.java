package provaestagio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private List<Integer> notas = new ArrayList<Integer>();
	
	public Aluno() {}
	
	public Aluno(int id) {
		this.id = id;
	}
	
	public Aluno(int id, String nome, List<Integer> notas) {
		this.id = id;
		this.nome = nome;
		this.notas = notas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Integer> getListNotas() {
		return notas;
	}

	public void setListNotas(List<Integer> notas) {
		this.notas = notas;
	}

	public int getNota(int index) {
		return notas.get(index);
	}

	public void setNotas(Integer notas) {
		this.notas.add(notas);
	}
	
	public int getMediaNotas() {
		int media = 0;
		for (int i = 0; i < notas.size(); i++) {
			media += notas.get(i) / notas.size();
		}
		return media;
	}
	
	public String getStatus(int media) {
		return media < 6 ? "Reprovado" : "Aprovado";
	}
}
