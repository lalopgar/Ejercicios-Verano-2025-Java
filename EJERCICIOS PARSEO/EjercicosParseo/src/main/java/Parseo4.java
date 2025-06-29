//Edad más 5 años
//Enunciado:
//Pide al usuario su edad en formato string y muestra cuántos años tendrá dentro de 5 años.

import java.util.Scanner;

public class Parseo4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        String edad = teclado.nextLine();

        int edadEntero = Integer.parseInt(edad);

        int edadEnCincoAnios = edadEntero + 5;

        System.out.println("Tu edad dentro de 5 años será: " + edadEnCincoAnios);
    }
}
