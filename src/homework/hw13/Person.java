package homework.hw13;

public class Person {
    public String name;
    public String surname;
    public String city;
    public String phone;

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