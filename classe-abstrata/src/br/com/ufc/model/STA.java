package br.com.ufc.model;

public class STA extends Servidor{
	private int horasExtras;
	
	public STA(String nome, String cpf, 
			double salario
			, int horasExtras) {
		super(nome, cpf, salario);
		this.horasExtras = horasExtras;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double getBonificacao() {
		setSalario(getSalario() + 2 * this.horasExtras);
		return getSalario();
	}
	
	
	
}
