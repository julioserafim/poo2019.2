package br.com.ufc.model;

public class Pesquisador extends Funcionario{
		private String areaDePesquisa;
	
	public void receberSalario(double salario) {
		this.setSalario(salario * 1.7);
	}

	public String getAreaDePesquisa() {
		return areaDePesquisa;
	}

	public void setAreaDePesquisa(String areaDePesquisa) {
		this.areaDePesquisa = areaDePesquisa;
	}
	
	public void pesquisar() {
		System.out.println("Pesquisador pesquisando");
	}
	
	
}
