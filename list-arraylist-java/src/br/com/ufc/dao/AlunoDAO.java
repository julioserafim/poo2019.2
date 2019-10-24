package br.com.ufc.dao;
import br.com.ufc.model.Aluno;

public interface AlunoDAO {
	public void adicionar(Aluno aluno);
	public void remover(Aluno aluno);
	public void mostrar();
	public boolean estaNoBanco(Aluno aluno);
	public int quantidadeDeAlunos();
}
