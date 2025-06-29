//Mostrar número como texto
//Enunciado:
//Declara una variable entera (por ejemplo, 123), conviértela a string y muestra el mensaje:
//"El número es: 123"

public class NumAstring {
    public static void main(String[] args) {

        int num = 123;

        String numString = String.valueOf(num);

        System.out.println("El número es: " + numString);
    }
}
