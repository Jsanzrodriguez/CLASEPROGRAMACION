import java.util.Scanner;

public class SentenciaWhile {

    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);
        int intentos = 1;
        int aleatorio = (int)(Math.random() *11);
        System.out.println("Introduce un numero a ver si es el correcto");
        int numero = scanner.nextInt();
        while (aleatorio!=numero){
            System.out.println("Intento fallido, por favor intentalo de nuevo");
            numero = scanner.nextInt();
            intentos++;
        }
        System.out.printf("Numero acertado el numero en %d",intentos);
    }

    public void imprimirMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            System.out.println("Indica que operacion quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1-> {
                    System.out.println("Opcion seleccionada suma");
                }
                case 2-> {
                    System.out.println("Opcion seleccionada resta");
                }
                case 3-> {
                    System.out.println("OPcion seleccionada multiplicacion");
                }
                case 4-> {
                    System.out.println("Opcion seleccioanda division");
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opcion no contemplada");
                }
            }

        }while (opcion!=5);

        System.out.println("Finalizandop la repeticion");

    }






}
