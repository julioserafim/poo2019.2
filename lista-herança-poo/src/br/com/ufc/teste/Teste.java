package br.com.ufc.teste;

import br.com.ufc.model.Gerente;
import br.com.ufc.model.Pesquisador;
import br.com.ufc.model.Programador;
import br.com.ufc.model.Projeto;

public class Teste {

	public static void main(String[] args) {
			Gerente natan = new Gerente();
			natan.setNome("Nathan");
			natan.setCpf("455.678.890-40");
			
			Programador julio = new Programador();
			julio.setNome("Julio");
			julio.setLinguagemFavorita("Java");
			
			Pesquisador david = new Pesquisador();
			david.setNome("David");
			david.setAreaDePesquisa("Arquitetura");
			
			Projeto projeto1 = new Projeto();
			projeto1.setNomeProjeto("Projeto Z");
			
			natan.alocarPesquisador(david, projeto1);
			natan.alocarProgramador(julio, projeto1);
			
			System.out.println(projeto1);
		
	
		

	}

}
