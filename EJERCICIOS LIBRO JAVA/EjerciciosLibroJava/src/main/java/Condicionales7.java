//Realiza un programa que calcule la media de tres notas.

import java.util.Scanner;

public class Condicionales7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce una nota: ");
        double num2 = teclado.nextDouble();

        System.out.println("Introduce una nota: ");
        double num3 = teclado.nextDouble();

        double media = (num1+num2+num3)/3;

        System.out.println("La media de las tres notas es: " + media);
    }
}
