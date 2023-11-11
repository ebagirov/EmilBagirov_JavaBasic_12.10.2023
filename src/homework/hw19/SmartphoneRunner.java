package homework.hw19;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphones[] smartphones = {
                new Androids(),
                new Androids(),
                new IPhones(),
                new IPhones(),
        };
        long[] phoneNumber = {
                380502582500L,
                3806625825001L,
                380952582502L,
                380992582503L,
        };
        String mobileNetwork = "5G";

        for (int i = 0; i < smartphones.length; i++) {
            for (int j = 0; j < phoneNumber.length; j++) {
                smartphones[i].call(phoneNumber[j]);
                smartphones[i].sms(phoneNumber[j], "Call me back please.");
                smartphones[i].internet(mobileNetwork);
                System.out.println();
            }
        }
    }
}