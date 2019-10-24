package br.com.ufc.model;

public class Aluno {
	
	private String nome;
	private String matricula;
	private boolean jaReprovou;
	
	
	public Aluno(String nome, String matricula, boolean jaReprovou) {
		this.nome = nome;
		this.matricula = matricula;
		this.jaReprovou = jaReprovou;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isJaReprovou() {
		return jaReprovou;
	}
	public void setJaReprovou(boolean jaReprovou) {
		this.jaReprovou = jaReprovou;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", jaReprovou=" + jaReprovou + "]";
	}
	
	
	

}
