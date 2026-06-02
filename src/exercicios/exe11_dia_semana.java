package exercicios;

import java.util.Scanner;

public class exe11_dia_semana {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);

        System.out.println("Typing a number between 1 to 7:");

        int day = entered.nextInt();

        if (day == 1) {
            System.out.println("Today is Sunday.");
        } else if (day == 2) {
            System.out.println("Today is Monday.");
        } else if (day == 3) {
            System.out.println("Today is Tuesday.");
        } else if (day == 4) {
            System.out.println("Today is Wednesday.");
        } else if (day == 5) {
            System.out.println("Today is Thursday.");
        } else if (day == 6 ) {
            System.out.println("Today is Friday.");
        } else if (day == 7) {
            System.out.println("Today is Saturday.");
        } else {
            System.out.println("ERROR! Typing a number between 1 to 7.");
        }
    }
}
