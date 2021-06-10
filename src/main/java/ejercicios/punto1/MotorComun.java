package ejercicios.punto1;

public class MotorComun extends Motor{

    @Override
    public void acelerar() {
        System.out.println("Se acereró el motor");
    }

    @Override
    public void arrancar() {
        System.out.println("Motor encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor apagado");
    }
}
