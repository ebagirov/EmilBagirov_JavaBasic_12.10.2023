package homework.hw19;

public class IPhones implements Smartphones, IOS {

    @Override
    public void call(long phoneNumber) {
        System.out.println("[IPHONE] Dial: " + phoneNumber);
    }

    @Override
    public void sms(long phoneNumber, String message) {
        System.out.println("[IPHONE] Send SMS to: " + phoneNumber + " Message: " + message);
    }

    @Override
    public void internet(String networkType) {
        System.out.println("[IPHONE] Network type: " + networkType);
    }

    @Override
    public void airplaneMode() {
        System.out.println("[IPHONE] Airplane mode disabled. Connection restored." );
    }

}