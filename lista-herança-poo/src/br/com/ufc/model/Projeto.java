package br.com.ufc.model;

public class Projeto {
	private String nomeProjeto;
	private String dataInicio;
	private double orcamento;
	private Gerente gerente;
	private Programador programador;
	private Pesquisador pesquisador;
	
	
	
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public double getOrcamento() {
		return orcamento;
	}
	public void setOrcamento(double orcamento) {
		this.orcamento = orcamento;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	public Programador getProgramador() {
		return programador;
	}
	public void setProgramador(Programador programador) {
		this.programador = programador;
	}
	public Pesquisador getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	
	
	@Override
	public String toString() {
		return "Projeto [nomeProjeto=" + nomeProjeto + ", dataInicio=" + dataInicio + ", orcamento=" + orcamento
				+ ", gerente=" + gerente + ", programador=" + programador + ", pesquisador=" + pesquisador + "]";
	}
	
	
	
	
	
	
}
