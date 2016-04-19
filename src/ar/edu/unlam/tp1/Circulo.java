package ar.edu.unlam.tp1;

public class Circulo{
	private Double radio;
		
	public Circulo(Double radio) {
		
		this.radio= radio;
	}

	public Double getRadio(){
		
		return radio;
	}
	
	public void setRadio(Double radio){
		
		this.radio= radio;
	}
	
	public Double calcularPerimetro(){
		
		Double perimetro = 2*Math.PI*this.radio;
		
		return perimetro;	
	}
	public Double calcularArea(){
		
		Double area=Math.PI*this.radio*this.radio;
		
		return area;
	}
}
