//Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
//convertir debe ser introducida por teclado.

import java.util.Scanner;

public class ScannerEjercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte cantidad en Pesetas: ");
        double pesetas = teclado.nextDouble();

        double euros = pesetas/166.386;

        System.out.println(pesetas + " Pesetas son " + euros + " Euros.");

        teclado.close();
    }
}
