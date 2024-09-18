package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	public ProductoCooperativa(double precio) {
		super(precio);
	}

	public double getPrecio() {
		return precio - (precio * 0.1);
	}
}
