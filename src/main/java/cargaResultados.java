import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class cargaResultados {

        private int idPartido;
        private String equipo1;
        private int golesEquipo1;
        private String equipo2;
        private int golesEquipo2;

        public String getGanador() {
            if (golesEquipo1 > golesEquipo2) {
                return equipo1;
            } else if (golesEquipo2 > golesEquipo1) {
                return equipo2;
            } else {
                return "Empate";
            }
        }

        @Override
        public String toString() {
            return idPartido + " " + equipo1 + " " + golesEquipo1 + " " + equipo2 + " " + golesEquipo2;

       }
}
