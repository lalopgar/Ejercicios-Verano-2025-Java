//El programa elige un número secreto y el usuario tiene que adivinarlo. Se repite hasta que lo adivine.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numSecreto = 5;
        int num = 0;

        while(num != 5){
            System.out.println("Introduce número secreto: ");
            num = teclado.nextInt();

            if (num != 5){
                if (num < 5){
                    System.out.println("Inténtalo de nuevo.El número secreto es mayor que el introducido.");
                }else{
                    System.out.println("Inténtalo de nuevo.El número secreto es menor que el introducido.");
                }
            }

        }
        System.out.println("Felicidades, el número secreto es " + numSecreto);
        teclado.close();
    }
}
