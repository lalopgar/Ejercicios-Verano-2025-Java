//Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
//convertir debe ser introducida por teclado.

import java.util.Scanner;

public class ScannerEjercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte cantidad en euros: ");
        double euros = teclado.nextDouble();

        double pesetas = euros * 166.386;

        System.out.println(euros + " Euros son " + pesetas + " Pesetas.");

        teclado.close();
    }
}
