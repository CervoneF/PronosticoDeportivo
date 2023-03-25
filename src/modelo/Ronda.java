package modelo;

public class Ronda {
	
	String numero;
	Partido[] partido;
	
		public Ronda() {
	}
		
	public Ronda(String numero, Partido[] partido) {
		this.numero = numero;
		this.partido = partido;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Partido[] getPartido() {
		return partido;
	}
	
	public void setPartido(Partido[] partido) {
		this.partido = partido;
	}
	
	

}
