package homework.hw19;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void call(long phoneNumber) {
        System.out.println("[ANDROID] Dial: " + phoneNumber);
    }

    @Override
    public void sms(long phoneNumber, String message) {
        System.out.println("[ANDROID] Send SMS to: " + phoneNumber + " Message: " + message);
    }

    @Override
    public void internet(String networkType) {
        System.out.println("[ANDROID] Network type: " + networkType);
    }

    @Override
    public void mobileData() {
        System.out.println("[ANDROID] You're using mobile data");
    }

}