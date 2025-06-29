//Realiza un conversor de Mb a Kb

import java.util.Scanner;

public class ScannerEjercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte mb: ");
        int mb = teclado.nextInt();

        int kb = mb * 1024;

        System.out.println("Resultado kb: " + kb);

        teclado.close();
    }
}
