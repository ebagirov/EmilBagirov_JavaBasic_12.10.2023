package homework.hw19;

public interface Smartphones {
    void call(long phoneNumber);

    void sms(long phoneNumber, String message);

    void internet(String mobileNetwork);
}