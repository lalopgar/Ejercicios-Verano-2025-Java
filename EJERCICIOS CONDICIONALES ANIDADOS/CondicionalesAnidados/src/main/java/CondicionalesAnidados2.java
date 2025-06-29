import java.util.Scanner;

//Escribe un programa que lea una nota numérica del 0 al 100 y determine si es aprobatoria. Si la nota es mayor o igual
// a 60, indica "Aprobado". Si es mayor o igual a 90 además de eso, indica "Con honores". Si es menor a 60, indica "Reprobado".
public class CondicionalesAnidados2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Escribe una nota del 0 al 100: ");
            int nota = teclado.nextInt();

            if (nota >= 60 && nota <=89) {
                System.out.println("Aprobado.");
            }else if (nota >= 90 && nota <=100){
                    System.out.println("Aprobado con honores.");
            }else if (nota > 100){
                System.out.println("Solo se evalúa hasta 100.");
            }else{
                System.out.println("Reprobado.");
            }
        }catch (Exception error){
            System.out.println("Inserte bien los datos que se piden.");
        }
    }
}
