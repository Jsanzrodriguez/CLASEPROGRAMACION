import model.Coche;

public class Main {


    public static void main(String[] args) {

        // esto es la instancia de la claee-> un objeto de la clase

        Coche VW = new Coche("VW", "Tiguan", "23456A", "Blanco", 250);
        //marca=VW, modelo=Tiguan c, bastidor=23456A, color=blanco
        //cv=250, velocidad=0
        //precio=0.0
         Coche ford = new Coche("Ford", "Focus", "1234A", "Verde", 150);
         //marca=Ford, modelo=Focus, bastidor=1234A, color=Verde
         //cv=150, velocidad=0
         //precio=0.0

        Coche Opel = new Coche();
        //marca=null, modelo=null, bastidor=null, color=null
        //cv=0, velocidad=0
        //precio=0.0
        Coche mercedes = new Coche("Mercedes", "Clase C", 80000.0);
        //marca=mercedes, modelo=clase c, bastidor=null, color=null
        //cv=0, velocidad=0
        //precio=80000.0
        Coche coche = new Coche();
        Coche audi = new Coche("Audi", "Etron", 120000, 500);
        VW.mostrarDatos();
        //audi.setCv(70);
        //System.out.println("Los CV que tiene el audi son "+audi.getCv());
        //System.out.println("El modelo del audi es  "+audi.getModelo());
        //marca=audi, modelo=Etron c, bastidor=null, color=null
        //cv=500, velocidad=0
        //precio=120000.0
    }
}
