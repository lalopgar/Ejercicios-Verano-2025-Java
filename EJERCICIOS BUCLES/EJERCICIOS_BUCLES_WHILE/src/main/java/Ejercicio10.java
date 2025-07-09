//El usuario introduce números hasta que pone 0.
//El programa debe decir cuál fue el número mayor introducido(sin contar el 0).

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número. Pulsa 0 si quieres salir del programa.");
        int num = teclado.nextInt();

        int mayor = Integer.MIN_VALUE; //valor más bajo posible en Java,para asegurarse de que cualquier número introducido será mayor que ese

        while(num != 0){

            if (num > mayor){  // si num es mayor que mayor
                mayor = num; // entonces mayor se actualiza con ese nuevo valor
            }
            System.out.println("Introduce un número. Pulsa 0 si quieres salir del programa.");
            num = teclado.nextInt();
        }
        if (mayor == Integer.MIN_VALUE) { // si usuario introduce 0 al principio, el valor de mayor seguirá siendo Integer.MIN_VALUE
            System.out.println("No se introdujeron números.");
        } else {
            System.out.println("El número mayor introducido fue: " + mayor); // si introduce números imprime el mayor
        }
        teclado.close();
    }
}
