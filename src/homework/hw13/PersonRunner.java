package homework.hw13;

public class PersonRunner {
    public static void main(String[] args) {
        createArray();

        Person first = new Person("John", "Kennedy", "New York", "+1(202)456-1111");
        Person second = new Person("Stephen", "King", "Portland", "+1(573)963-22-11");
        Person third = new Person("Thomas", "Anderson", "Matrix", "+01(010)101-0101");

        System.out.println("\n" + first.personInfo());
        System.out.println(second.personInfo());
        System.out.println(third.personInfo());
    }

    public static void createArray() {
        Person[] citizen = {
                new Person("Will", "Smith", "New York", "2936729462846"),
                new Person("Jackie", "Chan", "Shanghai", "12312412412"),
                new Person("Sherlock", "Holmes", "London", "37742123513")
        };
        for (Person person : citizen) {
            person.personInfo();
        }
    }
}