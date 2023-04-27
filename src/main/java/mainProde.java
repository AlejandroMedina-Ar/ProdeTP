import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class mainProde {

    public static void main(String[] args) throws IOException {

         Apuesta apuestaLinea = new Apuesta();
         String archivoApuestas = "apuestas.csv";
          apuestaLinea = LectorArchApuestas.cargarApuestas(archivoApuestas);
           System.out.println("cantidad de apuestas es " + apuestaLinea.cantidadApuestas());




       //  ArrayList<cargaApuestas> listaApuestas = Apuesta.getApuestas();
       //   for (int i = 0; i < listaApuestas.size(); i++) {
       //       System.out.println("Apuesta " + (i+1) + ": " + listaApuestas.get(i));
      //    }
      //  HashMap<Long, Integer> getAciertosTotalesPorApostador();



         Scanner input = new Scanner(System.in);

         System.out.println("¿Desde dónde desea cargar los resultados? ");
         System.out.println("1 - Archivo");
         System.out.println("2 - Base de datos");
         int opcion = input.nextInt();
         Ronda rondaSemanal = new Ronda();

         if (opcion == 1) {
              String archivoResultados = "resultados.csv";
              rondaSemanal = LectorArchResultado.cargarResultados(archivoResultados);
         } else if (opcion == 2) {
              rondaSemanal = LectorDBResultado.cargarResultados();
         } else {
             System.out.println("Opción inválida");
             System.exit(0);
         }


           System.out.println("hay " + rondaSemanal.cantidadPartidos() + " Partidos Jugdos esta Semana" + "\n" +
                "Y los gandores son " + "\n" + rondaSemanal.getResultados()) ;

           HashMap<Integer, String> resultados = rondaSemanal.getResultados();

           System.out.println("------------------------------------------------");

           String winner = resultados.get(1);
           System.out.println("El ganador del partido 1 fue: " + winner);



        }

    }

