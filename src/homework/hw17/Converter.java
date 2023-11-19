package homework.hw17;

public abstract class Converter {
    private static final String CELSIUS_MARK = C;
    private final String temperatureMark;

    protected Converter(String temperatureMark) {
        this.temperatureMark = temperatureMark;
    }

    public final String celsiusMark() {
        return CELSIUS_MARK;
    }

    public final String temperatureMark() {
        return temperatureMark;
    }

    public abstract double toCelsius(temerature);

    public abstract double fromCelsius(temerature);
}