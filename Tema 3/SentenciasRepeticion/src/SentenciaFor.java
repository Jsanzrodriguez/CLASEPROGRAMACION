public class SentenciaFor {

    public void sentenciaFor() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando linea");
        }
        for (int i = 100; i >= 0; i -= 10) {
            System.out.println("Ejecuciones " + i);

        }


    }

    public void tablaMultiplicarNumero(int numero) {

        System.out.println("Procedemos a escribir la tabla de multiplicar del " + numero);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);

        }

    }

    public void palabraPalindromo() {
        String frase = "Alli ves sevilla";
        frase = frase.replaceAll (" ","");
        boolean esPalindromo = true;
        for (int i = 0; i < frase.length() / 2; i++) {
            System.out.print(frase.charAt(i));

            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length() - 1 - i);
            if (letraUno != letraDos) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }

    public void calcularFactorial (){
        int numeroCalcular=4;
        int factorial = 1;
        for (int i = 1; i <=numeroCalcular ; i++) {
            factorial *= i;

        }
        System.out.printf("El factorial de %d es %d",numeroCalcular,factorial);

    }
    public void recorrerColeccion(){
        int[] numeros = {1,10,90,40};
       /* for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }*/

        for ( int item : numeros ) {
            System.out.println(item);

        }
    }
}





