package exercicios;

public class exe01_temperatura {

    public static void main(String[] args) {
        double temperatureFahrenheit = 55.2;
        final double indexC = (temperatureFahrenheit - 32) * 5/9.0;
        System.out.println("The Temperature in C is: " + indexC + "ºC.");
    }
}
