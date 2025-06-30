//Escribe un programa que diga cuál es la primera cifra de un número entero
//introducido por teclado. Se permiten números de hasta 5 cifras.

import java.util.Scanner;

public class Condicionales18 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int num = teclado.nextInt();


        while(num >=10){ //Mientras el num que meta sea mayor o igual que 10,
            num = num/10; //lo va dividiendo entre 10. Ejemplo: si meto 3456 va haciendo 345,6; 34,56; 3,456 -> primera cifra es 3.
        }

        System.out.println("La primera cifra es: " + num);



    }
}
