//Escribe un programa que calcule el salario semanal de un empleado en base
//a las horas trabajadas, a razón de 12 euros la hora.

import java.util.Scanner;

public class ScannerEjercicio8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserte horas semanales trabajadas: ");
        double horasSemanales = teclado.nextDouble();

        double totalSalarioSemana = horasSemanales * 12;

        System.out.println("Esta semana has hecho " + horasSemanales + " horas.Por lo tanto tu salario esta semana es de: " + totalSalarioSemana + " €");

        teclado.close();
    }
}
