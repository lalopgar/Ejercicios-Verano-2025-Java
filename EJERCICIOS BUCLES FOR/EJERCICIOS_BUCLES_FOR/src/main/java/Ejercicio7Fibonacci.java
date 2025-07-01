//Mostrar los primeros 10 números de Fibonacci

public class Ejercicio7Fibonacci {
    public static void main(String[] args) {

        int a = 0; //primer nº de la secuencia
        int b = 1; //segundo nº de la secuencia

        for (int i=1;i<=10;i++){

            System.out.println(a); //imprime 0 en la primera iteracion, 1 en la segunda y asi
            int siguienteNumero = a+b; //0+1=1  siguienteNumero vale 1 ahora
            a=b; //ahora a=1 pq arriba la variable b=1
            b=siguienteNumero; //b=1 pq siguienteNumero=1
        }
    }
}
