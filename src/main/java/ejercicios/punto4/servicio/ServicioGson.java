package ejercicios.punto4.servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ejercicios.punto4.modelo.InterfazGson;
import ejercicios.punto4.modelo.Post;

import java.util.List;

public class ServicioGson implements InterfazGson {
    @Override
    public List<Post> parsear(String json) {
        return new Gson().fromJson(json, new TypeToken<List<Post>>() {
        }.getType());
    }


}