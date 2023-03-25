package modelo;

public class ResultadoEnum {
	
	public String calcularResultado (int opcion) {
		String resultado = " ";
		if (opcion==1) {
			resultado= "Ganador";
		}
		if (opcion==2) {
			resultado="Perdedor";
		}
		if (opcion==3) {
			resultado= "Empate";
		}
		return resultado;
		
	}

}
