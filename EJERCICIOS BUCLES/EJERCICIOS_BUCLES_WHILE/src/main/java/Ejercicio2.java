//Leer números del usuario y sumarlos hasta que introduzca 0

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 1;
        int acumulador = 0;

        while(num != 0){
            System.out.println("Introduce un número: ");
            num = teclado.nextInt();
            acumulador = acumulador + num;
        }
        System.out.println("Suma: " + acumulador);
    }
}
