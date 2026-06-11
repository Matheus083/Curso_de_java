package exercicios;

import java.util.Scanner;

public class exe12_desafio_while {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);

        float sumAverage = 0f;
        int totalGrades = 0;
        String text = "";

        do {
            System.out.println("Typing the grade(0 to 10): ");
            float gradeNow = entered.nextFloat();

            if(gradeNow >= 0 && gradeNow <= 10) {
                sumAverage += gradeNow;
                totalGrades++;
            } else {
                System.out.println("Invalid grade! It must be between 0 and 10.");
            }

            System.out.println("Do you want to exit? (yes/no) ");
            text = entered.next();

        } while(!text.equalsIgnoreCase("yes"));

        if (totalGrades > 0) {
            float finalAverage = sumAverage / totalGrades;
            System.out.println("\n--- Result ---");
            System.out.println("Total grades entered: " + totalGrades);
            System.out.println("Final average: " + finalAverage);
        } else {
            System.out.println("No valid grades were entered.");
        }
    }
}
