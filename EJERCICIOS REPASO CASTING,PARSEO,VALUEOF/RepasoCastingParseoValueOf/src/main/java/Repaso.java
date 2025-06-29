//Ejercicio 1: Suma de dos números como texto y conversión a string
//Enunciado:

//Pide dos números como String.

//Conviértelos a int.

//Súmalos.

//Convierte el resultado a String.

//Muestra el mensaje: "La suma es: <resultado>"

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte número: ");
        String num1 = teclado.nextLine();

        System.out.println("Inserte número: ");
        String num2 = teclado.nextLine();

        int numEntero1 = Integer.parseInt(num1);
        int numEntero2 = Integer.parseInt(num2);

        int suma = numEntero1 + numEntero2;

        String sumaString = String.valueOf(suma);

        System.out.println("La suma es: " + sumaString);
    }
}
