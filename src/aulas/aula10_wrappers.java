package aulas;

import java.util.Scanner;

public class aula10_wrappers {
    public static void main(String[] args) {

        Scanner entered = new Scanner(System.in);

        // Byte
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt(entered.next()); // int
        Long l = 100000l;

        System.out.println("Byte: " + b.byteValue());
        System.out.println("Short: " + s.toString());
        System.out.println("Integer: " + i);

        entered.close();

        Float f = 123.0F;
        System.out.println("Float: " + f);

        Double d = 2209812.33;
        System.out.println("Double: " + d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println("Boolean: " + bo);

        Character c = '#';
        System.out.println("Char: " + c + "...");

    }
}
