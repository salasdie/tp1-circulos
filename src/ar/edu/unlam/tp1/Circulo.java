package ar.edu.unlam.tp1;

public class Circulo{
	private Double radio;
		
	public Double getRadio(){
		return radio;
	}
	
	public void setRadio(Double radio){
		this.radio= radio;
	}
	
	public Double calcularPerimetro(){
		
        Double perimetro=0.00;
		
		perimetro = 2*Math.PI*getRadio();
		
		return perimetro;	
}
	public Double calcularArea(){
		
		Double area=0.00;
		area=Math.PI*(getRadio()*getRadio());
		return area;
}
}
