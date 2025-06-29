//Convertir entero a string y mostrar su longitud
//Enunciado:
//Dado un número entero, conviértelo a string y muestra cuántos caracteres tiene.
//Ejemplo:
//Entrada: 2025 → Salida: "Longitud: 4"

import java.util.Scanner;

public class NumAstring3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int num = teclado.nextInt();

        String numString = String.valueOf(num);

        System.out.println("Entrada: " + num);
        System.out.println("Salida: Longitud: " + numString.length());
    }
}
