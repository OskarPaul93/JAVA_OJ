package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		Plato platoA;
		platoA= new Plato ();
		
		Plato platoB;
		platoB= new Plato ();

		Plato platoC;
		platoC= new Plato ();
		
		platoA.nombre="Ceviche";
		platoA.tipo="Entrada";
		platoA.precio= 3.5f;
		platoA.disponible= true;
		
		platoB.nombre="Arroz Marinero";
		platoB.tipo="Plato fuerte";
		platoB.precio= 8.7f;
		platoB.disponible= false;
		
		platoC.nombre="Helado";
		platoC.tipo="Postre";
		platoC.precio= 5;
		platoC.disponible= true;
		
		System.out.println("====Plato A====");		
		System.out.println("Nombre: "+ platoA.nombre);
		System.out.println("Tipo: "+ platoA.tipo);
		System.out.println("Precio: "+ platoA.precio);
		System.out.println("Disponible: "+ platoA.disponible);
		
		System.out.println("====Plato B====");		
		System.out.println("Nombre: "+ platoB.nombre);
		System.out.println("Tipo: "+ platoB.tipo);
		System.out.println("Precio: "+ platoB.precio);
		System.out.println("Disponible: "+ platoB.disponible);
		
		System.out.println("====Plato C====");		
		System.out.println("Nombre: "+ platoC.nombre);
		System.out.println("Tipo: "+ platoC.tipo);
		System.out.println("Precio: "+ platoC.precio);
		System.out.println("Disponible: "+ platoC.disponible);

	}

}
