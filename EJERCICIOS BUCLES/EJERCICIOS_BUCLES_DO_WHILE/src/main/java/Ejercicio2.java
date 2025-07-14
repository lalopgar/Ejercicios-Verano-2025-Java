//Pedir al usuario que ingrese números y sumarlos. El programa se detiene cuando el usuario ingresa 0.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int acumulador = 0;
        int num;

        do{
            System.out.println("Introduce un número. Pulsa 0 para salir del programa.");
            num = teclado.nextInt();
            acumulador = acumulador + num;
        }while(num != 0);

        System.out.println("La suma de los números introducidos es: " + acumulador);
    }
}
