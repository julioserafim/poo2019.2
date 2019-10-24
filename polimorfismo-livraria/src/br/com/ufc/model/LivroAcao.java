package br.com.ufc.model;

public class LivroAcao extends Livro{
	
	
	
	public void calcularDesconto(double preco) {
		this.setPreco(preco - (0.2 * preco));
		
	}
	
}
