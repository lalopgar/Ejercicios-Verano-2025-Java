public class Eercicio30PiramideDer {
    public static void main(String[] args) {

        int altura = 5;
        for (int i = 1; i <=altura; i++){  //número de vueltas (filas)
            for (int j = 1; j <= altura - i; j++){  //número de espacios antes de *
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){  //número de * por cada fila después de los espacios " "
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
