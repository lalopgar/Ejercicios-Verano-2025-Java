//Ejercicio 5: Mezcla total – número a texto, texto a número, y redondeo
//Enunciado:
//
//Declara una variable int con valor 150.
//
//Convierte a String
//
//Añade un decimal como texto: ".75" → queda "150.75"
//
//Convierte ese String a double
//
//Haz casting de ese double a int (pierde los decimales).
//
//Muestra el resultado entero final.

public class Repaso4 {
    public static void main(String[] args) {

        int num = 150;

        String numString = String.valueOf(num);

        String texto = numString + ".75";

        double textoDouble = Double.parseDouble(texto);

        int textoEntero = (int) textoDouble;

        System.out.println("Resultado: " + textoEntero);
    }
}
