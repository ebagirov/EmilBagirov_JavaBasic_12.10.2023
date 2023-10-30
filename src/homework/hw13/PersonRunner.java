package homework.hw13;

public class PersonRunner {

    public static void main(String[] args) {
        createArray();

        Person first = new Person("John", "Kennedy", "Washington", "__+1(202)456-1111");
        Person second = new Person("Stephen", "King", "Portland", "__+1(573)963-22-11");
        Person third = new Person("Thomas", "Anderson", "Matrix", "__+0(101)010-1010");

        System.out.println("\n" + first.personInfo());
        System.out.println(second.personInfo());
        System.out.println(third.personInfo());
    }

    public static void createArray() {
        Person[] citizen = {
                new Person("John", "Kennedy", "Washington", "+1(202)456-1111"),
                new Person("Stephen", "King", "Portland", "+1(573)963-22-11"),
                new Person("Thomas", "Anderson", "Matrix", "+0(101)010-1010")
        };
        for (Person person : citizen) {
            person.personInfo();
        }
    }
}