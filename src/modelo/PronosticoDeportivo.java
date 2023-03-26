package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PronosticoDeportivo {
	
	
	public static void main(String[] args) {
		
		Partido partido1;
		Partido partido2;
		Equipo equipo1;
		Equipo equipo2;
		ArrayList <Partido> partidos = new ArrayList<>();
	
		
						
			try {
				for (String linea: Files.readAllLines(Paths.get("../TPI/src/Archivos/resultados.csv"))) {
									
					

					
					String nombre1 = linea.split(",")[0];
					equipo1 = new Equipo(nombre1, "Celeste y Blanca");
					int golesEquipo1= Integer.parseInt(linea.split(",")[1]);
					int golesEquipo2= Integer.parseInt(linea.split(",")[2]);
					String nombre2 = linea.split(",")[3];
					equipo2 = new Equipo (nombre2, "Asiatico");
					partido1 = new Partido(equipo1, equipo2, golesEquipo1, golesEquipo2);
					partidos = new ArrayList <Partido>();
					partidos.add(partido1);
										
					
				}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print(partidos);
		

			}

}
