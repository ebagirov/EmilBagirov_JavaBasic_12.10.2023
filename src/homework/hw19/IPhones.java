package homework.hw19;

public class IPhones implements Smartphones, IOS {

    @Override
    public void airplaneMode() {
        System.out.println("You are using mobile data.");
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Send SMS to: " + phoneNumber + "\n Message: " + message);
    }

    @Override
    public void sms(long phoneNumber, String message) {
        System.out.println("Run Safari app.");
    }

    @Override
    public void internet(String mobileNetwork) {
        System.out.println("Airplane mode disabled. \n Connection restored.");
    }
}