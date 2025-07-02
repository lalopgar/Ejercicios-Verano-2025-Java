//Mostrar la suma de los números pares del 1 al 100.

public class Ejercicio13 {
    public static void main(String[] args) {

        int acumulador = 0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                acumulador = acumulador + i;
            }

        }
    }
}
