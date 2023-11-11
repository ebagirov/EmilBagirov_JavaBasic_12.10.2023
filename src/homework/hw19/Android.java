package homework.hw19;

public class Android implements Smartphones, LinuxOS {
    @Override
    public void call(long phoneNumber) {
        System.out.println("Dial - " + phoneNumber);
    }

    @Override
    public void sms(long phoneNumber, String message) {
        System.out.println("Send SMS to: " + phoneNumber + "\n Message: " + message);
    }

    @Override
    public void internet(String mobileNetwork) {
        System.out.println("Run Chrome app.");
    }

    @Override
    public void mobileData() {
        System.out.println("You are using mobile data.");
    }
}