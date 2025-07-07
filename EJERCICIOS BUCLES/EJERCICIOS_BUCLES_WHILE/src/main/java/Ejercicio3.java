//Pide al usuario un número N y calcula la suma de los números del 1 al N

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        int i = 0;
        int acumulador = 0;

        while(i <= num){
            acumulador = acumulador + i;
            i++;
        }
        System.out.println("La suma de 1 hasta " + num + " es igual a: " + acumulador);
    }
}
