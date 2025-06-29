//Declara una variable int y una variable double.
//Suma ambas variables y asigna el resultado a una variable int usando casting.
//Imprime el resultado final

public class Casting3 {
    public static void main(String[] args) {
        int num = 5;
        double decimal = 9.99;

        double suma= num + decimal;
        System.out.println(suma);

        int sumaEntera = (int) suma;
        System.out.println(sumaEntera);
    }
}
