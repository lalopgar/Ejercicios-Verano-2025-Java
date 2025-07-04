import java.util.Scanner;

public class Ejercicio38CuadradoConHuecos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número de lados: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++){ //filas
            for (int j = 1; j <= n; j++){ //columnas

                if (i==1 || i==n || j==1 || j==n){ //i=1 primera fila, i=n última fila, j=1 primera columna, j=n ultima columna
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
