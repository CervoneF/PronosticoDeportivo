
package modelo;

import modelo.ResultadoEnum.Resultados;

public class Partido {
	
	Equipo equipo1= new Equipo();
	Equipo equipo2=new Equipo();
	
	int golesEquipo1;
	int golesEquipo2;
	
		
	public Partido() {
	}

	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}


	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}


	public int getGolesEquipo1() {
		return golesEquipo1;
	}


	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}


	public int getGolesEquipo2() {
		return golesEquipo2;
	}


	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	public String toString() {
	    return "Equipo uno: " + getEquipo1().getNombre() + " que metió " + getGolesEquipo1() + " goles." +
	    		" - Equipo dos: " + getEquipo2().getNombre() + " que metió " + getGolesEquipo2() + " goles.";
	}

	
	public Resultados resultado (Equipo equipo) {

		if (equipo.getNombre().equals(this.equipo1.getNombre())) {

			if (this.golesEquipo1 > this.golesEquipo2) {
				return Resultados.GANADOR;
			}
			if (this.golesEquipo1 < this.golesEquipo2) {
				return Resultados.PERDEDOR;
			}
		}
		if (equipo.getNombre().equals(this.equipo2.getNombre())) {
			if (this.golesEquipo2 > this.golesEquipo1) {
				return Resultados.GANADOR;
				}
			if (this.golesEquipo2 < this.golesEquipo1) {
				return Resultados.PERDEDOR;
			}
			
		} 
		return Resultados.EMPATE;
		
		}
		
	
	
	
}


