package br.com.ufc.test;

import br.com.ufc.model.CarrinhoDeCompras;
import br.com.ufc.model.LivroCoach;
import br.com.ufc.model.LivroRomance;

public class Teste {

	public static void main(String[] args) {
		CarrinhoDeCompras cdc = new CarrinhoDeCompras();
		
		LivroRomance livroRomance = new LivroRomance();
		livroRomance.setNome("Lua Nova");
		livroRomance.setIsbn("2424");
		
		cdc.adicionarLivro(livroRomance,50.0);
		
		LivroCoach livroCoach = new LivroCoach();
		livroCoach.setNome("O poder do hábito");
		livroCoach.setIsbn("7070");
		
		cdc.adicionarLivro(livroCoach, 20.0);
	}

}
