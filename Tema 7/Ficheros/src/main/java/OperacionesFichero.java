import java.io.File;

public class OperacionesFichero {

    // obtener datos de un fichero

    public void leerDatosFichero() {
        File file = new File("src/main/java/resources/ficheros/ejemplo.txt");
        System.out.println("Existe "+file.exists());
        System.out.println("Tamaño "+file.length());
        System.out.println("Es fichero "+file.isFile());
        System.out.println("Ruta absoluta "+file.getAbsolutePath());
    }

    public void LeerHijos(String path){
        File file = new File(path);
        for (File s : file.listFiles()) {
            System.out.println(s.getName());

        }
    }
}
