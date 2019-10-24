package br.com.ufc.all;

public class Aluno {
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	
	
	
	
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





	public String getDataNascimento() {
		return dataNascimento;
	}





	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}





	public void andar() {
		System.out.println("Andando como um aluno");
	}



	@Override
	public String toString() {
		return "Nome: " + nome + " ,Cpf= " + cpf + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
	

}
