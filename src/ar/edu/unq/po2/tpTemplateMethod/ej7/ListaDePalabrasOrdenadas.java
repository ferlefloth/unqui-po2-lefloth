package ar.edu.unq.po2.tpTemplateMethod.ej7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;

public class ListaDePalabrasOrdenadas {

	private List<String>palabras;	
	private final Comparator comparador;

	public ListaDePalabrasOrdenadas(){
		this.palabras=new LinkedList<String>();
		this.comparador = new Comparator(){
			
			@Override
			public int compare(Object palabraA, Object palabraB) {
			String a=((String)palabraA);
			String b=(((String)palabraB));
			return a.compareToIgnoreCase(b);
			}
		};
	}
	
	public void agregarPalabra(String palabra){
		this.palabras.add(palabra);
		Collections.sort(this.palabras, this.comparador);
	}
	public Integer cantidadDePalabras(){
		return this.palabras.size();
	}
	public String getPalabraDePosicion(int posicion){
		return this.palabras.get(posicion);
	}
}

