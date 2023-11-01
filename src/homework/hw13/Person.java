package homework.hw13;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "To call citizen " + name + " " + surname + " from " + city + " dial " + phone;
    }
}