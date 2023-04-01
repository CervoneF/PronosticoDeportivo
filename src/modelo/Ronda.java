package modelo;

import java.util.ArrayList;

public class Ronda {
	
	String numero;
	ArrayList <Partido> partidos = new  ArrayList<>();
	
		public Ronda() {
	}
		
	public Ronda(String numero, ArrayList<Partido> partido) {
		this.numero = numero;
		this.partidos = partido;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public ArrayList<Partido> getPartido() {
		return partidos;
	}
	
	public void setPartido(ArrayList<Partido> partido) {
		this.partidos = partido;
	}
	
	

}
