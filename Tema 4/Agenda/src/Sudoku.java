//Instrucciones del sudoku

public class Sudoku {

    private int[][] cuadrado = new int[4][4];


    public void iniciarCuadrado() {
        System.out.println("Procedemos a iniciar el sudoku");
        rellenarNumeros();
        mostrarNumeros();

    }

    public void rellenarNumeros(){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*20)+1;
                }while (estaNumero(aleatorio));
                //estaNumero(aleatorio);
                //Solo si no esta en el cuadrado. En caso de si estar, genera otro
                cuadrado[i][j] = aleatorio; //1-20
            }
        }

        //Guardar aquellos nueros que no estan repetidos
    }

    private boolean estaNumero(int numero){
        //El numero a comparar OK
        //recorer que quieres recorrer OK
            //if comparando OK
        for (int[] fila : cuadrado) {
            for (int item : fila) {
                if(item == numero){
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarNumeros(){
        for ( int[] fila: cuadrado ) {
            for (int item : fila) {
                System.out.printf("%d\t", item);

            }
            System.out.println();


        }
    }
}
