//División segura (evitar división por cero)
//Enunciado:
//Pide al usuario dos números como strings: un dividendo y un divisor.
// Convierte a float o int y realiza la división, mostrando un mensaje si el divisor es cero.

import java.util.Scanner;

public class Parseo5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte número que no sea 0: ");
        String num1 = teclado.nextLine();

        System.out.println("Inserte número que no sea 0: ");
        String num2 = teclado.nextLine();

        float numFloat1 = Float.parseFloat(num1);
        float numFloat2 = Float.parseFloat(num2);

        float division = numFloat1/numFloat2;

        System.out.println("El resultado de la división es: " + division);
    }
}
