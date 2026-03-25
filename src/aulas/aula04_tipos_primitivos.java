package aulas;

public class aula04_tipos_primitivos {

    public static void main(String[] args) {
        // Infomações de um funcionário.

        // Tipos númericos inteiros.
        byte companyYears = 23;
        short numbersPlanes = 601;
        int id = 54893;
        long pointsPackage = 4_222_976_223L;

        // Tipos numéricos reais.
        float wage = 11_900.45F;
        double acumullatedSales = 21_999_327_109.99;

        // Tipo booleano.
        boolean vacationsOn = false;

        // Tipo caractere.
        char status = 'A';

        // Dias na empresa.
        System.out.println(companyYears * 365);

        // Numeros de viagens.
        System.out.println(numbersPlanes / 2);

        // Pontos por real.
        System.out.println(pointsPackage / acumullatedSales);
        System.out.println(id + ": winner ->" + wage);
        System.out.println("Vacations? " + vacationsOn);
        System.out.println("Status: " + status);
    }
}
