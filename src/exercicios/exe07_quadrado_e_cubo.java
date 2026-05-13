package exercicios;

import java.util.Scanner;

public class exe07_quadrado_e_cubo {
    public static void main(String[] args) {
        // Input.
        Scanner inputUser = new Scanner(System.in);

        // Variáveis.
        System.out.println("Typing the value: ");
        float value = inputUser.nextFloat();
        double calcDouble = Math.pow(value, 2);
        double calcTriple = Math.pow(value, 3);

        // Imprimindo...
        System.out.println("The value double: " + calcDouble);
        System.out.println("The triple value: " + calcTriple);


    }
}
