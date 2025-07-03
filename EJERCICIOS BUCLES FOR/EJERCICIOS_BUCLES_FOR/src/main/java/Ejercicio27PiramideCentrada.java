//Triángulo centrado (pirámide)

public class Ejercicio27PiramideCentrada {
    public static void main(String[] args) {

        int alturaPiramide = 5; //Va a ser de 5 pisos

        for (int i=0;i<alturaPiramide;i++){ //las vueltas q dará para imprimir los espacios y asteriscos. De 0 a 4 van 5
            for (int j=0;j<alturaPiramide -i -1;j++){ //alturaPiramide-i-1 formula para calcular espacios
                System.out.println(" "); //imprimo espacios
            }
            for (int k=0;k<2*i-1;k++){ // 2 * i -1 formula de asteriscos que se imprimen por piso. 2 pq cada piso q baja se añaden 2 a cada lado de los q habia en el centro

            }
        }
    }
}
