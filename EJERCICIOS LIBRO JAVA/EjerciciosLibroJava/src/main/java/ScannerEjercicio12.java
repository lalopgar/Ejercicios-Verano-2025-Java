//Escribe un programa que calcule el precio final de un producto según su
//base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
//reducido o superreducido) y el código promocional. Los tipos de IVA general,
//reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
//promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
//respectivamente que no se aplica promoción, el precio se reduce a la mitad,
//se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
//muestran los valores correctos, aunque los números no estén tabulados.

import java.util.Scanner;

public class ScannerEjercicio12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base imponible: ");
        double baseImponible = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Introduce el tipo de IVA (general,reducido o superreducido): ");
        String tipoIva = teclado.nextLine().toLowerCase();

        System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = teclado.nextLine().toLowerCase();




    }
}
