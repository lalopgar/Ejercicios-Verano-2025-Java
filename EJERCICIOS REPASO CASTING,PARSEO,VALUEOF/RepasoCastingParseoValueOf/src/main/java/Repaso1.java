//Ejercicio 2: División de dos String, casting del resultado
//Enunciado:
//
//Pide dos valores decimales como String.
//
//Convierte a double
//
//Divide el primero por el segundo.
//
//Haz un casting a int para truncar el resultado.
//
//Convierte ese resultado entero a String
//
//Muestra el resultado truncado.

import java.util.Scanner;

public class Repaso1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un número decimal: ");
        String num1 = teclado.nextLine();
        System.out.println("Inserte un número decimal: ");
        String num2 = teclado.nextLine();

        double numDouble1 = Double.parseDouble(num1);
        double numDouble2 = Double.parseDouble(num2);

        double division = numDouble1/numDouble2;

        int divisionEntero = (int)division;

        String divisionString = String.valueOf(divisionEntero);

        System.out.println("El resultado es: " + divisionString);
    }
}
