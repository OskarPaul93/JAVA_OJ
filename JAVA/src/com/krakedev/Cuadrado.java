package com.krakedev;

public class Cuadrado {
	
	//Area
	private double lado;
	
	public Cuadrado (double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	
	
	public double calcularArea() {
		double area= lado*lado;
		return area;	
	}
	
	//Perimetro
	public double calcularPerimetro() {
		double perimetro= 4*lado;
		return perimetro;
	}

}
