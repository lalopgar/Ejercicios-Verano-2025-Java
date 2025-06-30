//Realiza un programa que diga si un número entero positivo introducido por
//teclado es capicúa. Se permiten números de hasta 5 cifras.

import java.util.Scanner;

public class Condicionales20Capicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();

        while(num > 0 && num < 99999){
            int ultcifra = num%10;
            int pcifra = num = num/10;
        }
    }
}
