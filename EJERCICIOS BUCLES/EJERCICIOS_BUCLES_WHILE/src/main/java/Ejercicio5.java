//Pide un número positivo y muestra la cuenta regresiva hasta 0.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número positivo: ");
        int num = teclado.nextInt();

        while(num > 0){
            System.out.println(num);
            num--;
        }
        teclado.close();
    }
}
