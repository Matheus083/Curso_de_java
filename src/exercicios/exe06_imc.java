package exercicios;

import java.util.Scanner;

public class exe06_imc {
    public static void main(String[] args) {
        // Input.
        Scanner inputUser = new Scanner(System.in);

        // Variáveis.
        System.out.println("Typing your wheight: ");
        float weight = inputUser.nextFloat();
        System.out.println("Typing your height: ");
        float height = inputUser.nextFloat();
        float calc = weight / (height * height);

        // Imprimindo...
        System.out.println("IMC: " + calc);

        inputUser.close();

    }
}
