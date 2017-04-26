package pack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//creamos la mochila y le asignamos una capacidad
		Mochila m = new Mochila(75);
		
		// creamos la lista de productos que vamos a darle a la mochila
		//para que haga la seleccion
		ArrayList<Producto> productosASeleccionar = new ArrayList<Producto>();
		
		//creamos los productos
		Producto p1 = new Producto("Lata de Coca", 5, 5);
		Producto p2 = new Producto("Lata de Pepsi", 5, 1);
		Producto p3 = new Producto("Lingote de Bronce", 15, 10);
		Producto p4 = new Producto("Lingote de Plata", 20, 1025);
		Producto p6 = new Producto("Lingote de Oro", 30, 50);
		Producto p7 = new Producto("Lata de Fanta", 5, 5);
		Producto p5 = new Producto("Lata de Manaos", 2, 11);
		
		
		
		//agregamos los productos a la lista, si queremos varios del mismo producto
		//solo debemos agregar dicho producto tantas veces como querramos
		productosASeleccionar.add(p1);
		productosASeleccionar.add(p2);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p4);
		productosASeleccionar.add(p4);
		productosASeleccionar.add(p5);
		productosASeleccionar.add(p6);
		productosASeleccionar.add(p7);
		productosASeleccionar.add(p3);
		productosASeleccionar.add(p5);
	

	       
		
		System.out.println("Capacidad inicial: " + m.getCapacidad());
		//le pedimos a la mochila que seleccione los productos
		System.out.println(m.seleccionadorDeProductos(productosASeleccionar));
		System.out.println("Capacidad final: " + m.getCapacidad());
		
		
	}

}
