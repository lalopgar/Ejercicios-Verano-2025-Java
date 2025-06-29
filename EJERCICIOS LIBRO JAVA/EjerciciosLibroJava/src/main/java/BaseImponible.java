//Escribe un programa que calcule el total de una factura a partir de la base
//imponible (precio sin IVA). La base imponible estará almacenada en una
//variable.

import java.util.Scanner;

public class BaseImponible {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base imponible: ");
        double baseImponible = teclado.nextDouble();

        double totalIva = baseImponible * 0.21;

        double totalConIva  = baseImponible + totalIva;

        System.out.println("Total factura: " + totalConIva + " €");

        teclado.close();
    }
}
