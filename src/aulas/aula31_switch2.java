package aulas;

import java.util.Scanner;

public class aula31_switch2 {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);

        String concept = "";
        System.out.println("Info your grade:  ");
        int grade = entered.nextInt();

        switch (grade) {
            case 10: case 9:
                concept = "A";
                break;
            case 8: case 7:
                concept = "B";
                break;
            case 6: case 5:
                concept = "C";
                break;
            case 4: case 3:
                concept = "D";
                break;
            case 2: case 1:
                concept = "E";
                break;
            case 0:
                concept = "F";
                break;
            default:
                concept = "Not info or value error.";
        }
        System.out.println("You assessment is: " + concept);
    }
}
