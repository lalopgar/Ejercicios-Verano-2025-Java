//Sumar dos números enteros desde texto
//Enunciado:
//Pide al usuario dos números como texto y muestra la suma. JOPTIONPANE


import javax.swing.*;

public class Parseo1 {
    public static void main(String[] args) {

        String pregunta1 = JOptionPane.showInputDialog("Inserte un número: ");
        int num1 = Integer.parseInt(pregunta1);

        String pregunta2 = JOptionPane.showInputDialog("Inserte otro número: ");
        int num2 = Integer.parseInt(pregunta2);

        JOptionPane.showMessageDialog(null,"La suma de los números es: " + (num1+num2));
    }
}
