//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.

import java.util.Scanner;

public class ScannerEjercicio4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insert number: ");
        double num1 = teclado.nextDouble();

        System.out.println("Insert number: ");
        double num2 = teclado.nextDouble();

        System.out.println("The result of the sum is: " + (num1+num2));
        System.out.println("The result of the substraction is: " + (num1-num2));
        System.out.println("The result of the multiplication is: " + (num1*num2));
        System.out.println("The result of the division is: " + (num1/num2));

        teclado.close();
    }
}
