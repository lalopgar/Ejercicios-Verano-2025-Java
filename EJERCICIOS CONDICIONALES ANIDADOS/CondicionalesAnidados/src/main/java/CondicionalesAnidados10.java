//Pide una letra al usuario. Indica si es una vocal o una consonante.
//Si no es una letra (por ejemplo, un número o símbolo), muestra un mensaje de error.

import java.util.Scanner;

public class CondicionalesAnidados10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta una letra: ");
        char letra = teclado.next().toLowerCase().charAt(0);

        if (!Character.isLetter(letra)){  //verifica si es una letra del alfabeto. Si no letra del afabeto print Error.
            System.out.println("Error: No has ingresado una letra.");
        }else{
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
                System.out.println("Vocal");
            }else{
                System.out.println("Consonante");
            }
        }
    }
}
