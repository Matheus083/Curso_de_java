package exercicios;

public class exe04_operadores_logicos {
    public static void main(String[] args) {

        boolean workThursday = !true;
        boolean workTueday = true;
        boolean shoppingCenter = workThursday;
        boolean buyTv50 = workThursday && workTueday && shoppingCenter;
        boolean buyTv32 = workThursday || workTueday;
        boolean drinkGlass = workThursday && workTueday && buyTv50;


        System.out.println("Work Thursday? " + workThursday);
        System.out.println("Work Tuesday? " + workTueday);
        System.out.println("To going to shopping center? " + shoppingCenter);
        System.out.println("Buy TV 32' ? " + buyTv32);
        System.out.println("Buy TV 50' ? " + buyTv50);
        System.out.println("Drink glass? " + drinkGlass);

    }
}
