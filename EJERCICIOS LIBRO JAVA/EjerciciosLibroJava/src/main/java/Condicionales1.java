//Escribe un programa que pida por teclado un día de la semana y que diga qué
//asignatura toca a primera hora ese día.

import java.util.Scanner;

public class Condicionales1 {
    public static void main(String[] args) {

        String asignatura = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un día de la semana: ");
        String dia = teclado.nextLine();

        switch (dia.toLowerCase()){
            case "lunes":
                asignatura = "matemáticas";
                break;
            case "martes":
                asignatura = "química";
                break;
            case "miercoles":
                asignatura = "inglés";
                break;
            case "jueves":
                asignatura = "francés";
                break;
            case "viernes":
                asignatura = "física";
                break;
            default:
                System.out.println("Es finde");
        }

        if (asignatura.isEmpty()){
            System.out.println("No hay asignatura");
        }else{
            System.out.println("A primera hora toca: " + asignatura);
        }
    }
}
