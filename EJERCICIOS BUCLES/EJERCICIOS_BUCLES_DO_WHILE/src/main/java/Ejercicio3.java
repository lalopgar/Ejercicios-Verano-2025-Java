//Pedir al usuario que ingrese una contraseña hasta que escriba la correcta

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String contrasena = "lara1234";

        do{
            System.out.println("Escribe la contraseña: ");
            contrasena = teclado.next();

        }while(!contrasena.equals("lara1234"));

        System.out.println("Acceso aceptado");

    }
}
