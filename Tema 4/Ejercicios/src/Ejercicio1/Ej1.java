package Ejercicio1;

import java.util.Scanner;

public class Ej1 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tiene las matrices");
        int tamanio = scanner.nextInt();
        int[][] matriz1 = new int[tamanio][tamanio];
        int[][] matriz2 = new int[tamanio][tamanio];
        int[][] sumaMatrices = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }

        }
        System.out.println("Impriendo suma");
        imprimirArray(sumaMatrices);
    }



    public static void imprimirArray(int [][] matriz){
        for (int[] fila : matriz) {
            for (int item : fila) {
                System.out.println(item +"\t");
            }
            System.out.println();
        }





    }
}
