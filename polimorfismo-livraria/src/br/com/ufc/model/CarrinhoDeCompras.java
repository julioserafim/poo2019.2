package br.com.ufc.model;

public class CarrinhoDeCompras {
	
	
	public void adicionarLivro(Livro livro, double preco) {
		livro.calcularDesconto(preco);
		
		System.out.println("Preco com desconto: " + livro.getPreco());
		System.out.println("Nome: " + livro.getNome());
		System.out.println("ISBN: " + livro.getIsbn());
	}
	
}
