package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

		@Test
		public void crearUnCirculoConRadio2() {
			Circulo micirculo = new Circulo(2.0);
			Double esperado = 2.0;
			Double actual = micirculo.getRadio();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void crearUnCirculoConRadio3Punto7() {
			Circulo micirculo = new Circulo(3.7);
			Double esperado = 3.7;
			Double actual = micirculo.getRadio();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void crearUnCirculoConRadio5() {
			Circulo micirculo = new Circulo(5.0);
			Double esperado = 5.0;
			Double actual = micirculo.getRadio();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void crearUnCirculoConRadio10Punto9() {
			Circulo micirculo = new Circulo(10.9);
			Double esperado = 10.9;
			Double actual = micirculo.getRadio();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
			Circulo micirculo = new Circulo(9.8);
			Double esperado = 301.71;
			Double actual = micirculo.calcularArea();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void queElPerimetroDeUnCirculoConRadio9Punto8Es615Punto73() {
			Circulo micirculo = new Circulo(9.8);
			Double esperado = 61.57; 
			Double actual = micirculo.calcularPerimetro();	
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
			Circulo micirculo = new Circulo(16.6);
			Double esperado = 865.69; 
			Double actual = micirculo.calcularArea();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
		
		@Test
		public void queElPerimetroDeUnCirculoConRadio16Punto6Es865Punto67() {
			Circulo micirculo = new Circulo(16.6);
			Double esperado = 104.30;
			Double actual = micirculo.calcularPerimetro();
			assertEquals(esperado.doubleValue(), actual.doubleValue(), 0.01);
			}
	
		@Test
		public void queElTipDeAyudaDeVerde(){ // :)
			Double esperado = 1.10;
			Double actual = 1.10;
			assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
			}
	
	}

/**
 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
 *  se importaron todos los assert con la siguiente linea 
 *  import static org.junit.Assert.*; 
 */
 
