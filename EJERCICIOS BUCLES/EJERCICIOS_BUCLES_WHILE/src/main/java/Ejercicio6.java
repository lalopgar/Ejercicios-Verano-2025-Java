//Crea un menú que se repita hasta que el usuario elija salir.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 0;

        while(num != 5){
            System.out.println("1) Hola");
            System.out.println("2) Buenos días");
            System.out.println("3) Buenas tardes");
            System.out.println("4) Buenas noches");
            System.out.println("5) Salir");
            System.out.println();
            System.out.print("Introduce un num: ");
            num = teclado.nextInt();

        }
    }
}
