//Declara una variable double con valor 9.99.
//Convierte esta variable a int usando casting y muestra el resultado.
//Observa qué pasa con los decimales.

public class Casting {
    public static void main(String[] args) {
        double precio = 9.99;

        //Puedo hacerlo de dos maneras
        int entero = (int)precio; //Casting explícito
        int entero1= (int)9.99;

        System.out.println(entero);
        System.out.println(entero1);
    }
}








