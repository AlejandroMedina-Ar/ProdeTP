import java.util.ArrayList;
import java.util.HashMap;

public class Ronda {
    private ArrayList<cargaResultados> partidos;
    private ArrayList<String> ganadores;
    private HashMap<Integer, String> resultados;

    public Ronda() {
        partidos = new ArrayList<>();
        ganadores = new ArrayList<>();
        resultados = new HashMap<>();
    }

    public void agregarResultados(cargaResultados nuevo) {
        partidos.add(nuevo);
        String ganador = nuevo.getGanador();
        ganadores.add(ganador);
        resultados.put(nuevo.getIdPartido(), ganador);
    }

    public int cantidadPartidos() {
        return partidos.size();
    }

    public ArrayList<String> getGanadores() {
        return ganadores;
    }

    public HashMap<Integer, String> getResultados() {
        return resultados;
    }

    public String obtenerResultado(int idPartido) {
        return resultados.get(idPartido);
    }


}
