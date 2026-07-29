package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {

		Restaurante rest1 = new Restaurante();
		Restaurante rest2 = new Restaurante();

		// Restaurante 1
		rest1.setNombre("KFC");
		rest1.setDireccion("Av. America");
		rest1.setCalificacion(4);

		System.out.println("==== Restaurante 1 ====");
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		// Restaurante 2
		rest2.setNombre("Menestras del Negro");
		rest2.setDireccion("Av. Colón");
		rest2.setCalificacion(7);

		System.out.println("==== Restaurante 2 ====");
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}