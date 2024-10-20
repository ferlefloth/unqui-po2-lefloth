package ar.edu.unq.po2.tpTemplateMethod.ej7;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel { // ESTE ES EL TIPO DE ADAPTER QUE ES POR HERENCIA UNICA
	private ListaDePalabrasOrdenadas lista;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas lista) {
		this.lista = lista;
	}

	public void addElement(String palabra) { 
		// TODO Auto-generated method stub
		lista.agregarPalabra(palabra);
	}
}
