//Pide al usuario dos números y un carácter (+, -, *, /) para indicar la operación.
//Realiza la operación correspondiente y muestra el resultado.

import java.util.Scanner;

public class CondicionalesAnidados8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Inserta un número: ");
            int num1 = teclado.nextInt();

            System.out.println("Inserta un caracter (+, -, *, /): ");
            char caracter = teclado.next().charAt(0);


            if (caracter != '+' && caracter != '-' && caracter != '*' && caracter != '/'){
                System.out.println("El caracter introducido es erroneo.");
            }else{
                System.out.println("Inserta un número: ");
                int num2 = teclado.nextInt();

                if (caracter == '+'){
                    System.out.println("La suma es: " + (num1 + num2));
                }else if (caracter == '-'){
                    System.out.println("La resta es: " + (num1 - num2));
                }else if (caracter == '*'){
                    System.out.println("La multiplicación es: " + (num1*num2));
                }else{
                    System.out.println("La división es: " + (num1/num2));
                }
            }
        }catch (Exception error){
            System.out.println("Introduce bien los datos que se piden.");
        }
    }
}
