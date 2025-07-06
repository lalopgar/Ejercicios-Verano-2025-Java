//Piramide Centrada Invertida

public class Ejercicio28PiramideCentradaInvertida {
    public static void main(String[] args) {

        int alturaPiramide = 5;

        for (int i = 0; i < alturaPiramide; i++){
            for (int j = 0; j < i; j++){  //espacios que aumenta de 1 en 1 conforme baja 0,1,2,3,4
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (alturaPiramide-i) -1; k++){ //Asteriscos formula para decrecerlos 2 * (alturaPiramide-i) -1  (9,7,5,3,1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
