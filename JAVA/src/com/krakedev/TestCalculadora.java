package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1;
		c1= new Calculadora();
		
		
		// Producto
		double r1;
		r1= c1.multiplicar(10, 5);
		
		System.out.println("El producto de la multiplicacion es: " + r1);
		
		// Division
		double r2;
		r2= c1.dividir(10, 2);
		
		System.out.println("El cociente de la division es: " + r2);
		
		// Promedio
		double r3;
		r3=c1.promedio(10,8,9);
		System.out.println("El total del promedio es: " + r3);

	}

}
