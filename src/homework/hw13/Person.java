package homework.hw13;

public class Person {
    private final String name;
    private final String surname;
    private final String city;
    private final String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String printResult() {
        return "To call citizen " + name + " " + surname + " from " + city + " dial " + phone;
    }
}