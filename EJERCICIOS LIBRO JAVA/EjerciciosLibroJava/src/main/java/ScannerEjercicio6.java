//Escribe un programa que calcule el área de un triángulo.

import java.util.Scanner;

public class ScannerEjercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        double base = teclado.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = teclado.nextDouble();

        double area = (base*altura)/2;

        System.out.println("El área total del triángulo es: " + area);

        teclado.close();
    }
}
