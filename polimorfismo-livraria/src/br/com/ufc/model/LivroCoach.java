package br.com.ufc.model;

public class LivroCoach extends Livro{
	
	public void calcularDesconto(double preco) {
		this.setPreco(preco - (preco * 0.8));
	}

}
