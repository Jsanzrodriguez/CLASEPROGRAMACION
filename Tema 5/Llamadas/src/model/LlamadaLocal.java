package model;

public final class LlamadaLocal extends Llamada implements Regulable {

    //lOS CONSTRUCTORES NO SE HEREDAN

    public LlamadaLocal(){}

    public LlamadaLocal(long nOrigen, long nDestino, int duracion){
        super(nOrigen, nDestino, duracion);
        // coste = 0
    }


    @Override
    public void mostrarDatos() {
        System.out.println("Llamada LOCAL");
        super.mostrarDatos();
    }

    @Override
    public boolean regularNumeros() {
        return getnOrigen()%2==0;
    }
}
