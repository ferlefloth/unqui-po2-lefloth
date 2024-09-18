package ar.edu.unq.po2.tp5;

public class CajaVenta extends Caja implements Agencia{
	
	
	private int monto;
	public CajaVenta(int montoAPagar) {
		super(montoAPagar);
	}

	
	public void pagarServicio(Servicio servicio) {
		this.monto = (servicio.costoUnidadConsumida() * servicio.cantidadesPorCiclo());
		
	}
	
	public void pagarImpuesto() {
		
		
	}
	
	
	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		
	}

}
