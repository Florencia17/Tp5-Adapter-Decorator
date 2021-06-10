package ejercicios.punto3;

public class Main {
    public static void main(String[] args) {

        PedidoInterfaz pedidoInterfaz= new Adicional("Tomate", 10, new Adicional("Queso",15, new Combo("Combo basico", 200)));
        PedidoInterfaz pedidoInterfaz1= new Adicional("Tomate", 10, new Adicional("Queso",15, new Combo("Combo basico", 200)));

        System.out.println("Detalle pedido:" + pedidoInterfaz.descripcon() +"\n"+ "precio: "+ pedidoInterfaz.precio());
}}
