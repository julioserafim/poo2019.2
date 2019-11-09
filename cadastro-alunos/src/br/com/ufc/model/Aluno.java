package br.com.ufc.model;

public class Aluno {
	
	private String nome;
	private String curso;
	private String cpf;
	private int idade;

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", curso=" + curso + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
	
	
	
	

}
