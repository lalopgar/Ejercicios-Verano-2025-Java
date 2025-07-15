//Muestra la tabla de multiplicar de un número introducido por teclado.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}
