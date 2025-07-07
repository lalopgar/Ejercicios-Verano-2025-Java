//Pide al usuario que introduzca números enteros (uno por uno).
// El programa debe contar cuántos son positivos, cuántos negativos y cuántos ceros.
// El bucle termina cuando el usuario introduce un número fuera del rango -100 a 100.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre -100 y 100. ");
        System.out.println("Introduce un número fuera de ese rango para salir.");
        int num = teclado.nextInt();



    }
}
