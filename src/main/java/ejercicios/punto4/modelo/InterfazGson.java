package ejercicios.punto4.modelo;

import ejercicios.punto4.modelo.Post;

import java.util.List;

public interface InterfazGson {

    List<Post> parsear(String json);
}
