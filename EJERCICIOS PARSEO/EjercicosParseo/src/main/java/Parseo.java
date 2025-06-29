//Sumar dos números enteros desde texto
//Enunciado:
//Pide al usuario dos números como texto y muestra la suma. SCANNER

import java.util.Scanner;

public class Parseo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un número: ");
        String num = teclado.nextLine();

        System.out.println("Inserte otro número: ");
        String num2 = teclado.nextLine();

        int numEntero = Integer.parseInt(num);
        int numEntero2 = Integer.parseInt(num2);

        System.out.println("La suma de los números es: " + (numEntero + numEntero2));
    }
}
