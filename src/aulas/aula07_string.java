package aulas;

public class aula07_string {
    public static void main(String[] args) {
        // Indice posição.
        String hello = "Hello, World!";
        System.out.println(hello.charAt(5));

        // Se começa e termina.
        System.out.println(hello.startsWith("Hell"));
        System.out.println(hello.endsWith("tarde"));

        // Compara.
        System.out.println(hello.equals("Hello, World!"));
        System.out.println(hello.equalsIgnoreCase("hello, world!"));

        // var.
        var name = "Matheus";
        var lastName = "Nunes";
        var age = 33;
        var wage = 123.90;

        // Será que contém?
        System.out.println(name.contains("eus"));

        // Em que posição começa?
        System.out.println(lastName.indexOf("une"));

        // Começar só a partir desse caractere.
        System.out.println(hello.substring(3, 9));
    }
}
