package homework.hw14;

public class Burgers {
    private String name;
    private String bun;
    private String meat;
    private String greens;
    private String cheese;
    private String mayonnaise;
    private String extraMeat;

    public Burgers (String bun, String meat, String greens, String cheese, String mayonnaise) {
        this.name = "Classic Burger";
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        printIngredients();
    }

    public Burgers (String bun, String meat, String greens, String cheese) {
        this.name = "Diet Burger";
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.cheese = cheese;
        printIngredients();
    }

    public Burgers (String bun, String meat, String greens, String cheese, String mayonnaise, String extraMeat) {
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
        System.out.println(bun);
        System.out.println(meat);
        System.out.println(greens);
        System.out.println(cheese);
        if (mayonnaise != null) {
            System.out.println(mayonnaise);
        }
        if (extraMeat != null) {
            System.out.println(extraMeat);
        }
    }
}