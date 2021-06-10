package ejercicios.punto3;

public class Adicional implements PedidoInterfaz{

    PedidoInterfaz pedidoInterfaz;
    private String descripcion;
    private double precio;

    public Adicional(String descripcion, double precio, PedidoInterfaz pedidoInterfaz){
        this.descripcion= descripcion;
        this.precio= precio;
        this.pedidoInterfaz= pedidoInterfaz;
    }

    @Override
    public double precio() {
      return precio + pedidoInterfaz.precio();
    }

    @Override
    public String descripcon() {
        return  pedidoInterfaz.descripcon() + "-" + descripcion ;
    }

}
