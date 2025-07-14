//Mostrar un menú de opciones hasta que el usuario elija salir.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int select;

        do{
            System.out.println("Elige una opción: ");
            System.out.println("1) Cambiar Euros a Kips: ");
            System.out.println("2) Cambiar Kips a Euros: ");
            System.out.println("3) Salir: ");

            select = teclado.nextInt();
        }while(select != 3);

        System.out.println("Has elegido salir del programa.");

    }
}
