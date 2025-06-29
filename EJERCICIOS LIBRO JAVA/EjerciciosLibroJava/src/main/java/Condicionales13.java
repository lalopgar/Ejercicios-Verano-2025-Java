import java.util.Scanner;

//Escribe un programa que ordene tres números enteros introducidos por
//teclado.
public class Condicionales13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int num1 = teclado.nextInt();

        System.out.println("Introduce un número: ");
        int num2 = teclado.nextInt();

        System.out.println("Introduce un número: ");
        int num3 = teclado.nextInt();

        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + " ," + num2 + " ," + num3);
        }else if (num1 > num3 && num3 > num2){
            System.out.println(num1 + " ," + num3 + " ," + num2);
        }else if (num2 > num1 && num1 > num3){
            System.out.println(num2 + " ," + num1 + " ," + num3);
        }else if (num2 > num3 && num3 > num1){
            System.out.println(num2 + " ," + num3 + " ," + num1);
        }else if (num3 > num1 && num1 > num2){
            System.out.println(num3 + " ," + num1 + " ," + num2);
        }else if (num3 > num2 && num2 > num1){
            System.out.println(num3 + " ," + num2 + " ," + num1);
        }else{
            System.out.println("Son iguales");
        }
    }
}
