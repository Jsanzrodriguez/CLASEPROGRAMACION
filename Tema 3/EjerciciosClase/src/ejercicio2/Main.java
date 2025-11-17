package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String palabraSistema = "frase", palabraUsuario;
        Scanner scanner = new Scanner(System.in);
        int intentos = 5, numeroAcierto =0, numeroAprox=0, numeroFallos=0;


        do{
            System.out.println("Introduce la palabra");
            intentos--;
            palabraUsuario = scanner.next();
            numeroAprox =0;
            numeroAcierto =0;
            numeroFallos =0;
            for (int i = 0; i < 5; i++) {
                if (palabraSistema.equals(palabraUsuario)){
                    numeroAcierto = palabraSistema.length();
                    break;
                }
                else if(palabraSistema.charAt(i) == palabraUsuario.charAt(i)){
                    numeroAcierto++;
                } else if(palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                    numeroAprox++;
                }else {
                    numeroFallos++;
                }
            }
            System.out.println("Los aciertos en este intento son "+numeroAcierto);
            System.out.println("Los aciertos en este aprox son "+numeroAprox);
            System.out.println("Los aciertos en este fallos son "+numeroFallos);
        }while(intentos>0 && numeroAcierto<5);

        if (numeroAcierto==5){
            System.out.println("Palabra acertada correctamente");
        }


    }
}
