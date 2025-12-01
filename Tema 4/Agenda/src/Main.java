import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        String nombre = scanner.next();
        System.out.println("Dime el apellido de la persona");
        String apellido = scanner.next();
        System.out.println("Dime cual es el correo de la persona");
        String corrreo = scanner.next();
        System.out.println("Dime cual es el telefono de la persona");
        int telefono = scanner.nextInt();
        // nombre, apellidos, correo, telefono
        Object[] persona1 = new Object[] {"Jorge","Sanz","Jorge.sanz@gmail.com",1234};
        Object[][] personas new Object[][]
        System.out.println("Los datos del usuario son");
        for (Object item : persona1) {
            System.out.println(item);
            
        }*/

        int[][] numeros = new int[4][4];
        // 4  6  1
        // 1  8  9
        //11 18 19
        //System.out.println(numeros[2][1]);
        //numeros[2][0] = 20;
        //numeros.length -> cuantas filas
        //numeros[0].length -> cuantas columnas tiene la fila indicada (0)
        //rellenamos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                //0,0  0,1  0,2
                //1,0  1,1  1,2
                //2,0  2,1  2,2

                numeros[i][j] = (int) (Math.random()*16)+1; //1-16
            }


        }
        //mostramos
        for ( int[] fila: numeros ) {
            for (int item : fila) {
                System.out.printf("%\t", item);

            }
            System.out.println();

        }




    }




}
