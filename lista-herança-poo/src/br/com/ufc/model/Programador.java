package br.com.ufc.model;

public class Programador extends Funcionario{
	private String linguagemFavorita;
	
	
	public void receberSalario(double salario) {
		this.setSalario(salario * 1.3);
	}


	public String getLinguagemFavorita() {
		return linguagemFavorita;
	}


	public void setLinguagemFavorita(String linguagemFavorita) {
		this.linguagemFavorita = linguagemFavorita;
	}
	
	public void programar() {
		System.out.println("Programador programando");
	}
}
