package br.com.ufc.model;

public class LivroRomance extends Livro{
	
	
	public void calcularDesconto(double preco) {
		this.setPreco(preco - (preco * 0.05));
	}
}
