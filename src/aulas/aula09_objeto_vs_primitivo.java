package aulas;

public class aula09_objeto_vs_primitivo {
    public static void main(String[] args){

        String text = "matheus";
        String newText = text.toUpperCase();
        System.out.println(newText);

        // Wrappers são a versão objeto dos tipos primitivos!
        int a = 123;
        System.out.println(a);
    }
}

