//Realiza un programa que pida dos números y que luego muestre el resultado
//de su multiplicación.

import java.util.Scanner;

public class ScannerEjercicio1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce un número: ");
        double num2 = teclado.nextDouble();

        double multiplicacion = num1 * num2;

        System.out.println("Resultado de la multiplicación: " + multiplicacion);

        teclado.close();
    }
}
