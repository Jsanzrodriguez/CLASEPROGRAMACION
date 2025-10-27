public class SentenciaIf {

    public static void examenAprobado(int nota){
        System.out.println("Procedemos a evaluar si un examen está OK");
        System.out.println("La nota que vamos a evaluar es "+nota);
        if(nota>=5){
            System.out.println("El examen está aprobado");
        } else{
            System.out.println("El examen esta suspenso");
        }
        System.out.println("Terminando la evaluacion del examen");
        System.out.println("Programa finalizado");





    }
    public static void notaExamen(int nota){
        // suspendo 0-4.99
        //aprobado 5-7.99
        //notable 8-8.99
        //sobresaliente 9-9.99
        //MH 10
        String resultadoExamen = "";
        if (nota>0 && nota<=10){
            if (nota<5){
                 resultadoExamen ="suspenso";
                //System.out.println("El examen está suspenso");
            } else if(nota <8){
                resultadoExamen ="aprobado";
                //System.out.println("El examen está aprobado");
            } else if (nota<9){
                resultadoExamen ="notable";
                //System.out.println("El examen es notable");
            } else if (nota<10){
                resultadoExamen ="sobresaliente";
                //System.out.println("El examen es sobresaliente");
            } else {
                resultadoExamen ="MH";
                //System.out.println("El examen es de MH");
            }
       } else {
            resultadoExamen ="fuera de rango";
            //System.out.println("La nota no esta en la escala correcta");
        }
        System.out.println(resultadoExamen);


    }



}
