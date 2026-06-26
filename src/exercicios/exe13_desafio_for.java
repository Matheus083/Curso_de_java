package exercicios;

public class exe13_desafio_for {
    public static void main(String[] args) {
        for(String value = "#"; !value.equals("######"); value += "#") {
            System.out.println(value);
        }
    }
}
