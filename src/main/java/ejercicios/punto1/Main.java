package ejercicios.punto1;

import java.util.Scanner;

public class Main {
    private static Motor motor;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        motor = elegirTipoMotor(mostarElegirTipoMotor());
        elegirAccion(mostrarElegirAccion());

    }

    public static int mostarElegirTipoMotor() {
        System.out.println("Elegir un motor: ");
        System.out.println("1 --> Motor comun");
        System.out.println("2 --> Motor Economico");
        System.out.println("3 --> Motor Electrico");
        return scanner.nextInt();
    }

    public static int mostrarElegirAccion() {
        System.out.println("¿Que desea hacer con el motor?");
        System.out.println("1 --> encender");
        System.out.println("2 --> acelerar");
        System.out.println("3 --> apagar");
        return scanner.nextInt();
    }

    public static Motor elegirTipoMotor(int opcion) {
        switch (opcion) {
            case 1:
                return new MotorComun();
            case 2:
                return new MotorEconomico();
            case 3:
                return new MotorElectricoAdapter();
        }
        return null;
    }

    public static void elegirAccion(int opcion){
        switch (opcion) {
            case 1:
                motor.arrancar();
                break;
            case 2:
                motor.acelerar();
                break;
            case 3:
                motor.apagar();
                break;
        }
    }
}

