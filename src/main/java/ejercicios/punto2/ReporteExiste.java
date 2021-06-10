package ejercicios.punto2;

import java.io.File;

public class ReporteExiste implements ReporteInterfaz {

    private ReporteInterfaz reporteInterfaz;

    public ReporteExiste(ReporteInterfaz reporte){
        this.reporteInterfaz= reporte;
    }

    @Override
    public void exportar(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.reporteInterfaz.exportar(file);
    }
}
