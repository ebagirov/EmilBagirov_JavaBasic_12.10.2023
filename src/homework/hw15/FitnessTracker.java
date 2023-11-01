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
    public int currentYear = 2023;

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

    private String getName() {
        return name;
    }
    private int  getBirthDay() {
        return birthDay;
    }
    private int  getBirthMonth() {
        return birthMonth;
    }
    private int  getBirthYear() {
        return birthYear;
    }
    private String  getEmail() {
        return email;
    }
    private String  getPhone() {
        return phone;
    }
    private String  getSurname() {
        return surname;
    }
    public double  getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String  getPressure() {
        return pressure;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public int  getSteps() {
        return steps;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public int  getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Fitness tracker data: " + "\n" + "[name: " + name + "; surname: " + surname + "; birthDay: " + birthDay + "; birthMonth: " + birthMonth + "; birthYear: " + birthYear + "; age: " + age + "; email: " + email + "; phone: " + phone + "; weight: " + weight + "; pressure: " + pressure + "; steps: " + steps + "]");
    }
}