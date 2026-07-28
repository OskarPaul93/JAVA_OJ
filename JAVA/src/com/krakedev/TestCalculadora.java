package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora c1;
		c1= new Calculadora();
		
		double r1;
		r1= c1.multiplicar(10, 5);
		
		System.out.println("El producto de la multiplicacion es: " + r1);

	}

}
