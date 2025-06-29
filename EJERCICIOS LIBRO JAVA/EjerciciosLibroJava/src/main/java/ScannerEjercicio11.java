//Realiza un conversor de Kb a Mb.

import java.util.Scanner;

public class ScannerEjercicio11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte kb: ");
        double kb = teclado.nextDouble();

        double mb = kb / 1024.0;

        System.out.printf("Resultado mb: %.5f%n",mb);

        teclado.close();
    }
}
