package br.com.ufc.all;

public class Estudante {
	private String nome;
	private String cpf;
	private String matricula;
	private String curso;
	private double iraSocial;
	private double iraEducacional;
	
	
	
	
	public void estudar() {
		this.iraEducacional +=5;
		this.iraSocial -= 3;
	}
	
	public void resolverListasDePoo() {
		this.iraEducacional +=6;
		this.iraSocial -=1;
	}
	
	public void sairComAmigosParaDuarte() {
		this.iraEducacional -= 7;
		this.iraSocial += 8;
	}
	
	public void jogarLOL() {
		this.iraEducacional -=10;
		this.iraSocial -=10;
	}
	
	public void pertubarMonitoresDePoo() {
		this.iraEducacional += 20;
		this.iraSocial +=5;
	}
	
	public double getIraEducacional() {
		return this.iraEducacional;
	}
	
	public void setIraEducacional(double iraEducacional) {
		this.iraEducacional = iraEducacional;
	}
	
	public double getIraSocial() {
		return this.iraSocial;
	}
	
	public void setIraSocial(double iraSocial) {
		this.iraSocial = iraSocial;
	}
	
	
	
	
}
