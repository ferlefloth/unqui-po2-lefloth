package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Stock {
	ArrayList<Producto> stock = new ArrayList<Producto>();
	
	public Stock() {
		
	}
	
	
	public void decrementaStock(Producto producto) {
		stock.remove(producto);
	}
	
}
