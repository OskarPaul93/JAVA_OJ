package com.krakedev;

public class Calculadora {
	
	public double multiplicar(double a, double b) {
		double resultado;
		resultado= a * b;
		return resultado;
	}
	
	public double dividir (double a, double b) {
		double resultado;
		resultado= a / b;
		return resultado;
	}
	
	public double promedio (double a, double b, double c) {
		double resultado;
		resultado= (a + b + c)/3;
		return resultado;
	}
	
	public void saludar() {
		System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
		
	}

}
