package homework.hw22;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles petShopBoys = new PopMusic();
        MusicStyles ledZeppelin = new RockMusic();
        MusicStyles sarahBrightman = new ClassicMusic();

        System.out.println("""
                \nLooking for something to listen to?
                Choose the artist and listen to your favourite music!""");
        petShopBoys.playPopMusic(petShopBoys.toString());
        ledZeppelin.playRockMusic(String.valueOf(ledZeppelin));
        sarahBrightman.playClassicMusic(sarahBrightman);
    }
}