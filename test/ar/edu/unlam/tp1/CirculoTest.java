package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circuloRadio2 = new Circulo();
		Double radio = new Double(2.0);
		circuloRadio2.setRadio(radio);
		assertEquals(12.56, circuloRadio2.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circuloRadio3punto7 = new Circulo();
		Double radio = new Double(3.7);
		circuloRadio3punto7.setRadio(radio);
		assertEquals(23.24, circuloRadio3punto7.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circuloRadio5 = new Circulo();
		Double radio = new Double(5.0);
		circuloRadio5.setRadio(radio);
		assertEquals(31.41, circuloRadio5.calcularPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circuloRadio10Punto9 = new Circulo();
		Double radio = new Double(10.9);
		circuloRadio10Punto9.setRadio(radio);
		assertEquals(68.48, circuloRadio10Punto9.calcularPerimetro(), 0.01);
	}
	
   @Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo areaDeUnCirculoRadio9Punto8Es615Punto73 = new Circulo();
		Double radio = new Double(9.8);
		areaDeUnCirculoRadio9Punto8Es615Punto73.setRadio(radio);
		assertNotEquals(615.73, areaDeUnCirculoRadio9Punto8Es615Punto73.calcularArea(), 0.01);
	}
   
   @Test
    public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71(){
	   Circulo areaDeUnCirculoRadio9Punto8Es301Punto71 = new Circulo();
	   Double radio = new Double(9.8);
	   areaDeUnCirculoRadio9Punto8Es301Punto71.setRadio(radio);
	   assertEquals(301.71, areaDeUnCirculoRadio9Punto8Es301Punto71.calcularArea(), 0.01);
   }
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo circuloRadio16Punto6 = new Circulo();
		Double radio = new Double(16.6);
		circuloRadio16Punto6.setRadio(radio);
		assertNotEquals(865.67, circuloRadio16Punto6.calcularPerimetro(), 0.01);
	}
	
	@Test
	 public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69(){
		Circulo areaDeUnCirculoRadio16Punto6 = new Circulo();
		Double radio = new Double(16.6);
		areaDeUnCirculoRadio16Punto6.setRadio(radio);
		assertEquals(865.69, areaDeUnCirculoRadio16Punto6.calcularArea(), 0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
