package com.krakedev;

public class Cuadrado {
	
	//Area
	public double lado;
	
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
