package ejercicios.punto2;

import java.io.File;

public class ReporteEsNulo implements ReporteInterfaz{

    private ReporteInterfaz reporteInterfaz;

    public ReporteEsNulo(ReporteInterfaz reporte){
        this.reporteInterfaz= reporte;
    }

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        this.reporteInterfaz.exportar(file);
    }
}
