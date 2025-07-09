//El programa pide una contraseña al usuario.Tiene hasta 3 intentos para adivinarla.
//Si la acierta, muestra un mensaje de éxito.Si falla las tres veces, muestra un mensaje de acceso denegado.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String password;
        String realPassword = "java1234";
        int contador = 0;

        while(contador < 3){
            System.out.println("Escribe una contraseña: ");
            password = teclado.nextLine();
            contador++;

            if (password.equalsIgnoreCase("java1234")){
                System.out.println("Éxito.");
                break;  //para que salir del programa si acierta la contraseña
            }else{
                System.out.println("Denegado.");
            }
        }
        teclado.close();
    }
}
