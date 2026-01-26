import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a mi gestor escolar");
        /*Fijo fijo1 = new Fijo("Profesor1", "Apellido1", 10000, 300, 3000);
        interino.realizarOposicion();
        interino.mostrarDatos();*/
        Fijo fijo2 = new Fijo("Profesor2", "Apellido2", 20000);
        //fijo2.realizarInspeccion(3);
        Interino interino = new Interino("ProfesorInterino1", "ApellidoInterino1", 4000,1,10);
        //interino.mostrarDatos();
        Director director = new Director("Director1,", "Director2");
        //director.realizarInspeccion(2);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(fijo2);
        listaPersonas.add(interino);
        listaPersonas.add(director);

        for (Persona persona : listaPersonas) {
            if(persona instanceof Inspector){
                ((Inspector) persona).realizarInspeccion(5);
            }

            if(persona instanceof Manifestable){
                ((Manifestable)persona).manifestar();
            }
        }


        /*director.mostrarDatos();*/


        //Profesor profesor = new Profesor();
        /*Persona Jorge = new Persona("Jorge","Sanz");
        Jorge.saludar();
        Jorge.mostrarDatos();*/
        /*Alumno alumno1 = new Alumno("Jorge1", "Sanz", 1234, "DAM");
        Alumno alumno2 = new Alumno("Jorge2", "Sanz", 1234, "DAM");
        Alumno alumno3 = new Alumno("Jorge3", "Sanz", 1234, "DAM");
        Alumno alumno4 = new Alumno("Jorge4", "Sanz", 1234, "DAM");
        Profesor profesor1 = new Profesor("Maria1", "Lopez",30000,6);
        Profesor profesor2 = new Profesor("Maria2", "Lopez",30000,6);
        Profesor profesor3 = new Profesor("Maria3", "Lopez",30000,6);
        Profesor profesor4 = new Profesor("Maria4", "Lopez",30000,6);

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        listaProfesores.add(profesor1);
        listaProfesores.add(profesor2);
        listaProfesores.add(profesor3);
        listaProfesores.add(profesor4);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);
        for (Persona persona : listaPersonas) {
            persona.saludar();
            persona.mostrarDatos();

            if (persona instanceof Alumno){
                ((Alumno) persona).realizarExamen();
            } else if (persona instanceof Profesor){
                ((Profesor) persona).corregirExamen();
            }
            //((Profesor)persona).corregirExamen();
            //((Alumno)persona).realizarExamen();
        }

        /*profesor.corregirExamen();
        profesor.saludar();
        alumno.saludar();
        //profesor.saludar();
        //alumno.saludar();
        /*System.out.println("Indica el nombre del alumno");
        alumno.setNombre("Jorge");
        alumno.setApellido("Sanz");
        alumno.setCurso("DAM");
        alumno.setnMatricula(1234);*/
       // alumno.mostrarDatos();
       // alumno.realizarExamen();
        // nombre =  apellido =*/
    }
}
