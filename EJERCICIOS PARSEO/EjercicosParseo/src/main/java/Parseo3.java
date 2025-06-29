//Convertir temperatura
//Enunciado:
//Pide una temperatura en Celsius como string, conviértela a float y calcula su equivalente en Fahrenheit usando la fórmula:
//F = C × 9/5 + 32

import java.util.Scanner;

public class Parseo3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte temperatura en Celsius: ");
        String celsius1 = teclado.nextLine();

        System.out.println("Inserte temperatura en Celsius: ");
        String celsius2 = teclado.nextLine();

        float celsiusFloat1 = Float.parseFloat(celsius1);
        float celsiusFloat2 = Float.parseFloat(celsius2);

        float fahrenheit1 = (celsiusFloat1 * 9/5) + 32;
        float fahrenheit2 = (celsiusFloat2 * 9/5) + 32;

        System.out.println("La primera temperatura en Fahrenheit es: " + fahrenheit1);
        System.out.println("La segunda temperatura en Fahrenheit es: " + fahrenheit2);
    }
}
