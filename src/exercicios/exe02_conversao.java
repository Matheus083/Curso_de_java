package exercicios;

import java.util.Scanner;

public class exe02_conversao {
    public static void main(String[] args) {

        Scanner wage = new Scanner(System.in);
        System.out.println("Typing the last three wages: ");

        String wage1 = wage.next();
        String wage2 = wage.next();
        String wage3 = wage.next();

        float w1 = Float.parseFloat(wage1.replace(",", "."));
        float w2 = Float.parseFloat(wage2.replace(",", "."));
        float w3 = Float.parseFloat(wage3.replace(",", "."));

        final float average = (w1 + w2 + w3) / 3f;

        System.out.printf("The Average of the wages is: %.2f%n", average);

        wage.close();

    }
}
