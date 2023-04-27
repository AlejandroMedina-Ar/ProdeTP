import java.util.ArrayList;
import java.util.HashMap;

public class Apuesta {

    private ArrayList<cargaApuestas> apuestas;

    public Apuesta() {
        this.apuestas = new ArrayList<>();
    }

    public void agregarApuestas(cargaApuestas nuevo) {
        apuestas.add(nuevo);
    }

    public int cantidadApuestas() {
        return apuestas.size();
    }

    public ArrayList<cargaApuestas> getApuestas() {
        return apuestas;
    }

    public ArrayList<cargaApuestas> getApuestasPorApostador(long idApostador) {
        ArrayList<cargaApuestas> apuestasPorApostador = new ArrayList<>();
        for (cargaApuestas apuesta : apuestas) {
            if (apuesta.getIdApostador() == idApostador) {
                apuestasPorApostador.add(apuesta);
            }
        }
        return apuestasPorApostador;


    /*private static  ArrayList<cargaApuestas> apPartidos;

    public Apuesta() {
        apPartidos = new ArrayList<>();
    }


    public void agregarApuestas(cargaApuestas nuevo) {
        apPartidos.add(nuevo);

    }

    public  int cantidadApPartidos() {
        return apPartidos.size();
    }

    public static ArrayList<cargaApuestas> getApuestas() {
        return new ArrayList<>(apPartidos); */
    }


}



