//Escribe un programa que nos diga el horóscopo a partir del día y el mes de
//nacimiento.

import java.util.Scanner;

public class Condicionales10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce mes: ");
        String mes = teclado.nextLine().toLowerCase();

        System.out.println("Introduce dia: ");
        int dia = teclado.nextInt();

        if (mes.equals("enero")){

            if (dia >= 1 && dia <=19){
                System.out.println("Capricornio");
            }else if (dia >=20 && dia <=31){
                System.out.println("Acuario");
            }else{
                System.out.println("Enero solo tiene 31 días");
            }

        }else if (mes.equals("febrero")){

            if (dia >=1 && dia <=18){
                System.out.println("Acuario");
            }else if (dia >= 19 && dia <=28){
                System.out.println("Piscis");
            }else{
                System.out.println("Febrero solo tiene 28 días");
            }

        }else if (mes.equals("marzo")){

            if (dia >=1 && dia <=20){
                System.out.println("Piscis");
            }else if (dia >= 21 && dia <=31){
                System.out.println("Aries");
            }else{
                System.out.println("Marzo solo tiene 31 días");
            }


        }else if (mes.equals("abril")){

            if (dia >=1 && dia <=19){
                System.out.println("Aries");
            }else if (dia >= 20 && dia <=30){
                System.out.println("Tauro");
            }else{
                System.out.println("abril solo tiene 30 días");
            }

        }else if (mes.equals("mayo")){

            if (dia >=1 && dia <=20){
                System.out.println("Tauro");
            }else if (dia >= 21 && dia <=31){
                System.out.println("Géminis");
            }else{
                System.out.println("Mayo solo tiene 31 días");
            }

        }else if (mes.equals("junio")){

            if (dia >=1 && dia <=20){
                System.out.println("Géminis");
            }else if (dia >= 21 && dia <=30){
                System.out.println("Cáncer");
            }else{
                System.out.println("Junio solo tiene 30 días");
            }

        }else if (mes.equals("julio")){

            if (dia >=1 && dia <=21){
                System.out.println("Cáncer");
            }else if (dia >= 22 && dia <=31){
                System.out.println("Leo");
            }else{
                System.out.println("Julio solo tiene 31 días");
            }

        }else if (mes.equals("agosto")){

            if (dia >=1 && dia <=21){
                System.out.println("Leo");
            }else if (dia >= 22 && dia <=31){
                System.out.println("Virgo");
            }else{
                System.out.println("Agosto solo tiene 31 días");
            }

        }else if (mes.equals("septiembre")){

            if (dia >=1 && dia <=21){
                System.out.println("Virgo");
            }else if (dia >= 22 && dia <=30){
                System.out.println("Libra");
            }else{
                System.out.println("Septiembre solo tiene 30 días");
            }

        }else if (mes.equals("octubre")){

            if (dia >=1 && dia <=21){
                System.out.println("Libra");
            }else if (dia >= 22 && dia <=31){
                System.out.println("Escorpio");
            }else{
                System.out.println("Octubre solo tiene 31 días");
            }

        }else if (mes.equals("noviembre")){

            if (dia >=1 && dia <=20){
                System.out.println("Escorpio");
            }else if (dia >= 21 && dia <=30){
                System.out.println("Sagitario");
            }else{
                System.out.println("Noviembre solo tiene 30 días");
            }

        }else if (mes.equals("diciembre")){

            if (dia >=1 && dia <=20){
                System.out.println("Sagitario");
            }else if (dia >= 21 && dia <=31){
                System.out.println("Capricornio");
            }else{
                System.out.println("Diciembre solo tiene 31 días");
            }

        }else{
            System.out.println("Error, introduce mes correctamente.");
        }

       }
}
