package exercicios;

import java.util.Scanner;


public class exe09_equacoes_2grau {
    public static void main(String[] args) {
        // Input User.
        Scanner inputUser = new Scanner(System.in);

        // Variáveis Delta:
        System.out.println("Typing the (a): ");
        int a = inputUser.nextInt();
        System.out.println("Typing the (b): ");
        int b = inputUser.nextInt();
        System.out.println("Typing the (c): ");
        int c = inputUser.nextInt();
        double delta = (Math.pow(b, 2)) - (4 * a * c);

        // Variáveis Bhaskara:
        double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
        double x2 = (-b - (Math.sqrt(delta))) / (2 * a);

        // Imprimindo...
        System.out.println("Delta: " + delta);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

    }
}
