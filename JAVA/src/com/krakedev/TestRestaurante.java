package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		Restaurante rest1; 
		rest1= new Restaurante ();
		
		Restaurante rest2;
		rest2= new Restaurante ();
		
		rest1.nombre="KFC";
		rest1.direccion="Av.America";
		rest1.calificacion= 4;
		
		System.out.println("====Restaurante 1====");
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion " + rest1.direccion);
		System.out.println("Calificacion " + rest1.calificacion);
		
		rest2.nombre="Menestras del Negro";
		rest2.direccion="Av.Colon";
		rest2.calificacion= 7 ;
		
		System.out.println("====Restaurante 2====");
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion " + rest2.direccion);
		System.out.println("Calificacion " + rest2.calificacion);
		
		
		

	}

}
