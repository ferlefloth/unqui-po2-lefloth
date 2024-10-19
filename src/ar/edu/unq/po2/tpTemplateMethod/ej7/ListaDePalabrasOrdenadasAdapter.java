package ar.edu.unq.po2.tpTemplateMethod.ej7;

import javax.swing.DefaultListModel;

public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel implements DefaultModelListInterface{
	private ListaDePalabrasOrdenadas lista;
	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas lista) {
		this.lista = lista;
	}

	@Override
	public void add(String palabra) {
		lista.agregarPalabra(palabra);
	}

	@Override
	public void addElement(String palabra) {
		// TODO Auto-generated method stub
		lista.agregarPalabra(palabra);
	}
}
