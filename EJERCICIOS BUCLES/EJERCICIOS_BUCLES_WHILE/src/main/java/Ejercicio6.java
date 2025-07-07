//Crea un menú que se repita hasta que el usuario elija salir.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = 0;

        while(num != 5){
            System.out.println("1) Hola");
            System.out.println("2) Buenos días");
            System.out.println("3) Buenas tardes");
            System.out.println("4) Buenas noches");
            System.out.println("5) Salir");
            System.out.println();
            System.out.print("Introduce un num: ");
            num = teclado.nextInt();

            switch (num){
                case 1:
                    System.out.println("HOLA");
                    System.out.println("---------");
                    break;
                case 2:
                    System.out.println("BUENOS DÍAS");
                    System.out.println("---------");
                    break;
                case 3:
                    System.out.println("BUENAS TARDES");
                    System.out.println("---------");
                    break;
                case 4:
                    System.out.println("BUENAS NOCHES");
                    System.out.println("---------");
                    break;
                case 5:
                    System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("NÚMERO NO VALIDO. INSERTA NUM DE NUEVO: ");
                    System.out.println("---------");
            }
        }
        teclado.close();
    }
}
