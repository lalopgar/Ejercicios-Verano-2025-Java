//Número con ceros a la izquierda
//Enunciado:
//Dado un número entero, conviértelo a string y añade ceros a la izquierda hasta que tenga 4 dígitos.
//(Usa funciones de formato o padding)
//Ejemplo:
//Entrada: 45 → Salida: "0045"

import java.util.Scanner;

public class NumAstring2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte un número entero: ");
        int num = teclado.nextInt();

        String numFormateado = String.format("%04d", num);

        System.out.println("Entrada: " + num);
        System.out.printf("Salida: " + numFormateado);
    }
}
