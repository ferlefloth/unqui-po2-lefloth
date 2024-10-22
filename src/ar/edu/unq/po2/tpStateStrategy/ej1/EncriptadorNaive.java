package ar.edu.unq.po2.tpStateStrategy.ej1;

public class EncriptadorNaive {
	private EncriptadorStrategy encriptadorStrategy;
	
	public EncriptadorNaive(EncriptadorStrategy encriptadorStrategy) {
		this.encriptadorStrategy = encriptadorStrategy;
	}
	
	public String encriptar(String texto) {
		return encriptadorStrategy.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return encriptadorStrategy.desencriptar(texto);
	}
	
    public static void main(String[] args) {
		
	}
}

