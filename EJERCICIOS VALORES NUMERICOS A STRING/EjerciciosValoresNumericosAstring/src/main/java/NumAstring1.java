//Concatenar un número con un mensaje
//Enunciado:
//Pide al usuario su edad (como número entero), conviértela a string y muestra el mensaje:
//"Tienes X años"
//donde X es la edad ingresada.

import java.util.Scanner;

public class NumAstring1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta tu edad: ");
        int edad = teclado.nextInt();

        String edadString = String.valueOf(edad);

        System.out.println("Tienes " + edadString + " años.");

    }
}
