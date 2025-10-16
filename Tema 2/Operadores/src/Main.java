import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando programa de  operadores");
        Operadores operacionesVariable = new Operadores();
        operacionesVariable.operadoresAritmeticos();
        operacionesVariable.operadoresComparacion();
        operacionesVariable.operadoresAsignacion();
        operacionesVariable.operadoresLogicos();
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que salario quieres ganar");
        double salarioEntrada = lectorTeclado.nextDouble();
        System.out.println("Que edad tienes");
        int edad = lectorTeclado.nextInt();
        System.out.println("Tienes permiso de conducir");
        boolean conducir = lectorTeclado.nextBoolean();
        operacionesVariable.evaluarCandidato(20000, 20, true);
}

