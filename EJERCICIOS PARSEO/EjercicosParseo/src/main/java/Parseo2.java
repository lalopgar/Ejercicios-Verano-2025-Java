//Multiplicar dos números decimales
//Enunciado:
//Pide al usuario dos números como strings, conviértelos a double o float y muestra el resultado de la multiplicación.

import java.util.Scanner;

public class Parseo2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un número decimal: ");
        String num1 = teclado.nextLine();

        System.out.println("Inserte un número decimal: ");
        String num2 = teclado.nextLine();

        double numDecimal1 = Double.parseDouble(num1);
        double numDecimal2 = Double.parseDouble(num2);

        System.out.println("El resultado de la multiplicación es: " + (numDecimal1*numDecimal2));

    }
}
