package ejercicios.punto3;

public class Combo implements PedidoInterfaz{

    private String descripcion;
    private double precio;

    public Combo(String descripcion, double precio){
        this.descripcion= descripcion;
        this.precio= precio;
    }

    @Override
    public String descripcon() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }
}
