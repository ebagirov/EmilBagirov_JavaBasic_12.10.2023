package homework.hw19;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void mobileData() {
        System.out.println("You are using mobile data.");
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Send SMS to: " + phoneNumber + "\n Message: " + message);
    }

    @Override
    public void sms(long phoneNumber, String message) {
        System.out.println("Run Chrome app.");
    }

    @Override
    public void internet(String mobileNetwork) {
        System.out.println("You're using mobile data.");
    }
}