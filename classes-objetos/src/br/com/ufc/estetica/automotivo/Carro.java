package br.com.ufc.estetica.automotivo;

public class Carro {
	String placa;
	String modelo;
	String cor;
	int ano;
	String dono;
	double preco;
	int quantidadeGasolina;
	String nomeDono;
	String donoCPF;
	String numeroRegistroCnh;
	
	
	public void ligar() {
		System.out.println("Carro ligado");
	}
	
	public void desligar() {
		System.out.println("Carro desligado");
	}
	
	public void abastecer(int quantidadeGasolina) {
		System.out.println(quantidadeGasolina);
		System.out.println(this.quantidadeGasolina);
	}
	
	public void viajar() {
		quantidadeGasolina -=10;
	}
	
	public int retornarGasolinaRestante() {
		return this.quantidadeGasolina;
	}
	
}
