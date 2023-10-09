package homework.hw7;

public class SuttleNumber {
    public static void main(String[] shuttleNumber) {
        shuttleNumber = new String[100];
        int i = 0;
        int count = 0;
        while (i < shuttleNumber.length) {
            ++count;
            String s = String.valueOf(count);
            if ((s.contains("4") || s.contains("9"))) {
                continue;
            }
            System.out.println("Shuttle_" + (i + 1) + ": #" + count);
            i++;
        }
    }
}



//public class SuttleNumber {
//    public static void main(String[] args) {
//        String[] shuttleNumber = new String[100];
//        generateNumber(shuttleNumber);
//        printNumber(shuttleNumber);
//    }

//    public static void generateNumber(String[] spaceArgs) {
//        int i = 0;
//        int count = 1;
//        while (i < spaceArgs.length) {
//            String countString = String.valueOf(count);
//            if (!countString.contains("4") && !countString.contains("9")) {
//                spaceArgs[i] = countString;
//                i++;
//            }
//            count++;
//        }
//    }
//
//    public static void printNumber(String[] spaceArgs) {
//        for (int i = 0; i < spaceArgs.length; i++) {
//            System.out.println("Shuttle_" + (i + 1) + ": #" + spaceArgs[i]);
//        }
//    }
//}