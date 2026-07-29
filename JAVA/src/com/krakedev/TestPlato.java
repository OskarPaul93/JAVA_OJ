package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		platoA= new Plato ();
		
		Plato platoB;
		platoB= new Plato ();

		Plato platoC;
		platoC= new Plato ();
		
		platoA.setNombre("Ceviche");
		platoA.setTipo("Entrada");
		platoA.setPrecio (3.5f);
		platoA.setDisponible (true);
		
		platoB.setNombre("Arroz Marinero");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(8.7f);
		platoB.setDisponible(false);
		
		platoC.setNombre("Helado");
		platoC.setTipo("Postre");
		platoC.setPrecio(5);
		platoC.setDisponible (true);
		
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
