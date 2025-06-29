//Escribe un programa que pida al usuario su edad y su nacionalidad. Si tiene 18 años o más y su nacionalidad
// es "mexicana", imprime "Puedes votar en México". Si no, indica por qué no puede votar.

import java.util.Scanner;

public class CondicionalesAnidados1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        try{
            System.out.println("Dime tu edad: ");
            int edad = teclado.nextInt();

            teclado.nextLine();

            if (edad >= 18){
                System.out.println("Dime tu nacionalidad: ");
                String nacionalidad = teclado.nextLine().toLowerCase();

                if (nacionalidad.equals("mexicana")){
                    System.out.println("Puedes votar en México.");
                }else if (!nacionalidad.equals("mexicana")){
                    System.out.println("No puedes votar en México, no tienes nacionalidad mexicana.");
                }
            }else{
                System.out.println("No puedes votar porque eres menor de edad.");
            }
        }catch (Exception error){
            System.out.println("Inserta bien los datos que se pides");
        }
    }
}
