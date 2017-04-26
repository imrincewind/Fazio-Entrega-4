package pack;

public class Producto {
	private double peso;
	private double valor;
	private String nombre;
	private double indice;

	public Producto() {

	}

	public Producto(String n, double p, double v) {
		this.nombre = n;
		this.peso = p;
		this.valor = v;
		indice = valor / peso;
	}

	@Override
	public String toString() {
		return "[" + nombre + ", " + getPeso() + ", $" + getValor() + ", indice p/v: " + getPeso() / getValor() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public double getValor() {
		return valor;
	}

	public double getIndice() {
		return indice;
	}
}
