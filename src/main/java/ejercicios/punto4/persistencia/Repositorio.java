package ejercicios.punto4.persistencia;

import ejercicios.punto4.modelo.InterfazGson;
import ejercicios.punto4.modelo.InterfazRestCall;
import ejercicios.punto4.modelo.Post;
import ejercicios.punto4.modelo.RepositorioPost;

import java.util.List;

public class Repositorio implements RepositorioPost {

    private InterfazRestCall interfazRestCall;
    private InterfazGson interfazGson;

   public Repositorio(InterfazRestCall interfazRestCall, InterfazGson interfazGson){
       this.interfazRestCall= interfazRestCall;
       this.interfazGson= interfazGson;
   }

    @Override
    public List<Post> cargarPosteos() {
       return interfazGson.parsear(interfazRestCall.run());
    }
}
