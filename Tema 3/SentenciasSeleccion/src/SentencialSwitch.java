import java.util.Scanner;

public class SentencialSwitch {

    public void usoSwitchInt(){

        int valor = 5;
        String nombre;
        switch (valor){
            case 1:
                nombre = "Borja";
                System.out.println("Toma valor de 1");
                break;
            case 5:
                nombre = "Juan";
                System.out.println("Toma valor de 5");
                break;
            case 7:
                nombre = "Maria";
                System.out.println("Toma valor de 7");
                break;
            default:
                nombre = "Sin nombre";
                System.out.println("Valor no contemplado");
        }
        System.out.println("El nombre resultante es "+nombre);
        System.out.println("Terminando el bloque switch");
    }

    public void usoSwitchString(){
        String nombre ="Borja";
        switch (nombre.toLowerCase()) {

            case "borja":
                System.out.println("El nombre es Borja");
                break;
            case "maria":
                System.out.println("El nombre es maria");
                break;
            case "juan":
                System.out.println("El nombre es juan");
                break;

            default:
                System.out.println("Nombre no contemplado");
        }
        System.out.println("Terminando de analizar el nombre");
    }
    public void usoSwitchChar() {
        int nota = 7;
        switch (nota){
            case 1->{
                System.out.println("Seleccionado el caso 1");
            }
            case 2->{
                System.out.println("Seleccionado el caso 2");
            }
            case 3->{
                System.out.println("Seleccionado el caso 3");
            }
            case 4->{
                System.out.println("Seleccionado el caso 4");
            }
            case 5->{
                System.out.println("Seleccionado el caso 5");
            }
            default ->{
                System.out.println("Numero sin contemplar");
            }
        }
    }
    public void menuOperaciones(){
        Scanner sacanner = new Scanner(System.in);
        System.out.println("Menu operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multi");
        System.out.println("4. Dividir");
        System.out.println("5. Modulo");
        System.out.println("Que operacion quieres hacer");
        int opcion = sacanner.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = sacanner.nextInt();
        System.out.println("Dime el segundo operando");
        int op2 = sacanner.nextInt();
        double resultado = 0;
        switch (opcion){
            case 1-> {
                System.out.println("Vas a sumar");
                resultado = op1+op2;

            }
            case 2->{
                System.out.println("Vas a restar");
                resultado = op1-op2;

            }
            case 3->{
                System.out.println("Vas a multiplicar");
                resultado = op1*op2;

            }
            case 4->{
                System.out.println("Vas a dividir");
                if(op2== 0){
                    System.out.println("Resultado incierto, se aplica la regla del 0");
                }
                else {
                    resultado = (double) op1 / op2;
                }

            }
            case 5->{
                System.out.println("Vas a modulo");
                resultado = op1%op2;

            }
            default -> {
                System.out.println("Datos incorrectos");
            }
        }
        System.out.printf("El resultado de la operacion es %.1f%n",resultado);

    }

}
















