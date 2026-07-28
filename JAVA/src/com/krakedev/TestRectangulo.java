package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1= new Rectangulo ();{
			
			r1.altura = 10;
			r1.base= 5;
			
			int resultadoArea;
		
			resultadoArea= r1.calcularArea();
			
			System.out.println("El area del rectangulo 1 es: " + resultadoArea);	
			
		}
		
		Rectangulo r2= new Rectangulo ();{
			
			r2.altura = 3;
			r2.base= 8;
			
			int resultadoArea2;
		
			resultadoArea2= r2.calcularArea();
			
			System.out.println("El area del rectangulo 2 es: " + resultadoArea2);	
			
		}
		
		//Perimetro
		Rectangulo r3= new Rectangulo ();{
			
			r3.largo = 4;
			r3.ancho= 2;
			
			double resultadoPerimetro;
		
			resultadoPerimetro= r3.calcularPerimetro();
			
			System.out.println("El perimetro del rectangulo es: " + resultadoPerimetro);	
			
		}

	}

}
