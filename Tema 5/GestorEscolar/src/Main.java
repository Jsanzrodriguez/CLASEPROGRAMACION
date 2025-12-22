/*Enunciado: Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
        - Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.*/

import model.Alumno;
import model.Asignatura;
import model.Profesor;

public class Main {

    public static void main (String[] args) {


        Asignatura programacion = new Asignatura(1);
        Asignatura sistemas = new Asignatura(2);
        Asignatura marcas = new Asignatura(3);

        Alumno Jorge = new Alumno(1,2,3);
        //Jorge.mostrardatos();
        Alumno Celia = new Alumno(programacion, sistemas, marcas);
        //Celia.mostrardatos();
        Alumno Claudia = new Alumno(programacion, sistemas, marcas);
        Profesor profesor = new Profesor();
        profesor.ponerNotas(Claudia);
        Claudia.mostrardatos();
    }
}
