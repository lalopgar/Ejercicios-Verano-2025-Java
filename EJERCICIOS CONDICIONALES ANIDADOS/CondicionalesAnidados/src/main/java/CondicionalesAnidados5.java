//Escribe un programa que pida al usuario el precio de un producto y su categoría (A, B o C).
//
//Si es categoría A y el precio es mayor a $100, aplica un 10% de descuento.
//
//Si es categoría B y el precio es mayor a $200, aplica un 15%.
//
//Si es categoría C y el precio es mayor a $300, aplica un 20%.
//En caso contrario, no hay descuento. Muestra el precio final.

import java.util.Scanner;

public class CondicionalesAnidados5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Escribe una categoría (A, B o C): ");
            char categoria = teclado.next().charAt(0);

            if (categoria != 'A' && categoria != 'B' && categoria != 'C'){
                System.out.println(categoria + " es una categoria incorrecta.");
            }else{
                System.out.println("Escribe el precio: ");
                double precio = teclado.nextDouble();

                if (categoria == 'A'){
                    if (precio > 100){
                        System.out.println("El precio con descuento es: " + precio*1.10 + " €");
                    }else{
                        System.out.println("No hay descuento. El precio es: " + precio + " €");
                    }
                }else if (categoria == 'B'){
                    if (precio > 200){
                        System.out.println("El precio con descuento es:" + precio*1.15 + " €");
                    }else{
                        System.out.println("No hay descuento. El precio es: " + precio + " €");
                    }
                }else if (categoria == 'C'){
                    if (precio > 300){
                        System.out.println("El precio con descuento es:" + precio*1.20 + " €");
                    }else{
                        System.out.println("No hay descuento. El precio es: " + precio + " €");
                    }
                }
            }
        }catch (Exception error){
            System.out.println("Introduce bien los datos.");
        }
    }
}
