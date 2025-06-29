//Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
//las horas extras. Escribe un programa que calcule el salario semanal de un
//trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
//trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
//euros la hora.

import java.util.Scanner;

public class Condicionales4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas que has trabajado esta semana: ");
        double horas = teclado.nextDouble();


        double horasExtra = (horas-40)*16;

        if (horas >0 && horas <= 40){
            System.out.println("Tu salario esta semana es: " + horas * 12);
        }else if(horas >= 41){
            System.out.println("Tu salario esta semana es: " + ((40 * 12) + (horasExtra)));
        }else{
            System.out.println("Has introducido 0 o un número negativo.");
        }
    }
}
