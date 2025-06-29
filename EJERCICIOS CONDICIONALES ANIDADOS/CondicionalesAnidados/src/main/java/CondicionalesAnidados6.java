//Pide al usuario dos números enteros y muestra cuál es mayor, cuál es menor o si son iguales.

import java.util.Scanner;

public class CondicionalesAnidados6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num1 = teclado.nextInt();

        System.out.println("Escribe un número: ");
        int num2 = teclado.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else if (num1 < num2){
            System.out.println(num1 + " es menor que " + num2);
        }else{
            System.out.println(num1 + " es igual a " + num2);
        }
    }
}
