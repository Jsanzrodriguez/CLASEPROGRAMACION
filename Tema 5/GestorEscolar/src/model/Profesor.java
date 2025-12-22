package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Profesor {
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura2().setCalificacion((Math.random()*10)+0.1);
        alumno.getAsignatura3().setCalificacion((Math.random()*10)+0.1);
    }
}
