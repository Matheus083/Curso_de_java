package aulas;

import javax.swing.*;

public class aula13_conversao_string_numero {

    public static void main(String[] args) {

        String value1 = JOptionPane.showInputDialog("Typing the first number.");
        String value2 = JOptionPane.showInputDialog("Typing the second number.");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        System.out.println("Sum is: " + sum);
        System.out.println("Média is: " + sum / 2);

    }
}
