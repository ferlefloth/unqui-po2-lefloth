package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	private int montoAPagar;

	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Caja(int montoAPagar){
		this.montoAPagar = montoAPagar;
		
	}
	public int montoAPagar() {
		return productos.stream()
				.mapToInt(null) // Aplicar funcion para los montos
				.sum();
	}
	
	
	public void registrarProducto(Producto producto) {
		this.productos.add(producto);
		producto.decrementar(); // Asi? no se rompe el encapsulamiento?
	}
}
