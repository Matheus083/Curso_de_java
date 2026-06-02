package aulas;

import javax.swing.*;

public class aula22_if_e_else {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Inform the number:");
        int number = Integer.parseInt(value);

        if(number % 2 == 1) {
            System.out.println("Odd number.");
        }

        if(number % 2 == 0) {
            System.out.println("Pair number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
