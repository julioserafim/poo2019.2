package br.com.ufc.test;

import br.com.ufc.dao.AlunoDAOImple;
import br.com.ufc.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		AlunoDAOImple alunoDAO = new AlunoDAOImple();
		Aluno aluno1 = new Aluno("Júlio", "474567", false);
		Aluno aluno2 = new Aluno("Natan", "467890", false);
		Aluno aluno3 = new Aluno("Andrew", "474057", true);
		
		alunoDAO.adicionar(aluno1);
		alunoDAO.adicionar(aluno2);
		alunoDAO.adicionar(aluno3);
		
		alunoDAO.mostrar();
		
		System.out.println("Tamanho:" + alunoDAO.quantidadeDeAlunos());
		System.out.println("Tá no banco?" + alunoDAO.estaNoBanco(aluno2));
		
		alunoDAO.remover(aluno3);
		
		System.out.println("----------------");
		
		alunoDAO.mostrar();
		
		System.out.println("Tá no banco?" + alunoDAO.estaNoBanco(aluno3));

	}

}
