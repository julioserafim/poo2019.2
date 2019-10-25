package br.com.ufc.model;

public class CalculadoraCientifica implements Calculadora {

	@Override
	public int somar(int x, int y) {
		return x+y;
	}

	@Override
	public int multiplicar(int x, int y) {
		return x*y;
	}

	@Override
	public int subtracao(int x, int y) {
		return x-y;
	}

	@Override
	public double divisao(double x, double y) {
		return x/y;
	}
	
	public int potenciaQuadratica(int x) {
		return x*x;
	}

}
