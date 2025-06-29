//Escribe un programa que calcule el total de una factura a partir de la base
//imponible.

import java.util.Scanner;

public class ScannerEjercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte base imponible: ");
        double baseImponible = teclado.nextDouble();

        double totalIva = baseImponible * 0.21;

        double totalConIva = baseImponible + totalIva;

        System.out.println("La factura total con IVA es: " + totalConIva);

        teclado.close();
    }
}
