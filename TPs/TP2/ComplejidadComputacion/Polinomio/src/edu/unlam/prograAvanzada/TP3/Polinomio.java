package edu.unlam.prograAvanzada.TP3;

public class Polinomio {

	private int grado;
	private double[] coeficiente;
	public Polinomio(int grado, double[] coeficiente) {
		this.grado = grado;
		this.coeficiente = coeficiente;
	}
	public double evaluarMsucesivas(double x) {
		double resultado = 0;
		
		for(int i = this.grado; i > 0; i--) {
			resultado += potenciaMSucesivas(this.coeficiente[this.grado - i], i);
		}
		
		return resultado ;
	}
	
	public double potenciaMSucesivas(double x, int n) {
		double resultado = 1;
		for(int i = 0; i < n; i++) {
			resultado = resultado * x;
		}
		if(n%2 == 0 && resultado < 0){
			return resultado * -1;
		}
		return resultado;
	}
}
