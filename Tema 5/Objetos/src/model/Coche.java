package model;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
@Data
public class Coche {

    private String marca, modelo, bastidor, color;
    private int cv, velocidad;
    private double precio;

    // por defecto en toda clase hay un constructor que se denomina coonstructor vacio
        //desaparece implicito cuando escribo otro constructor
    //public coche (){cuerpo}

    public Coche(){}
    public Coche(String marca, String modelo, String bastidor, String color, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.color = color;
        this.cv = cv;
        //this.velocidad = 0;
        //this.precio = 2000.0;

    }
    public Coche(String marca, String modelo, Double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Coche(String marca, String modelo, double precio,  int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cv = cv;
    }


   /*
    public int getCv(){
        // puedo hacer validaciones de datos
            //los CV del coche han sido modificados:
                // en caso de estar modificados retorno los reales
        return cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCv(int cv){
        //this.cv = this.cv +cv;
        // si el coche al cambiarlos pasa de 1000cv, se queda en 1000, es el tope
        this.cv += cv;
    }
    */

    @Override
    public String toString() {
        return this.modelo +" "+this.marca+" "+this.precio;
    }

    public void mostrarDatos(){
        System.out.println("Mostrando los datos del coche");
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("bastidor = " + bastidor);
        System.out.println("color = " + color);
        System.out.println("cv = " + cv);
        System.out.println("velocidad = " + velocidad);
        System.out.println("precio = " + precio);
    }
}
