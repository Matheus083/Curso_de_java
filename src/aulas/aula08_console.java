package aulas;

import java.util.Scanner;

public class aula08_console {
    public static void main(String[] args) {

        Scanner entered = new Scanner(System.in);
        System.out.println("Typing something: ");
        String name = entered.nextLine();
        System.out.println("\n\nName = " + name);


        System.out.println("Typing your age: ");
        int age = entered.nextInt();
        System.out.println("Your age is: " + age);

        entered.close();
    }
}
