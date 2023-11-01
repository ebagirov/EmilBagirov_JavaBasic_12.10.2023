package homework.hw13;

public class PersonRunner {

    public static void main(String[] args) {
        setPerson();
    }

    private static void setPerson() {
        Person first = new Person("John", "Kennedy", "Washington", "+1(202)456-1111");
        Person second = new Person("Stephen", "King", "Portland", "+1(573)963-22-11");
        Person third = new Person("Thomas", "Anderson", "Matrix", "+0(101)010-1010");

        System.out.println("\n" + first.personInfo());
        System.out.println(second.personInfo());
        System.out.println(third.personInfo());
    }
}