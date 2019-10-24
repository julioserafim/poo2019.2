package br.com.ufc.all;

public class Mensagem {
	
	String texto;
	String foto;
	int audio;
	
	Mensagem(){
		System.out.println("Você está usando o construtor default");
	}
	
	Mensagem(String texto){
		this.texto = texto;
	}
	
	Mensagem(String texto, String foto){
		this.texto = texto;
		this.foto = foto;
	}
	
	
	
	
}
