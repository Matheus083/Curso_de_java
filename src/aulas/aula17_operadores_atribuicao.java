package aulas;

public class aula17_operadores_atribuicao {
    public static void main(String[] args)  {
        int a = 3;
        int b = a;
        int c = a + b;

        c += b;

        System.out.println(c);
    }
}
