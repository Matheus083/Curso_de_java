package aulas;

import java.util.Scanner;

public class aula27_do_while {
    public static void main(String[] args) {
            Scanner entered = new Scanner(System.in);

            String value = "";

            do {
                System.out.println("TYPING...");
                value = entered.nextLine();
            } while(!value.equalsIgnoreCase("exit"));

            entered.close();
    }
}
