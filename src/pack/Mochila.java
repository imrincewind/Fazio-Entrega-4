package pack;

import java.util.ArrayList;
import java.util.Collections;

public class Mochila {
	private double capacidad;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Producto> productosSeleccionados = new ArrayList<Producto>();

	public Mochila(double c) {
		this.capacidad = c;
	}

	public void agregarProducto(Producto p) {
		productos.add(p);
	}

	
	public ArrayList<Producto> seleccionadorDeProductos(ArrayList<Producto> productosASeleccionar) {
		productos = productosASeleccionar;
		Collections.sort(productos, new ComparadorProducto()); //se ordenan segun el ComparadorProducto
		
		for(Producto p : productos){ //se recorre la lista ya ordenada
			if(p.getPeso() <= this.capacidad){ //al estar parados en el producto de mejor indice, solo resta  comprobar que no se pase del peso.
				productosSeleccionados.add(p);//si no se pasa, lo agrega
				capacidad -= p.getPeso();// se baja la capacidad, restandole el peso del producto que se agrego
			}
			
		}
		return productosSeleccionados; 
	}
	


	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	

}
