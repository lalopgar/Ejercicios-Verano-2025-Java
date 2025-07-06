//Triángulo de números del 1 al 5

public class Ejercicio35TrianguloNumeros1a5 {
    public static void main(String[] args) {

        int altura = 5;
        for (int i = 1; i <= altura; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
