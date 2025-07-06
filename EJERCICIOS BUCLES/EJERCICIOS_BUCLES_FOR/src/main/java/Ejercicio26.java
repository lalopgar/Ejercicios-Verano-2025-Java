//Pedir al usuario un número e imprimir su tabla de multiplicar.

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
