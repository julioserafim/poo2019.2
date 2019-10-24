package br.com.ufc.dao;
import java.util.ArrayList;
import java.util.List;

import br.com.ufc.model.Aluno;

public class AlunoDAOImple implements AlunoDAO{
	private List<Aluno> alunos;
	
	
	public AlunoDAOImple() {
		this.alunos = new ArrayList<Aluno>();
	}


	@Override
	public void adicionar(Aluno aluno) {
		this.alunos.add(aluno);
		
	}


	@Override
	public void remover(Aluno aluno) {
		this.alunos.remove(aluno);
	}


	@Override
	public void mostrar() {
		for (int i = 0; i < this.alunos.size(); i++) {
			System.out.println(this.alunos.get(i));
		}
		
	}


	@Override
	public boolean estaNoBanco(Aluno aluno) {
		if(this.alunos.contains(aluno)) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public int quantidadeDeAlunos() {
		return this.alunos.size();
	}
	
	

	
	

}
