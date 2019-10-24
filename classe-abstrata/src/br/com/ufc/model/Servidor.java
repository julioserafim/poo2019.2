package br.com.ufc.model;

public abstract class Servidor{
	private String nome;
	private String cpf;
	private double salario;
	
	public Servidor(){
		
	}
	
	public Servidor(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public abstract double getBonificacao();
	
	
	
	
	

}
