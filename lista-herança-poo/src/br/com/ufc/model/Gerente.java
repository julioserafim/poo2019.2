package br.com.ufc.model;

public class Gerente extends Funcionario{
	
	public void receberSalario(double salario) {
		this.setSalario(salario * 1.5);
	}
	
	public void alocarProgramador(Programador programador
			, Projeto projeto) {
		if(projeto.getProgramador() == null) {
			projeto.setProgramador(programador);
		}
		else {
			System.out.println("Já existe um programador");
		}
		
		//mágica
	}
	
	public void alocarPesquisador(Pesquisador pesquisador
			, Projeto projeto) {
		
		if(projeto.getPesquisador() == null) {
			projeto.setPesquisador(pesquisador);
		}
		else {
			System.out.println("Projeto já possui pesquisador");
		}
		
	}
	
	public void demitirProgramador(Projeto projeto) {
		projeto.setProgramador(null);
	}
	
	public void demitirPesquisador(Projeto projeto) {
		projeto.setPesquisador(null);
	}
	

}
