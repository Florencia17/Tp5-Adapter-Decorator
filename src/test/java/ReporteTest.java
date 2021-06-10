import ejercicios.punto2.Reporte;
import ejercicios.punto2.ReporteEsNulo;
import ejercicios.punto2.ReporteExiste;
import ejercicios.punto2.ReporteInterfaz;
import org.junit.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;


public class ReporteTest {

    private ReporteInterfaz reporteInterfaz;

    @Test
    public void cargarReporte() throws FileNotFoundException {

        reporteInterfaz= new ReporteEsNulo( new ReporteExiste(new Reporte("Reporte")));

        try {
            BufferedReader reader = new BufferedReader(new FileReader("ReporteArchivo.txt"));
            assertEquals("Reporte", reader.readLine());
        }catch (IOException e) {

        }
    }



}
