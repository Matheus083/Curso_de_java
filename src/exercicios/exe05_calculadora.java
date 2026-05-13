package exercicios;

import java.util.Scanner;

public class exe05_calculadora {
    public static void main(String[] args) {
        // Entrada.
        Scanner input = new Scanner(System.in);
        // Número 1.
        System.out.println("Typing the number one: ");
        float valorOne =  input.nextFloat();
        // Número 2.
        System.out.println("Typing number two: ");
        float valorTwo =  input.nextFloat();
        // Operador.
        System.out.println("Typing the operator(+, -, *, /, %): " );
        String operator =  input.next();
        // Lógica.
        double result = "+".equals(operator) ? valorOne + valorTwo : 0;
        result = "-".equals(operator) ? valorOne - valorTwo : result;
        result = "*".equals(operator) ? valorOne * valorTwo : result;
        result = "/".equals(operator) ? valorOne / valorTwo : result;
        result = "%".equals(operator) ? valorOne % valorTwo : result;
        // Resultado.
        System.out.printf("%.2f %s %.2f = %.2f", valorOne, operator, valorTwo, result);

        input.close();

    }
}