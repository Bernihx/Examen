package ExamenUF2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testPotencia() {
		Calculadora calcula = new Calculadora(3, 2);
		int resultat = calcula.potencia();
		System.out.println("El resultat es: "+ resultat);
	}

	@Test
	public void testResidu() {
		Calculadora calculaFalse = new Calculadora(10, 3);
		boolean resultatFalse = calculaFalse.residu();
		
		Calculadora calculaTrue = new Calculadora(10, 5);
		boolean resultatTrue = calculaTrue.residu();
		
		if(!resultatFalse) {
			System.out.println("10 dividit de 3, no dona un residu igual a 0");
		}
		if(resultatTrue) {
			System.out.println("10 dividt de 5, dona un residu igual a 0");
		}
	}
}
