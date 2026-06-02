package aulas;

import java.util.Scanner;

public class aula23_if_elseif {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);

        System.out.println("Typing the grade: ");

        float grade = entered.nextFloat();

        if(grade > 10 || grade < 0) {
            System.out.println("Grade invalid");
        } else if (grade >= 8.1) {
            System.out.println("Concept A");
        } else if (grade >= 6.1) {
            System.out.println("Concept C");
        } else if (grade >= 4.1) {
            System.out.println("Concept D");
        } else {
            System.out.println("Concept E");
        }
        entered.close();
    }
}
