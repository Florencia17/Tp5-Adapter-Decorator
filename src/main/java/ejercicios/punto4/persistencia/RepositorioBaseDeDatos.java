package ejercicios.punto4.persistencia;

import ejercicios.punto4.modelo.Post;
import ejercicios.punto4.modelo.RepositorioPost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioBaseDeDatos implements RepositorioPost {

    private RepositorioPost interfazRepositorio;

    public RepositorioBaseDeDatos(RepositorioPost interfazRepositorio){
        this.interfazRepositorio= interfazRepositorio;
    }

    private Connection setupBaseDeDatos() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/decorator_malacarne";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);

    }

    @Override
    public List<Post> cargarPosteos(){

        List<Post> listaPosteos = interfazRepositorio.cargarPosteos();

        try {
            for(Post posteo: listaPosteos) {
                Connection connection = setupBaseDeDatos();
                PreparedStatement st = connection.prepareStatement(
                        "insert into posteos(userId, id, title, body) values(?,?,?,?)");
                st.setInt(1, posteo.getUserId());
                st.setInt(2, posteo.getId());
                st.setString(3, posteo.getTitle());
                st.setString(4, posteo.getBody());
                st.executeUpdate();
                st.close(); //cerrar conexion
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("No se pudo cargar el posteo correctamente", e);
        }
        return listaPosteos;
    }
}
