//Imprimir un cuadrado de asteriscos de lado n

import java.util.Scanner;

public class Ejercicio8Cuadrado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce lado n: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
