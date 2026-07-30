package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {

		Restaurante rest1 = new Restaurante("KFC", "Av America", 6);
		Restaurante rest2 = new Restaurante("Menestras del Negro", "Av Colon", 7);

		// Restaurante 1
		
		System.out.println("==== Restaurante 1 ====");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		// Restaurante 2
		

		System.out.println("==== Restaurante 2 ====");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}