//Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
//convertir deberá estar almacenada en una variable.

import java.util.Scanner;

public class ConversorEurosPesetas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce cantidad en euros: ");
        double euros = teclado.nextDouble();

        double pesetas = euros * 166.386;

        System.out.println(euros + " Euros son " + pesetas + " pesetas.");

        teclado.close();

    }
}
