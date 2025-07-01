//Contar cuántos múltiplos de 3 hay entre 1 y 100

public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i=1;i<100;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
