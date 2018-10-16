package edu.unlam.prograAvanzada.TP3;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolinomioTest {

	@Test
	public void calculoPotenciaMultiSucesivasNumerosEnterosPositivoExpImpar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(32.0 , pol.potenciaMSucesivas(2, 5),1);
	}
	
	@Test
	public void calcularPotenciaMultiSucesivasNumerosEnterosNegativosExpImpar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(-32.0 , pol.potenciaMSucesivas(-2, 5),1);
	}
	
	@Test
	public void calcularPotenciaMultiSucesivasNumerosEnterosNegativosExpPar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(16.0 , pol.potenciaMSucesivas(-2, 4),1);
	}
	
	@Test
	public void calcularPotenciaMultiSucesivasNumerosRealesPositivoExpPar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(40.841000000001, pol.potenciaMSucesivas(2.1 , 5),1);
	}
	
	@Test
	public void calcularPotenciaMultiSucesivasNumerosRealesNegativoExpImpar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(-40.841000000001, pol.potenciaMSucesivas(-2.1 , 5),1);
	}
	
	@Test
	public void calcularPotenciaMultiSucesivasNumerosRealesExpPar() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(19.4481, pol.potenciaMSucesivas(-2.1 , 4),1);
	}
	@Test
	public void calcularPotenciaMultiSucesivasExponente0() {
		Polinomio pol = new Polinomio(1, new double[1]);
		assertEquals(1, pol.potenciaMSucesivas(2 , 0),1);
	}
	
	@Test
	public void calcularPolinomioDeGrado3MSucesivas() {
		double[] coe = {3,3,3,3}
		Polinomio pol = new Polinomio(3,coe);
		
	}

}
