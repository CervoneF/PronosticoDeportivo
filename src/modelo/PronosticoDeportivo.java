package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import modelo.ResultadoEnum.Resultados;

public class PronosticoDeportivo {

  public static void main(String[] args) {
    Pronostico pronostico = null;
    Partido partido;
    Equipo equipo1;
    Equipo equipo2;

    List < String > listaResultados = new ArrayList < > ();
    List < String > listaPronosticos = new ArrayList < > ();
    ArrayList < Partido > partidos = new ArrayList < > ();

    String resultados = "../TPI/src/Archivos/resultados.csv";
    String pronosticos = "../TPI/src/Archivos/pronostico.csv";

    // De archivos traer la información de resultados	
    try {
      listaResultados = Files.readAllLines(Paths.get(resultados));
      listaResultados.remove(0);
      //System.out.println(listaResultados);

      for (String linea: listaResultados) {

        String nombre1 = linea.split(",")[0];
        equipo1 = new Equipo(nombre1, " ");
        int golesEquipo1 = Integer.parseInt(linea.split(",")[1]);
        int golesEquipo2 = Integer.parseInt(linea.split(",")[2]);
        String nombre2 = linea.split(",")[3];
        equipo2 = new Equipo(nombre2, " ");

        //setear partido
        partido = new Partido();
        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partido.setGolesEquipo1(golesEquipo1);
        partido.setGolesEquipo2(golesEquipo2);
        partidos.add(partido);

        //System.out.println(partido);
        //					for (int i=0; i<partidos.size(); i++) {
        //					System.out.println(partido.resultado());
        //					}
      }

    } catch (IOException e1) {
      System.out.println("Error al leer el archivo");
      e1.printStackTrace();
    }

    //De archivos trer la información de pronóstico

    try {
      int sumatoriaPuntos = 0;
      listaPronosticos = Files.readAllLines(Paths.get(pronosticos));
      listaPronosticos.remove(0);

      for (String linea: listaPronosticos) {

        String nombreEquipoElegido = "";
        String nombreEquipoUno = linea.split(",")[0];
        String nombreEquipoDos = linea.split(",")[4];
        Resultados resultado = null;

        String ganaEquipo1 = linea.split(",")[1];
        String ganaEquipo2 = linea.split(",")[3];
        String empata = linea.split(",")[2];

        if (!ganaEquipo1.isEmpty()) {
          nombreEquipoElegido = linea.split(",")[0];
          resultado = Resultados.GANADOR;
        } else if (!ganaEquipo2.isEmpty()) {
          nombreEquipoElegido = linea.split(",")[4];
          resultado = Resultados.GANADOR;
        } else if (!empata.isEmpty()) {
          nombreEquipoElegido = linea.split(",")[0];
          resultado = Resultados.EMPATE;
        }

        // System.out.println(nombreEquipoElegido + resultado);

        //Seteo Equipo								

        Equipo equipo = new Equipo();
        equipo.setNombre(nombreEquipoElegido);

        //Selecciono el partido del array de partidos

        for (Partido unPartidoDentroDelArray: partidos) {

          if (unPartidoDentroDelArray.getEquipo1().getNombre().equals(nombreEquipoUno) &&
            unPartidoDentroDelArray.getEquipo2().getNombre().equals(nombreEquipoDos)) {

//       	  System.out.println("Partido eligido " + nombreEquipoUno + " vs. " + nombreEquipoDos + " equipo elegido: " + equipo.getNombre());

            // Seteo Pronostico
            pronostico = new Pronostico();
            pronostico.setPartido(unPartidoDentroDelArray);
            pronostico.setEquipo(equipo);
            pronostico.setResultado(resultado);
            sumatoriaPuntos = sumatoriaPuntos + pronostico.puntos();
//            System.out.println("Puntos de este pronóstico: " + pronostico.puntos());
          }

        }

      }
      System.out.println(sumatoriaPuntos);

    } catch (IOException e1) {
      System.out.println("Error al leer el archivo");
      e1.printStackTrace();
    }

  }
}