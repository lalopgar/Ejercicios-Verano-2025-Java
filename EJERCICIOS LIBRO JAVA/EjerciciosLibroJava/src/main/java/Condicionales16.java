//Realiza un programa que nos diga si hay probabilidad de que nuestra pareja
//nos está siendo infiel. El programa irá haciendo preguntas que el usuario
//contestará con verdadero o falso. Cada pregunta contestada como verdadero
//sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. Utiliza
//el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones
//del programa.

import java.util.Scanner;

public class Condicionales16 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int acumulador=0;

        //Pregunta 1
        System.out.println("¿Tu pareja ha comenzado a proteger mucho más su teléfono que antes " +
                "(como ponerlo boca abajo, usar contraseña o llevarlo consigo incluso al baño)?");
        String respuesta1 = teclado.next();

        if (respuesta1.equalsIgnoreCase("verdadero")){
            System.out.println("Has respondido verdadero.");
            acumulador = acumulador+3;
        }else if (respuesta1.equalsIgnoreCase("falso")){
            System.out.println("Has respondido falso.");
        }else{
            System.out.println("Introduce bien los datos que se piden.");
        }


        //Pregunta 2
        System.out.println("¿Ha disminuido el interés de tu pareja por tener intimidad contigo sin una razón aparente?");
        String respuesta2 = teclado.next();

        if (respuesta2.equalsIgnoreCase("verdadero")){
            System.out.println("Has respondido verdadero.");
            acumulador = acumulador+3;
        }else if (respuesta2.equalsIgnoreCase("falso")){
            System.out.println("Has respondido falso.");
        }else{
            System.out.println("Introduce bien los datos que se piden.");
        }


        //Pregunta 3
        System.out.println("¿Tu pareja ha cambiado repentinamente de apariencia, ropa o perfume sin que tú se lo hayas sugerido?");
        String respuesta3 = teclado.next();

        if (respuesta3.equalsIgnoreCase("verdadero")){
            System.out.println("Has respondido verdadero.");
            acumulador = acumulador+3;
        } else if (respuesta3.equalsIgnoreCase("falso")) {
            System.out.println("Has respondido falso.");
        }else{
            System.out.println("Introduce bien los datos que se piden.");
        }


        //Pregunta 4
        System.out.println("¿Evita hablar de su día contigo o cambia de tema cuando haces preguntas sobre dónde ha estado?");
        String respuesta4 = teclado.next();

        if (respuesta4.equalsIgnoreCase("verdadero")){
            System.out.println("Has respondido verdadero.");
            acumulador = acumulador+3;
        }else if (respuesta4.equalsIgnoreCase("falso")){
            System.out.println("Has respondido falso.");
        }else{
            System.out.println("Introduce bien los datos que se piden.");
        }


        //Pregunta 5
        System.out.println("¿Tu pareja muestra irritación o se pone a la defensiva cuando le preguntas cosas simples, como con quién estuvo?");
        String respuesta5 = teclado.next();

        if (respuesta5.equalsIgnoreCase("verdadero")){
            System.out.println("Has respondido verdadero.");
            acumulador = acumulador+3;
        }else if (respuesta5.equalsIgnoreCase("false")){
            System.out.println("Has respondido falso.");
        }else{
            System.out.println("Introduce bien los datos que se piden.");
        }

        System.out.println("El resultado es: " + acumulador + " puntos.");

        if (acumulador <=3){
            System.out.println("No es infiel.");
        }else if (acumulador <=10){
            System.out.println("Estate alerta.");
        }else{
            System.out.println("Es infiel.");
        }

    }
}
