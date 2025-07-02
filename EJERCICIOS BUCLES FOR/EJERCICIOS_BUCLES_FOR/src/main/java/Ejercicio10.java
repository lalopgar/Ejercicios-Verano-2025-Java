//Triángulo invertido

public class Ejercicio10 {
    public static void main(String[] args) {
        for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){ //cuidado con poner j-- que se queda en bucle pillado
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
