//Escribe un programa que diga cuál es la última cifra de un número entero
//introducido por teclado.

import java.util.Scanner;

public class Condicionales17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = teclado.nextInt();

        int ultcifra = num % 10;

        System.out.println("La última cifra del número es: " + ultcifra);

    }
}
