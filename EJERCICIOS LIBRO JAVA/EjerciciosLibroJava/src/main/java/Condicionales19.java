//Realiza un programa que nos diga cuántos dígitos tiene un número entero que
//puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

import java.util.Scanner;

public class Condicionales19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        num = Math.abs(num); //para que los números negativos los pase a positivos pq los if no cogen rangos negativos.

        if (num < 10){
            System.out.println("El número tiene 1 dígito.");
        }else if (num >=10 && num <100){
            System.out.println("El número tiene 2 dígitos");
        }else if (num >=100 && num <1000){
            System.out.println("El número tiene 3 dígitos");
        }else if (num >=1000 && num <10000){
            System.out.println("El número tiene 4 dígitos");
        }else if (num >=10000 && num <100000){
            System.out.println("El número tiene 5 dígitos");
        }else{
            System.out.println("El número tiene igual o más de 6 dígitos");
        }
    }
}
