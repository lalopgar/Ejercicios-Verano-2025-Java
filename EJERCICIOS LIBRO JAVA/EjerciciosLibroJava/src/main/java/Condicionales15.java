//Escribe un programa que pinte una pirámide rellena con un carácter introducido
//por teclado que podrá ser una letra, un número o un símbolo como *, +,
//-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
//el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
//izquierda o hacia la derecha.

import java.util.Scanner;

public class Condicionales15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir símbolo
        System.out.println("Introduce un símbolo: ");
        char simbolo = teclado.next().charAt(0);

        // Menú
        System.out.println("Elige la dirección del vértice. 1. Hacia arriba, 2. Hacia abajo, 3. Hacia la izquierda, 4. Hacia la derecha: ");
        int vertice = teclado.nextInt();

        System.out.println(); // Espacio antes del dibujo

        switch (vertice) {
            case 1: // Vértice hacia arriba
                System.out.println("  " + simbolo);
                System.out.println(" " + simbolo + simbolo + simbolo);
                System.out.println("" + simbolo + simbolo + simbolo + simbolo + simbolo);
                break;

            case 2: // Vértice hacia abajo
                System.out.println("" + simbolo + simbolo + simbolo + simbolo + simbolo);
                System.out.println(" " + simbolo + simbolo + simbolo);
                System.out.println("  " + simbolo);
                break;

            case 3: // Vértice hacia la izquierda
                System.out.println("    " + simbolo);
                System.out.println("  " + simbolo + simbolo);
                System.out.println("" + simbolo + simbolo + simbolo);
                System.out.println("  " + simbolo + simbolo);
                System.out.println("    " + simbolo);
                break;

            case 4: // Vértice hacia la derecha
                System.out.println(simbolo + "");
                System.out.println(simbolo + "" + simbolo + "");
                System.out.println(simbolo + "" + simbolo + "" + simbolo);
                System.out.println(simbolo + "" + simbolo + "");
                System.out.println(simbolo + "");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        teclado.close();
    }
}