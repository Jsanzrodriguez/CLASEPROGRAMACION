package ejercicioPalabras;

import java.sql.SQLOutput;
import java.util.Scanner;

//Ejercicio 15 t3.
/*Pedir por consola una frase. Una vez introducida. Indicar:

1. Cuantas oraciones tiene
2. Cuantas letras tiene
3. Cuantas palabras tiene
4. Cuantas letras tiene (sin contar espacios ni símbolos de puntuación) cada oracion
*/

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quieres analizar");
        String frase = scanner.nextLine();
        //EstaeslafrasequeanalizoEstaesotrafrase
        //String [] = [Esto es solo una frase,Esta es la segunda]
       // System.out.println("La frase es "+frase);
        String[] frases = frase.split("\\.");
        String frasePalabras = frase.replaceAll(" ","").replaceAll(",", "").replaceAll("\\.", "");
        String palabraFrase = frase.replaceAll(",", " ").replaceAll("\\.", " ");
        String[] palabras =  palabraFrase.split(" ");
        System.out.println("El resultado es "+frasePalabras);
        System.out.println("El numero de oraciones es "+frases.length);
        System.out.println("El numero de letras es "+frasePalabras.length());
        System.out.println("El numero de palabras es "+palabras.length);
        for (String item: frases) {
        int contador = item.split(" ").length;
            System.out.println("El numero de palabras de la primera oracion es "+contador);
        }

    }
}
