public class Ejercicio34PiramideCentradaInvertidaRepaso {
    public static void main(String[] args) {

        int altura = 5;
        for (int i = 0; i <= altura; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (altura - i) -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
