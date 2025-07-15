//Realiza el control de acceso a una caja fuerte. La combinación será un
//número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
//acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
//y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
//Tendremos cuatro oportunidades para abrir la caja fuerte.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contrasena = 1234;
        int num;
        int acumulador = 4;
        int i = 0;

        while(i < 4){
            System.out.println(System.out.println("Introduce la contraseña numérica correcta. Tienes " + acumulador + " oportunidades: ");
            num = teclado.nextInt();
            acumulador = acumulador - 1;

            if (num == 1234){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            }else{
                System.out.println("Lo siento, esa no es la combinación.");
            }
            i++;
        }
    }
}
