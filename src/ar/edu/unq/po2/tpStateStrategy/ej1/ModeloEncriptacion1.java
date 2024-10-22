package ar.edu.unq.po2.tpStateStrategy.ej1;

public class ModeloEncriptacion1  implements EncriptadorStrategy{

	public ModeloEncriptacion1() {
		
	}

	@Override
	public String encriptar(String texto) {
		// TODO Auto-generated method stub
		return "Encriptando desde modelo1";
	}

	@Override
	public String desencriptar(String texto) {
		// TODO Auto-generated method stub
		return "Desencriptando desde modelo1";
	}
	
}
