//Escribe un programa que pinte una pirámide rellena con un carácter introducido
//por teclado que podrá ser una letra, un número o un símbolo como *, +,
//-, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
//el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
//izquierda o hacia la derecha.

import java.util.Scanner;

public class BuclesTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un caracter: ");
        char simbolo = teclado.next().charAt(0);

        //Escribe altura de la pirámide

        System.out.println("Escribe la altura que quieres que tenga la pirámide: ");
        int altura = teclado.nextInt();

        for (int fila = 1; fila <= altura; fila++){

            int numAsteriscosApintar = (fila*2)-1;
            int espacios = altura - fila; // la cantidad de espacios que tienes que escribir en cada fila coincide con las filas que quedan hasta llegar a la base

            for (int espacio = 1; espacio <= espacios; espacio++){
                System.out.print(" ");
            }

            for (int columna = 1; columna <= numAsteriscosApintar; columna++){
                System.out.print(simbolo);

            }

            System.out.println();
        }
    }
}
