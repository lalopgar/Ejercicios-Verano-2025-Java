// Ejercicio 4: Edad más 10 años (usando todos los conceptos)
//Enunciado:
//
//Pide al usuario su edad como String.
//
//Convierte a int
//
//Suma 10.
//
//Convierte el resultado a double y haz casting a int (aunque sea redundante, para practicar).
//
//Convierte a String y muestra: "Tu edad en 10 años será: <resultado>"

import java.util.Scanner;

public class Repaso3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime tu edad: ");
        String edad = teclado.nextLine();

        int edadEntero = Integer.parseInt(edad);

        int suma = edadEntero + 10;

        double sumaDouble = (double)suma;

        int sumaEntero = (int)sumaDouble;

        String sumaString = String.valueOf(sumaEntero);

        System.out.println("Tu edad en 10 años será: " + sumaString);
    }
}
