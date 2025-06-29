//Ejercicio 3: Conversión con todos los pasos
//Enunciado:
//
//Declara una variable double con valor 9.8.
//
//Haz casting a int.
//
//Convierte ese entero a String
//
//Luego, parsea ese String de nuevo a int
//
//Muestra el resultado final.

public class Repaso2 {
    public static void main(String[] args) {

        double num = 9.8;

        int numEntero = (int)num;

        String numString = String.valueOf(numEntero);

        int numEnteroParseo = Integer.parseInt(numString);

        System.out.println("El resultado es: " + numEnteroParseo);
    }
}
