package homework.hw22;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles petShopBoys = new PopMusic();
        MusicStyles ledZeppelin = new RockMusic();
        MusicStyles sarahBrightman = new ClassicMusic();

        MusicStyles[] artists = {petShopBoys, ledZeppelin, sarahBrightman};

        System.out.println("""
                \nLooking for something to listen to?
                Choose the artist and listen to your favourite music!""");

        for (MusicStyles name : artists) {
            name.playMusic();
        }
    }
}