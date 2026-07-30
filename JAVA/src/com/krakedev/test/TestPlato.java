package com.krakedev.test;

import com.krakedev.Plato;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		platoA= new Plato ("Ceviche", "Entrada", 3.5f , true);
		
		Plato platoB;
		platoB= new Plato ("Arroz Marinero", "Plato fuerte", 8.7f , false);

		Plato platoC;
		platoC= new Plato ("Helado", "Postre", 5 , true);
		
		
		System.out.println("====Plato A====");		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		System.out.println("====Plato B====");		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		System.out.println("====Plato C====");		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());

	}

}
