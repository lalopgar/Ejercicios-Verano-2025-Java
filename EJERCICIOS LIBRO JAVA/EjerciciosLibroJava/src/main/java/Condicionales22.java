//Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
//hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
//Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
//por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
//a las 15:00h.

import java.util.Scanner;

public class Condicionales22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un día de la semana de lunes a viernes: ");
        String dia = teclado.next();

        System.out.println("Escribe la hora: ");
        int hora = teclado.nextInt();

        System.out.println("Escribe los minutos. ");
        int minuto = teclado.nextInt();


    }
}
