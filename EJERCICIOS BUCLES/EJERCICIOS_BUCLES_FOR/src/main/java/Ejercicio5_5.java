////Contar cuántos múltiplos de 3 hay entre 1 y 100. Sólo el número que hay de múltiplos.

public class Ejercicio5_5 {
    public static void main(String[] args) {

        int acumulador = 0;
        for (int i=1;i<=100;i++){
            if (i%3==0){
                acumulador++;
            }
        }
        System.out.println(acumulador);
    }
}
