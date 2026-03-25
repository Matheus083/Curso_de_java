package aulas;

public class aula05_notacao_ponto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Good morning, Matheus!";

        // Caixa alta em tudo.
        s = s.toUpperCase();
        System.out.println(s);

        // Trocar letras.
        s = s.replace("M", "C");
        System.out.println(s);

        // Concatenar.
        s = s.concat("!!!");
        System.out.println(s.length());
    }
}
