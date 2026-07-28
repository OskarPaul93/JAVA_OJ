package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1= new Cuadrado ();{
			
			c1.lado = 3;
			
			
			double resultadoArea;
		
			resultadoArea= c1.calcularArea();
			
			System.out.println("======Cuadrado 1======");
			System.out.println("El area del cuadrado 1  es: " + resultadoArea);	
			
		
		
		//Perimetro
		
			
			
			double resultadoPerimetro;
		
			resultadoPerimetro= c1.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 1 es: " + resultadoPerimetro);	
			
		}
		
		Cuadrado c3= new Cuadrado ();{
			
			c3.lado = 5;
			
			
			double resultadoArea;
		
			resultadoArea= c3.calcularArea();
			
			System.out.println("======Cuadrado 2======");
			System.out.println("El area del cuadrado 2  es: " + resultadoArea);	
			

		
		//Perimetro
			
			
			double resultadoPerimetro;
		
			resultadoPerimetro= c3.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 2  es: " + resultadoPerimetro);	
			
		}
		
		Cuadrado c4= new Cuadrado ();{
			
			c4.lado = 10;
			
			
			double resultadoArea;
		
			resultadoArea= c4.calcularArea();
			
			System.out.println("======Cuadrado 3======");
			System.out.println("El area del cuadrado 3 es: " + resultadoArea);	
			
		
		
		//Perimetro
	
			
			double resultadoPerimetro;
		
			resultadoPerimetro = c4.calcularPerimetro();
			
			System.out.println("El perimetro del cuadrado 3 es: " + resultadoPerimetro);	
			
		}

	}

}
