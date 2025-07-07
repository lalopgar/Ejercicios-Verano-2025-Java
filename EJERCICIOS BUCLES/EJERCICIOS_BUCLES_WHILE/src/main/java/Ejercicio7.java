//Pide al usuario que introduzca números enteros (uno por uno).
// El programa debe contar cuántos son positivos, cuántos negativos y cuántos ceros.
// El bucle termina cuando el usuario introduce un número fuera del rango -100 a 100.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entre -100 y 100. ");
        System.out.println("Introduce un número fuera de ese rango para salir.");
        int num = teclado.nextInt();

        int positivo = 0; //va a contar cuántos números positivos (mayores que 0) se introducen
        int negativo = 0; //va a contar cuántos números negativos (menores que 0) se introducen
        int cero = 0; //va a contar cuántas veces se introduce 0

        while(num > -100 && num < 100){

            if (num > 0){
                positivo++; // esto es como si fuera positivo = positivo + 1;
            }else if (num < 0){
                negativo++;
            }else{
                cero++;
            }
            System.out.println("Introduce un número entre -100 y 100. "); //Lo vuelvo a preguntar para que no se quede en bucle
            System.out.println("Introduce un número fuera de ese rango para salir.");
            num = teclado.nextInt();
        }
        System.out.println("Hay " + positivo + " números positivos.");
        System.out.println("Hay " + negativo + " números negativos.");
        System.out.println("Hay " + cero + " números cero.");

        teclado.close();
    }
}
