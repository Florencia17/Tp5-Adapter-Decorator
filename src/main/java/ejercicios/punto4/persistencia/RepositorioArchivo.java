package ejercicios.punto4.persistencia;

import ejercicios.punto4.modelo.Post;
import ejercicios.punto4.modelo.RepositorioPost;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class RepositorioArchivo implements RepositorioPost {

    private final File file;
    private RepositorioPost interfazRepositorio;

    public RepositorioArchivo(File file, RepositorioPost interfazRepositorio) {
        this.file = file;
        this.interfazRepositorio = interfazRepositorio;
    }


    @Override
    public List<Post> cargarPosteos() {

        List<Post> listaPosteos = interfazRepositorio.cargarPosteos();

        try {
            for (Post posteo : listaPosteos) {
                Writer writer = new FileWriter(file, true);
                writer.write(posteo.getUserId() + ", " + posteo.getId() + ", "
                        + posteo.getTitle() + ", " + posteo.getBody() + ",");
                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("No se ha podido cargar el posteo", e);

        }
        return listaPosteos;
    }

}
