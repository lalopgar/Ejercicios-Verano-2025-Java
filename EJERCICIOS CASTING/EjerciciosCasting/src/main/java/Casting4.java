//Declara una variable float con valor 3.14f.
//Convierte esta variable a long usando casting y muestra el resultado.

public class Casting4 {
    public static void main(String[] args) {
        float num = 3.14f;

        long numLong = (long) num;
        long numLong1 = (long) 3.14f;

        System.out.println(numLong);
        System.out.println(numLong1);

    }
}
