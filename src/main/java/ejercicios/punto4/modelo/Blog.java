package ejercicios.punto4.modelo;

import java.util.List;

public class Blog {

    RepositorioPost repositorioPost;

    public Blog(RepositorioPost repositorioPost){
        this.repositorioPost= repositorioPost;
    }

    public List<Post> cargarPost(){
        return repositorioPost.cargarPosteos();
    }
}
