package ar.edu.unq.po2.tp5;

public abstract class Producto {
	protected double precio;
	private Stock stock = new Stock();//inicializar el stock
	
	public Producto(double precio) {
		this.precio = precio;
	}
	
	public void decrementar() {
		stock.decrementaStock(this);
	}
}
