package br.com.ufc.estetica.automotivo;

import br.com.ufc.all.*;

public class Automovel {
	private String marca;
	private String modelo;
	private Dono dono;
	private Aluno aluno;
	
	public Dono getDono() {
		return this.dono;
	}
	
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
	
	
}
