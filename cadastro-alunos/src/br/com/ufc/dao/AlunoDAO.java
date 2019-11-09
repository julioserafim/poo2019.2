package br.com.ufc.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.ufc.model.Aluno;

public class AlunoDAO {
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	
	public AlunoDAO() {
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void removerAluno(int indice) {
		System.out.println("INDICE:" + indice);
		alunos.remove(indice);
	}
	
	
	public List<Aluno> retornarListaDeAlunos(){
		return alunos;
	}
	
	public void imprimirLista() {
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
	}
	
	
	
}
