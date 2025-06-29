//Realiza un programa que diga si un número introducido por teclado es par y/o
//divisible entre 5.

import java.util.Scanner;

public class Condicionales14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número. ");
        int num = teclado.nextInt();

        if (num%2==0 && num%5==0){
            System.out.println("El número es par y divisible entre 5");
        }else if (num%2==0 && num%5!=0){
            System.out.println("El número es par y no divisible entre 5");
        }else if (num%2!=0 && num%5==0){
            System.out.println("El número no es par y sí es divisible entre 5");
        }else{
            System.out.println("El número no es par ni divisible entre 5");
        }
        teclado.close();
    }
}
