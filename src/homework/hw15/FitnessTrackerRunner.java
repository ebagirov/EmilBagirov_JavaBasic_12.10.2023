package homework.hw15;

class FitnessTrackerRunner {
    public static void main(String[] args) {

        FitnessTracker third = new FitnessTracker("Bruce", 27, 11, 1940, "lee@gmail.com", "+1(111)963-22-11", "Lee", 60,"120/80", 30000);
        FitnessTracker first = new FitnessTracker("Arnold", 30, 7, 1947, "schwarz@gmail.com", "+1(222)963-22-22", "Schwarzenegger", 120,"100/60", 10000);
        FitnessTracker second = new FitnessTracker("Jean-Claude", 18, 10, 1960, "vandamme@gmail.com", "+1(333)963-22-33", "Van Damme", 80,"110/70", 20000);

        System.out.println("\n" + "\t" + "Account info" + "\t");
        first.printAccountInfo();
        second.printAccountInfo();
        third.printAccountInfo();
    }
}