import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LectorArchApuestas {
    public static Apuesta cargarApuestas(String archivo) throws IOException {

        Path archivoApuestas = Paths.get(archivo);
        Scanner lector2 = new Scanner(archivoApuestas);

        Apuesta apuestaLinea = new Apuesta();

        while (lector2.hasNextLine()) {
            String linea2 = lector2.nextLine();
            Scanner lineaScanner2 = new Scanner(linea2);
            lineaScanner2.useDelimiter("[,|\\r|\\n]");

            int idCol = lineaScanner2.nextInt();
            int idApu = lineaScanner2.nextInt();
            long idApost = lineaScanner2.nextInt();
            String nomApost = lineaScanner2.next();
            int idPar = lineaScanner2.nextInt();
            String eqGan = lineaScanner2.next();


            cargaApuestas nuevo = new cargaApuestas(idCol,idApu,idApost,nomApost,idPar,eqGan);
            apuestaLinea.agregarApuestas(nuevo);
            lineaScanner2.close();

        }
        return apuestaLinea;


    }

}
