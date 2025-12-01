import java.util.Scanner;

public class MainSudoku {
    public static void main(String[] args){
        Sudoku sudoku1 = new Sudoku();
        sudoku1.iniciarCuadrado();
        //sudoku1.rellenarNumeros();
        //sudoku1.mostrarNumeros();
        //acceso a todos los metodos de la calse y sus propiedades
        // int[4][4]
        //sudoku.iniciarCuadrado();
        //Sudoku sudoku2 = new Sudoku();
        //acceso a todos los metodos de la calse y sus propiedades
        // int[4][4]
        //sudoku.iniciarCuadrado();
        Scanner scanner;
        int opcion =0;
        do {
            scanner = new Scanner (System.in);
            System.out.println("1 rellenar cuadrado");
            System.out.println("2 listar cuadrado");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    sudoku1.rellenarNumeros();
                }
                case 2->{
                    sudoku1.mostrarNumeros();
                }
            }

        }while (opcion!=3);

    }
}
