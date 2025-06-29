//Pide al usuario una contraseña.
// Si la contraseña ingresada coincide con "Java123", muestra “Acceso permitido”.
//Si no coincide, muestra “Contraseña incorrecta”.

import java.util.Scanner;

public class CondicionalesAnidados7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una contraseña: ");
        String contrasena = teclado.nextLine();

        if (contrasena.equalsIgnoreCase("Java123")){
            System.out.println("Acceso premitido.");
        }else{
            System.out.println("Contraseña incorrecta.");
        }
    }
}
