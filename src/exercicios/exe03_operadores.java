package exercicios;

public class exe03_operadores {
    public static void main(String[] args) {

        final double pieceUpLeft = Math.pow(6 * (3+2), 2);
        final double pieceDownLeft = 3 * 2;

        final double pieceUpRight = Math.pow(((1 - 5) * (2 - 7) / 2), 2);

        final double pieceDivisor = Math.pow(10, 3);

        final double calcOne = pieceUpLeft / pieceDownLeft;
        final double calcTwo = calcOne - pieceUpRight;
        final double calcThree = Math.pow(calcTwo, 3);

        final double calcFinal = calcThree / pieceDivisor;

        System.out.println(calcFinal);
    }
}
