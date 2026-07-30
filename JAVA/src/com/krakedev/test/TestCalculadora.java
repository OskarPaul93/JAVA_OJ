package com.krakedev.test;

import com.krakedev.Calculadora;

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
		
		//Saludar
		c1.saludar();
		
		// Restar
		double r4;
		r4=c1.restar(25, 5);
		System.out.println("El total de la resta es: " + r4);
		
		//Descuento
		double r5; 
		r5=c1.descuento(150, 15);
		System.out.println("El total del descuento es: " + r5);
		

	}

}
