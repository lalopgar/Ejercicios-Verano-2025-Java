//Simular lanzamientos de un dado (números del 1 al 6) hasta obtener un 6.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int lanzamiento;

        do{
            System.out.println("Lanza el dado(1-6) hasta que salga un 6: ");
            lanzamiento = teclado.nextInt();

        }while(lanzamiento != 6);

        System.out.println("Enhorabuena, has sacado un 6.");
    }
}
