package ar.edu.unq.po2.tp5;

public class Servicio {
	private int costoUnidadConsumida;
	private int cantidadesPorCiclo;
	
	public Servicio(int costoUnidadConsumida, int cantidadesPorCiclo) {
		this.costoUnidadConsumida = costoUnidadConsumida;
		this.cantidadesPorCiclo = cantidadesPorCiclo;
	}
	
	public int costoUnidadConsumida() {
		return costoUnidadConsumida;
	}
	
	public int cantidadesPorCiclo() {
		return cantidadesPorCiclo;
	}
}
