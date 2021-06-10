package ejercicios.punto2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        ReporteInterfaz reporte= new ReporteEsNulo( new ReporteExiste (new Reporte("Reporte")));

        reporte.exportar(new File("ReporteArchivo.txt"));

}}
