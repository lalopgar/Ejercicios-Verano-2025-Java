//Pide al usuario su edad y muestra una categoría:
//
//Menor de edad (0-17)
//
//Adulto (18-64)
//
//Adulto mayor (65 o más)

import java.util.Scanner;

public class CondicionalesAnidados9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime una edad: ");
        int edad = teclado.nextInt();

        if (edad < 0){
            System.out.println("Error porque no puedes ser menor de 0 años");
        }else if (edad >= 0 && edad <=17){
            System.out.println("Menor de edad.");
        }else if (edad >=18 && edad <=64){
            System.out.println("Adulto.");
        }else{
            System.out.println("Adulto mayor.");
        }
    }
}
