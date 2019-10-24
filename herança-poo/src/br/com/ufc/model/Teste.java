package br.com.ufc.model;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
	
		
		System.out.println(pessoa1.receberSalario(1000));
		
		
		Professor julio = new Professor();
		
		
		System.out.println(julio.receberSalario(3000));

		
		Estudante andrew = new Estudante();
		
		
		System.out.println(andrew.receberSalario(400));
		
		Servidor nathan = new Servidor();
		nathan.setSalario(5000);
		
		System.out.println(nathan.receberSalario(5000));
		
		
		
		
		
		
		
		
		
		
	}

}
