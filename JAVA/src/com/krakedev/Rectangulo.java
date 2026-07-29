package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		int area= base*altura;
		
		return area;
		
	}
	
	private double largo;
	private double ancho;
	
	
	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double calcularPerimetro() {
		double perimetro= (2*largo)+(2*ancho);
		return perimetro;
	}

}
