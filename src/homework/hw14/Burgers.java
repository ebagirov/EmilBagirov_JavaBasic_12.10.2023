package homework.hw14;

import static homework.hw14.BurgerMain.printIngredients;

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
}