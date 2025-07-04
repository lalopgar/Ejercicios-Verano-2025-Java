public class Ejercicio36TrianguloNumeros1a5Invertido {
    public static void main(String[] args) {

        int altura = 5;

        for (int i = 1; i <= altura; i++){
            for (int j = 5; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
