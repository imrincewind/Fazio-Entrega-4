package pack;

import java.util.Comparator;

public class ComparadorProducto implements Comparator<Producto>{

	@Override
	public int compare(Producto o, Producto p) { //ordenamos productos por mejor indice
		if(o.getIndice() > p.getIndice()){
			return -1;
		}else if(o.getIndice() < (p.getIndice())){
			return 1;
		}else{
			return comparePeso(o,p);// si poseen igual indice los vamos a comparar por peso
		}
		
	}
	private int comparePeso(Producto o, Producto p){//comparamos por peso
		if (o.getPeso() < p.getPeso()){
			return -1;
		} else if ( o.getPeso() > p.getPeso()) {
			return 1;
		}else{
			return compareNombre(o,p);// si ambos poseen también un peso igual entonces comparamos por nombre
		}
	}
	private int compareNombre(Producto o, Producto p){// si los
		return o.getNombre().compareTo(p.getNombre());
	}
}
