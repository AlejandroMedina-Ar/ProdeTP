import java.sql.*;

public class LectorDBResultado {

    private static final String URL = "jdbc:mysql://localhost:3306/prode";
    private static final String USER = "root";
    private static final String PASSWORD = "250113";

    public static Ronda cargarResultados() {
        Ronda rondaSemanal = new Ronda();

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT idPartido, equipo1, golesEquipo1, equipo2, golesEquipo2 FROM resultados")) {

            while (rs.next()) {
                int idPar = rs.getInt("idPartido");
                String equP1 = rs.getString("equipo1");
                int gEquP1n = rs.getInt("golesEquipo1");
                String equP2 = rs.getString("equipo2");
                int gEquP2n = rs.getInt("golesEquipo2");

                cargaResultados nuevo = new cargaResultados(idPar, equP1, gEquP1n, equP2, gEquP2n);
                rondaSemanal.agregarResultados(nuevo);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
            e.printStackTrace();
        }

        return rondaSemanal;







    }
}