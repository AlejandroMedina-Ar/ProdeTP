
public class cargaApuestas {

    private int idCol;
    private int idApuesta;
    private long idApostador;
    private String nombreApostador;
    private int idPartido;
    private String equipoGanador;

    public cargaApuestas(int idCol, int idApuesta, long idApostador, String nombreApostador, int idPartido, String equipoGanador) {
        this.idCol = idCol;
        this.idApuesta = idApuesta;
        this.idApostador = idApostador;
        this.nombreApostador = nombreApostador;
        this.idPartido = idPartido;
        this.equipoGanador = equipoGanador;
    }

    public int getIdCol() {
        return idCol;
    }

    public int getIdApuesta() {
        return idApuesta;
    }

    public long getIdApostador() {
        return idApostador;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public String getEquipoGanador() {
       return equipoGanador;

    }

    public long getIdApost() {
        return idApostador;
    }

    public String getNomApost() {
        return nombreApostador;
    }

    public String getEqGan() {
        return equipoGanador;
    }
}
