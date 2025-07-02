//Imprimir los primeros 10 números de la serie Fibonacci

public class Ejercicio14 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        for (int i=1;i<=10;i++){
            System.out.println(a);
            int nextNumber = a+b;
            a=b;
            b=nextNumber;
        }
    }
}
