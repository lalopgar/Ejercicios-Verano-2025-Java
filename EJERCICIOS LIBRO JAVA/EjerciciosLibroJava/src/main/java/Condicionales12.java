//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
//que se imparten en el curso. Cada pregunta acertada sumará un punto. El
//programa mostrará al final la calificación obtenida. Pásale el minicuestionario
//a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
//en las diferentes asignaturas del curso.

import java.util.Scanner;

public class Condicionales12 {
    public static void main(String[] args) {

        int suma = 0;
        int acierto = 1;

        Scanner teclado = new Scanner(System.in);


    //Primera pregunta
        System.out.println("¿Cuál de las siguientes palabras es un adverbio? \n1) Correr\n" +
                "2) Rápidamente\n" +
                "3) Zapato");
        int respuesta = teclado.nextInt();

        if (respuesta == 2){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Segunda pregunta
        System.out.println("¿Cuál es el resultado de 3 + 3? \n1) 2\n" +
                "2) 4\n" +
                "3) 6" );
        int respuesta2 = teclado.nextInt();

        if (respuesta2 == 3){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Tercera pregunta
        System.out.println("¿Qué orgánulo celular se encarga de la fotosíntesis? \n1) Mitocondria\n" +
                "2) Cloroplasto\n" +
                "3) Ribosoma" );
        int respuesta3 = teclado.nextInt();

        if (respuesta3 == 2){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Cuarta pregunta
        System.out.println("¿Qué estado de la materia no tiene forma ni volumen definidos? \n1)  Sólido\n" +
                "2) Líquido\n" +
                "3) Gas" );
        int respuesta4 = teclado.nextInt();

        if (respuesta4 == 3){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Quinta pregunta

        System.out.println("¿En qué año comenzó la Segunda Guerra Mundial? \n1)  1936\n" +
                "2) 1939\n" +
                "3) 1945" );
        int respuesta5 = teclado.nextInt();

        if (respuesta5 == 3){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Sexta pregunta

        System.out.println("¿Cuál de estos materiales es un conductor eléctrico? \n1)  Madera\n" +
                "2) Plástico\n" +
                "3) Cobre" );
        int respuesta6 = teclado.nextInt();

        if (respuesta6 == 3){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Septima pregunta
        System.out.println("¿Qué capacidad física se trabaja principalmente al correr largas distancias? \n1)  Velocidad\n" +
                "2) Resistencia\n" +
                "3) Fuerza" );
        int respuesta7 = teclado.nextInt();

        if (respuesta7 == 2){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Octava pregunta

        System.out.println("Choose the correct sentence: \n1)  She can to swim.\n" +
                "2) She cans swim.\n" +
                "3) She can swim." );
        int respuesta8 = teclado.nextInt();

        if (respuesta8 == 3){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Novena pregunta

        System.out.println("¿Qué figura musical dura la mitad que una blanca? \n1)  Redonda\n" +
                "2) Negra\n" +
                "3) Corchea" );
        int respuesta9 = teclado.nextInt();

        if (respuesta9 == 2){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }

        //Décima pregunta

        System.out.println("¿Qué valor se relaciona con decir la verdad? \n1)  Justicia\n" +
                "2) Honestidad\n" +
                "3) Tolerancia" );
        int respuesta10 = teclado.nextInt();

        if (respuesta10 == 2){
            System.out.println("Respuesta correcta.");
            suma = suma + acierto;
        }else{
            System.out.println("Respuesta incorrecta.");
        }


        System.out.println("Suma total de preguntas acertadas es: " + suma);
    }
}
