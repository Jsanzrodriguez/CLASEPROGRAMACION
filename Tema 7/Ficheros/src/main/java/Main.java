public class Main {

    public static void main(String[] args){
        OperacionesFichero operaciones = new OperacionesFichero();
        operaciones.leerDatosFichero();
        operaciones.LeerHijos("src/main/java/resources/ficheros");
    }
}
