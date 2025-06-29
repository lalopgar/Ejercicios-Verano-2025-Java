//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
//nombre del día de la semana.

import java.util.Scanner;

public class Condicionales3 {
    public static void main(String[] args) {

        String dia ="";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 7: ");
        int numero = teclado.nextInt();

        switch(numero){
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miércoles";
                break;
            case 4:
                dia = "jueves";
                break;
            case 5:
                dia = "viernes";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("Has escrito mal el número, inténtalo de nuevo");
        }
        if (dia.isEmpty() ){
            System.out.println("No hay día");
        }else{
            System.out.println("El día de la semana es: " + dia);
        }

    }
}
