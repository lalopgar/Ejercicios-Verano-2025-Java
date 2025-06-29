//Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
//convertir deberá estar almacenada en una variable.

import java.util.Scanner;

public class ConversorPesetasEuros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cantidad en pesetas: ");
        double pesetas = teclado.nextDouble();

        double euros = pesetas / 166.386;

        System.out.println(pesetas + " Pesetas son " + euros + " Euros.");

        teclado.close();
    }
}
