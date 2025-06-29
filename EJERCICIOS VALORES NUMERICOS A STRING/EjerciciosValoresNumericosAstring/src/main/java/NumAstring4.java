//Combinar número y texto en una sola línea
//Enunciado:
//Dado un número entero n, conviértelo a string y crea esta oración:
//"Faltan n días para el evento"
//donde n es el número original.
//Ejemplo:
//Si n = 10, el resultado debe ser: "Faltan 10 días para el evento"

import java.util.Scanner;

public class NumAstring4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta un número entero: ");
        int num = teclado.nextInt();

        String numString = String.valueOf(num);

        System.out.println("Faltan " + numString + " días para el evento.");
    }
}
