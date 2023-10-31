package homework.hw14;

public class BurgerMain {
    public static void main(String[] args) {
        Burgers classicBurger = new Burgers("bun", "beef", "parsley", "brie", "provencal");
        Burgers dietBurger = new Burgers("bun", "veal", "parsley", "provolone");
        Burgers doubleBurger = new Burgers("bun", "veal", "parsley", "gouda", "provencal", "veal");
        printIngredients();
    }

    public static void printIngredients() {
        System.out.println("\n" + "\t" + name + ":");
        System.out.println("Bun - " + bun);
        System.out.println("Meat - " + meat);
        System.out.println("Greens - " + greens);
        System.out.println("Cheese - " + cheese);
        if (mayonnaise != null) {
            System.out.println("Mayonnaise - " + mayonnaise);
        }
        if (extraMeat != null) {
            System.out.println("Extra meet - " + extraMeat);
        }
    }
}