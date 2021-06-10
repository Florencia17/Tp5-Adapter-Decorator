package ejercicios.punto4;


import ejercicios.punto4.modelo.Blog;
import ejercicios.punto4.modelo.RepositorioPost;
import ejercicios.punto4.persistencia.Repositorio;
import ejercicios.punto4.persistencia.RepositorioArchivo;
import ejercicios.punto4.persistencia.RepositorioBaseDeDatos;
import ejercicios.punto4.servicio.RestCall;
import ejercicios.punto4.servicio.ServicioGson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
   /*         RestCall rest = new RestCall(
                    "https://jsonplaceholder.typicode.com/posts");
            System.out.println(rest.run());*/


        Blog blog1 = new Blog(new RepositorioArchivo(new File("Posteo.txt"), new Repositorio(new RestCall("https://jsonplaceholder.typicode.com/posts"), new ServicioGson())));
        Blog blog2 = new Blog(new RepositorioBaseDeDatos(new Repositorio(new RestCall("https://jsonplaceholder.typicode.com/posts"), new ServicioGson())));
        blog1.cargarPost();
        blog2.cargarPost();


    }
}


