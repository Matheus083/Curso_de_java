package exercicios;

import java.util.Scanner;

public class exe08_area_triangulo {
    public static void main(String[] args) {
        // Input.
        Scanner inputUser = new Scanner(System.in);

        // Variáveis.
        System.out.println("Typing the base: ");
        float base = inputUser.nextFloat();
        System.out.println("Typing the heigth: ");
        float heigth = inputUser.nextFloat();
        float size = (base * heigth) / 2;

        // Imprimindo...
        System.out.println("The value size is: " + size);
    }
}
