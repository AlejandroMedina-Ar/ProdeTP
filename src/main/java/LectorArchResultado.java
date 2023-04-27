import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LectorArchResultado {
    public static Ronda cargarResultados(String archivo) throws IOException {


        Path archivoResultados = Paths.get(archivo);
        Scanner lector = new Scanner(archivoResultados);

        Ronda rondaSemanal = new Ronda();

        while(lector.hasNextLine()) {
            String linea = lector.nextLine();
            Scanner lineaScanner = new Scanner(linea);
            lineaScanner.useDelimiter("[,|\\r|\\n]");

            int idPar = lineaScanner.nextInt();
            String equP1 = lineaScanner.next();
            int gEquP1n = lineaScanner.nextInt();
            String equP2 = lineaScanner.next();
            int gEquP2n = lineaScanner.nextInt();

            cargaResultados nuevo = new cargaResultados(idPar, equP1, gEquP1n, equP2, gEquP2n);
            rondaSemanal.agregarResultados(nuevo);
            lineaScanner.close();
        }

        lector.close();

        return rondaSemanal;



    }
}