package model;

public final class Interino extends Profesor{
    private int horasOposicion;
    private boolean estadoBolsa;

    public Interino(){

    }

    public Interino(String nombre, String apellido, int salario, int horasOposicion) {
        super(nombre, apellido, salario);
        this.horasOposicion = horasOposicion;
    }

    public Interino(String nombre, String apellido, int salario, int nExperiencia, int horasOposicion) {
        super(nombre, apellido, salario, nExperiencia);
        this.horasOposicion = horasOposicion;
    }

    public void realizarOposicion(){
        System.out.println("Voy a realizar el examen");
        if ((int)(Math.random()*2)>0){
            this.estadoBolsa = true;
            System.out.println("He aprobado la oposicion");
        } else {
            System.out.println("Me quedo como estoy");
        }
    }
    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Soy un interino, intentare dar la clase lo mejor posible ");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("horasOposicion = " + horasOposicion);
        System.out.println("estadoBolsa = " + estadoBolsa);
    }

    public int getHorasOposicion() {
        return horasOposicion;
    }

    public void setHorasOposicion(int horasOposicion) {
        this.horasOposicion = horasOposicion;
    }

    public boolean isEstadoBolsa() {
        return estadoBolsa;
    }

    public void setEstadoBolsa(boolean estadoBolsa) {
        this.estadoBolsa = estadoBolsa;
    }
}
