package br.com.ufc.model;

public class Professor extends Servidor{
	private int horasMinistradas;
	
	public Professor() {
		
	}
	
	
	public Professor(String nome, 
			String cpf, double salario
			, int horasMinistradas) {
		super(nome, cpf, salario);
		this.horasMinistradas = horasMinistradas;
	}


	public int getHorasMinistradas() {
		return horasMinistradas;
	}


	public void setHorasMinistradas(int horasMinistradas) {
		this.horasMinistradas = horasMinistradas;
	}


	@Override
	public double getBonificacao() {
		setSalario(getSalario() + 2 * this.horasMinistradas);
		return getSalario();
	}
	
	
	
}
