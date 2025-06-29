//Escribe un programa que pida al usuario un nombre de usuario y una contraseña.
// Si el usuario es "admin", revisa si la contraseña es "1234".
// Si ambos son correctos, imprime "Acceso permitido".
// Si el usuario es correcto pero la contraseña incorrecta, imprime "Contraseña incorrecta".
// Si el usuario es incorrecto, imprime "Usuario no reconocido".

import java.util.Scanner;

public class CondicionalesAnidados4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe nombre de usuario: ");
        String usuario = teclado.nextLine().toLowerCase();


        if (usuario.equals("admin")){
            System.out.println("Indroduce una contraseña: ");
            int contrasena = teclado.nextInt();

            if (contrasena == 1234){
                System.out.println("Acceso permitido.");
            }else{
                System.out.println("Contraseña incorrecta.");
            }
        }else{
            System.out.println("Usuario incorrecto.");
        }
    }
}
