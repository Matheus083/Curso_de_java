package aulas;

import java.util.Scanner;

public class aula21_if {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);

        System.out.println("Inform the media: ");
        float media = entered.nextFloat();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aproved!");
            System.out.println("Congratulations!");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("Recuperation!");
        }

        boolean reproved = media < 4.5 && media >= 0;

        if (reproved) {
            System.out.println("Reproved");
        }
        entered.close();
    }
}
