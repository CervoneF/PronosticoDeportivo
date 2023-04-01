package modelo;

import modelo.ResultadoEnum.Resultados;

public class Pronostico {
	
	Partido partido;
	Equipo equipo;
	Resultados resultado;
	
	
	public Pronostico() {
	}
	
	public Pronostico(Partido partido, Equipo equipo, Resultados resultado) {
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}
	
	public Partido getPartido() {
		return partido;
	}
	
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	public Equipo getEquipo() {
		return equipo;
	}
	
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public Resultados getResultado() {
		return resultado;
	}
	
	public void setResultado(Resultados resultado) {
		this.resultado = resultado;
	}
	
	
	public int puntos() {
		int suma = 0;
		if (this.partido.resultado(this.equipo).equals(this.resultado)) {
			suma =  1;
		} 
		return suma;
	}
	
	

}
