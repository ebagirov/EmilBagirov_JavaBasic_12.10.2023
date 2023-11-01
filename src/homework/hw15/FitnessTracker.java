package homework.hw15;

public class FitnessTracker {
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String surname;
    private double weight;
    private String pressure;
    private int steps;
    private int age;
    private int currentYear = 2023;

    public FitnessTracker(String name, int birthDay, int birthMonth, int birthYear, String email, String phone, String surname, double weight, String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = currentYear - birthYear;
    }

    public void printAccountInfo() {
        System.out.println("Fitness tracker data - " + "\n" + "[name: " + name + "; surname: " + surname + "; birthDay: " + birthDay + "; birthMonth: " + birthMonth + "; birthYear: " + birthYear + "; age: " + age + "; email: " + email + "; phone: " + phone + "; weight: " + weight + "; pressure: " + pressure + "; steps: " + steps + "]");
    }
}