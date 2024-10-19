package ar.edu.unq.po2.tpTemplateMethod.ej7;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

public class Ventana extends JFrame{
	public Ventana(DefaultModelListInterface listaDePalabrasOrdenadasAdapter){
		 this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		 this.setBounds(new Rectangle(180,180));
		 this.setVisible(true);
		 JLabel label=new JLabel("Lista de palabras");
		 label.setBounds(new Rectangle(40,40));
		 this.add(label);
		 listaDePalabrasOrdenadasAdapter.addElement("casa");
		 listaDePalabrasOrdenadasAdapter.addElement("arbol");
		 listaDePalabrasOrdenadasAdapter.addElement("perro");
		 listaDePalabrasOrdenadasAdapter.addElement("telefono");
		 listaDePalabrasOrdenadasAdapter.addElement("brazo");
		 JList lista=new JList((ListModel) listaDePalabrasOrdenadasAdapter); //ACA SE CASTEA: Esta raro esto
		 lista.setBounds(new Rectangle(110,160));
		 this.add(lista);
	}
	public static void main(String[] args) {
		
		ListaDePalabrasOrdenadas listado = new ListaDePalabrasOrdenadas();
		DefaultModelListInterface listaDePalabrasOrdenadasAdapter = new ListaDePalabrasOrdenadasAdapter(listado);
		
		new Ventana(listaDePalabrasOrdenadasAdapter);
		
	/*esta línea puede modificarse luego de resolver el ejercicio.*/
	}
}
