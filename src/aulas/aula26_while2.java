package aulas;

import java.util.Scanner;

public class aula26_while2 {
    public static void main(String[] args) {
        Scanner entered = new Scanner(System.in);
        String value = "";

        while(!value.equalsIgnoreCase("matheus" )) {
            System.out.println("Typing your name: ");
            value = entered.nextLine();
        }
        entered.close();
    }
}
