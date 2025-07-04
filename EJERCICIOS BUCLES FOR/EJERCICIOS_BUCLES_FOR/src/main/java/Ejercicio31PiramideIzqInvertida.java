public class Ejercicio31PiramideIzqInvertida {
    public static void main(String[] args) {

       int altura = 5;
       for (int i = 1; i <= altura; i++){
           for (int j = 5; j >= altura-i; j--){
               System.out.print(" ");
           }
           for (int k = 5; k >= i; k--){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
