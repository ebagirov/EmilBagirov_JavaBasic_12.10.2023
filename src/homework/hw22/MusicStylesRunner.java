package homework.hw22;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles petShopBoys = new PopMusic();
        MusicStyles ledZeppelin = new RockMusic();
        MusicStyles sarahBrightman = new ClassicMusic();

        System.out.println();
        petShopBoys.playMusic();
        ledZeppelin.playMusic();
        sarahBrightman.playMusic();
    }
}