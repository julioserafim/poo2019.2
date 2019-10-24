package br.com.ufc.all;

public class Pessoa {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private double salario;
	
	
	

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return this.dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public void andar() {
		System.out.println("Andando como uma Pessoa");
	}
	
	public void receberSalario() {
		
	}
	

}
