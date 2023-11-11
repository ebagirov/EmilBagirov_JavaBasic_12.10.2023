package homework.hw14;

public class Burgers {
    private final String name;
    private final String bun;
    private final String meat;
    private final String greens;
    private final String cheese;
    private String mayonnaise;
    private String extraMeat;

    public Burgers(String bun, String meat, String greens, String cheese, String mayonnaise) {
        this.name = "Classic Burger";
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    public Burgers(String bun, String meat, String greens, String cheese) {
        this.name = "Diet Burger";
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        printIngredients();
    }

    public Burgers(String bun, String meat, String greens, String cheese, String mayonnaise, String extraMeat) {
        this.name = "Double Burger";
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.extraMeat = extraMeat;
        printIngredients();
    }

    public void printIngredients() {
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