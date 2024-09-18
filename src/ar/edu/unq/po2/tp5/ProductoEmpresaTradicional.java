package ar.edu.unq.po2.tp5;

public class ProductoEmpresaTradicional extends Producto {

	public ProductoEmpresaTradicional(double precio) {
		super(precio);
	}
	
	public double getPrecio() {
		
		return precio + (precio * 0.1);
	}
	
}
