package aulas;

public class aula35_continue2 {
    public static void main(String[] args) {
        outside: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 1) {
                    continue outside;
                }
                System.out.printf("[%d %d]\n", i, j);
            }
            System.out.println();
        }
        System.out.println("The end!");
    }
}

