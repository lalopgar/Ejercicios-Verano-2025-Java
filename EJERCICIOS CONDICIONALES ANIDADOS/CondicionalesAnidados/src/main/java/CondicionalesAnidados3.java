//Escribe un programa que lea tres lados de un triángulo.
// Si los tres lados son iguales, imprime "Equilátero".
// Si dos son iguales, imprime "Isósceles".
//Si todos son diferentes, imprime "Escaleno".
// Además, verifica que los lados formen un triángulo válido antes de clasificarlo.

import java.util.Scanner;

public class CondicionalesAnidados3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Introduce lado 1: ");
            double lado1 = teclado.nextDouble();

            System.out.println("Introduce lado 2: ");
            double lado2 = teclado.nextDouble();

            System.out.println("Introduce lado 3: ");
            double lado3 = teclado.nextDouble();

            // Verificación de triángulo válido
            if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

                // Clasificación del triángulo
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("Equilátero.");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("Isósceles.");
                } else {
                    System.out.println("Escaleno.");
                }

            } else {
                System.out.println("Los lados no forman un triángulo válido.");
            }
        }catch (Exception error){
            System.out.println("Introduce bien los datos que se piden por teclado.");
        }
    }
}
