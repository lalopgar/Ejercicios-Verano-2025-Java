//El usuario introduce números enteros hasta que introduce -1.
//Al finalizar, el programa muestra la media de todos los números introducidos(sin contar el -1).

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);

        int num;
        int acumulador = 0;
        int contador = 0;

        System.out.println("Introduce un número.Pulsa -1 para salir del programa."); //Para que entre o no al bucle
        num = teclado.nextInt();

        while(num != -1){
            acumulador = acumulador + num;
            contador++;

            System.out.println("Introduce un número.Pulsa -1 para salir del programa."); //Para que se repita la pregunta
            num = teclado.nextInt();
        }
        if (contador > 0){
            double media = acumulador/contador;
            System.out.println("La media es: " + media);
        }else{
            System.out.println("Fin del programa.");
        }
        teclado.close();
    }
}
