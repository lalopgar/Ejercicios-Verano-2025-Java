//Imprime los números del 1 al 100 que sean divisibles por 10.

public class Ejercicio20 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%10==0){
                System.out.println(i);
            }
        }
    }
}
