//Amplía el programa anterior para que diga la nota del boletín (insuficiente,
//suficiente, bien, notable o sobresaliente).

import java.util.Scanner;

public class Condicionales8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        double num1 = teclado.nextDouble();

        System.out.println("Introduce una nota: ");
        double num2 = teclado.nextDouble();

        System.out.println("Introduce una nota: ");
        double num3 = teclado.nextDouble();

        double media = (num1+num2+num3)/3;

        System.out.println("La media de las tres notas es: " + media);

        if (media >= 0 && media < 5){
            System.out.println("Insuficiente");
        }else if (media >= 5 && media <=5.99){
            System.out.println("Suficiente");
        }else if (media >= 6 && media <= 6.99){
            System.out.println("Bien");
        }else if (media >= 7 && media <= 8.99){
            System.out.println("Notable");
        }else if (media >=9 && media <=10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Error nota, inténtalo de nuevo.");
        }

    }
}
