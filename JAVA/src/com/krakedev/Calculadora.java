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
	
	public double restar (double n1, double n2) {
		double resultado;
		resultado= n1 -n2;
		return resultado;
		
	}
		
	public double descuento (double precio, double porcentaje) {
		double resultado;
		resultado= precio - (precio*porcentaje/100);
		return resultado;
	}
		
	}

