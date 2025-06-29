//Escribe un programa que dada una hora determinada (horas y minutos),
//calcule los segundos que faltan para llegar a la medianoche

import java.util.Scanner;

public class Condicionales11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte hora: ");
        int hora = teclado.nextInt();

        System.out.println("Inserte minutos: ");
        int minutos = teclado.nextInt();

        if (hora >= 1 && hora <= 23 && minutos == 0){

            int segundos = ((23 - hora)*60) * 60;

            System.out.println("Quedan " + segundos + " segundos.");
        }else{
            int horas = hora + 1;
            int min = 60 - minutos;
            int minutosTotales = min + (horas * 60);
            int segundosTotales = minutosTotales*60;

            System.out.println("Quedan " + segundosTotales + " segundos.");
        }
    }
}
