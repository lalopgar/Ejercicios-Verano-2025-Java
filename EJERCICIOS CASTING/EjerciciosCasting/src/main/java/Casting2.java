//Declara una variable long con un valor grande, por ejemplo 100000L.
//Convierte esta variable a int usando casting y muestra el resultado.
//¿Qué sucede si el valor excede el rango de int?

public class Casting2 {
    public static void main(String[] args) {
        long num = 100000L;
        int numEntero = (int)num;
        int numEntero1 = (int)100000L;

        System.out.println(numEntero);
        System.out.println(numEntero1);
    }
}
