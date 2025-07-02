//Imprimir los números del 1 al 30 pero solo los múltiplos de 3.

public class Ejercicio24 {
    public static void main(String[] args) {
        for (int i=1;i<=30;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
