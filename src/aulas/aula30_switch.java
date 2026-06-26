package aulas;

public class aula30_switch {
    public static void main(String[] args) {
        String strip = "black";

        switch (strip.toLowerCase()) {
            case "black":
                System.out.println("I know the Bassai-Dai...");
            case "brown":
                System.out.println("I know the Tekki Shodan.");
            case "purple":
                System.out.println("I Know the Heian Godan.");
            case "green":
                System.out.println("I know the Heian Yodan.");
            case "orange":
                System.out.println("I know the Heian Sandan.");
            case "red":
                System.out.println("I know the Heian Nidan.");
            case "yellow":
                System.out.println("I know the Heian Shodan");
            default:
                System.out.println("I don't know anything. ");
        }
    }
}
