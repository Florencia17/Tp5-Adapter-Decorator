package ejercicios.punto1;

public class MotorEconomico extends Motor{

    @Override
    public void arrancar() {
        System.out.println("Motor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor apagado");
    }

    @Override
    public void acelerar() {
        System.out.println("Se aceleró el motor");
    }
}
