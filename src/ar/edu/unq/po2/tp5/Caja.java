package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	int montoAPagar;
	Stock stock = new Stock();
	ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public Caja(int montoAPagar,Stock stock){
		this.montoAPagar = montoAPagar;
		this.stock = stock;
		//me está faltando los productos?
	}
	public int montoAPagar() {
		return productos.stream()
				.mapToInt(null) // Aplicar funcion para los montos
				.sum();
	}
	
	
	public void registrarProducto(Producto producto) {
		this.productos.add(producto);
		stock.decrementaStock(producto);
		// se saca del stock
	}
// se registran los productos que desea adquirir el cliente
	//se obtiene el monto total a pagar luego de que se informa al cliente
	
	
	//---> Si regiswtras un prioducto, hay que consultarle AL PRODUCTUDO para acumularlo en un monto a pagar y decrementa el stoclk



// CLASE: PRODUCTO
	//SUBCLASE: ProdyctoCooperativa
	//SUBCLASE: ProductoEmpresaTradicional

}
