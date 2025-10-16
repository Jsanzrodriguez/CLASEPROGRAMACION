import java.sql.SQLOutput;

public class Operadores {


        public void operadoresAritmeticos() {
        // unarios
        int operandoUno = 8;
        // incremento para poder hacer un contador
        operandoUno++;
        operandoUno++;
        System.out.println("El valor de operando uno es "+operandoUno);
        // decrementos le resta valor a lo que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de los decrementos es "+operandoUno);
        // binarios serian dos operadores (+), (-), (*), (/)
        operandoUno =8;
        int operandoDos= 3;
        int suma= operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta= operandoUno - operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        int multi= operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es "+multi);
        double division= (double) operandoUno/operandoDos; // 8.0/3 realizo el casting (cambiar el valor solo aqui)
        System.out.println("El resultado de la divison es "+division);
        int modulo= operandoUno%operandoDos;
        System.out.println("El resto de la division es "+modulo);
        // me vale para saber si un numero si es par o impar
     }
        public void operadoresAsignacion() {
        int operadorUno= 10;
        int operadorDos= 6;
        operadorUno += 5; // en operadorUno guarda el valor que tiene +5
        operadorUno += operadorDos;
         System.out.println("El valor de operadorUno es "+operadorUno);
        operadorUno-=5;
        operadorUno*=2;
        operadorUno/=2;
        operadorUno%=2;
        System.out.println("El resultado de las operaciones completas es "+operadorUno);
     }
        public void operadoresComparacion() {
        int operandoUno= 10;
        int operandoDos= 20;
        boolean resultado= operandoUno>operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado= operandoUno<operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado= operandoUno<=operandoDos;
        resultado= operandoUno>=operandoDos;
        resultado= operandoUno==operandoDos;
        resultado= operandoUno!=operandoDos;
        // cuanto quieres cobrar
        // cuantos años tienes
        // Tienes carnet de conducir

    }
        public void operadoresLogicos(){
            int sueldo = 20000;
            int edad = 35;
            boolean conducir = true;
            boolean candidatoValido = sueldo<30000 && edad<40 && conducir;
            candidatoValido= sueldo<20000 || edad<25 || conducir;
            System.out.println("El resultado del candidato es "+candidatoValido);








        }








}
