package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1= new Cuadrado ();
			
			c1.setLado (3);
			
			
			double resultadoArea;
		
			resultadoArea= c1.calcularArea();
			
			System.out.println("======Cuadrado 1======");
			System.out.println("El area del cuadrado 1  es: " + resultadoArea);	
			
		
		
		//Perimetro
		
			
			
			double resultadoPerimetro;
		
			resultadoPerimetro= c1.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 1 es: " + resultadoPerimetro);	
			
		
		
		Cuadrado c3= new Cuadrado ();
			
			c3.setLado (5);
			
			
			double resultadoArea2;
		
			resultadoArea2= c3.calcularArea();
			
			System.out.println("======Cuadrado 2======");
			System.out.println("El area del cuadrado 2  es: " + resultadoArea2);	
			

		
		//Perimetro
			
			
			double resultadoPerimetro2;
		
			resultadoPerimetro2= c3.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 2  es: " + resultadoPerimetro2);	
			
		
		
		Cuadrado c4= new Cuadrado ();
			
			c4.setLado (10);
			
			
			double resultadoArea3;
		
			resultadoArea3= c4.calcularArea();
			
			System.out.println("======Cuadrado 3======");
			System.out.println("El area del cuadrado 3 es: " + resultadoArea3);	
			
		
		
		//Perimetro
	
			
			double resultadoPerimetro3;
		
			resultadoPerimetro3 = c4.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 3 es: " + resultadoPerimetro3);	
			
		

	}

}
