public class SentenciaFor {

    public void sentenciaFor(){
        for (int i=0;i<5;i++){
            System.out.println("Ejecutando linea");
        }
        for (int i = 100; i >=0 ; i-=10) {
            System.out.println("Ejecuciones "+i);

        }


    }

    public void tablaMultiplicarNumero (int numero){

        System.out.println("Procedemos a escribir la tabla de multiplicar del "+numero);
        for (int i = 0; i <11 ; i++) {
            System.out.printf("%d * %d = %d%n",i,numero,i*numero);

        }






    }






}

