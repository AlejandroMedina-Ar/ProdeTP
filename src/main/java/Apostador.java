import java.util.ArrayList;

public class Apostador {
    private int idApostador;
    private String nombreApostador;
    private int aciertosTotales;

    public Apostador(int idApostador, String nombreApostador) {
        this.idApostador = idApostador;
        this.nombreApostador = nombreApostador;
    }

    public void compararApuestas(Ronda resultado, ArrayList<cargaApuestas> apuestas) {
        aciertosTotales = 0;
        for (cargaApuestas apuesta : apuestas) {
            int idPartido = apuesta.getIdPartido();
            String eqGan = apuesta.getEqGan();
            String resultadoPartido = resultado.obtenerResultado(idPartido);
            if (resultadoPartido.equals(eqGan)) {
                aciertosTotales++;
            }
        }
    }

    public static ArrayList<String[]> obtenerResultadosApostadores(Ronda ronda, Apuesta apuesta) {
        ArrayList<String[]> resultadosApostadores = new ArrayList<>();
        for (int i = 0; i < apuesta.cantidadApuestas(); i++) {
            cargaApuestas apuestaActual = apuesta.getApuestas().get(i);
            Apostador apostador = new Apostador((int) apuestaActual.getIdApost(), apuestaActual.getNomApost());
            apostador.compararApuestas(ronda, apuesta.getApuestasPorApostador(apuestaActual.getIdApost()));
            String[] datosApostador = {String.valueOf(apostador.idApostador), apostador.nombreApostador, String.valueOf(apostador.aciertosTotales)};
            resultadosApostadores.add(datosApostador);
        }
        resultadosApostadores.sort((r1, r2) -> Integer.compare(Integer.parseInt(r2[2]), Integer.parseInt(r1[2])));
        return resultadosApostadores;
    }

    public int getIdApostador() {
        return idApostador;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public int getAciertosTotales() {
        return aciertosTotales;
    }
}
