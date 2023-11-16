package homework.hw22;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {
                new PopMusic(),
                new RockMusic(),
                new ClassicMusic(),
        };

        String popMusic = "Pet Shop Boys";
        String rockMusic = "Led Zeppelin";
        String classicMusic = "Sarah Brightman";

        System.out.println("""
                \nLooking for something to listen to?
                Choose the artist and listen to your favourite music!""");
        
//        petShopBoys.playPopMusic(petShopBoys.toString());
//        ledZeppelin.playRockMusic(String.valueOf(ledZeppelin));
//        sarahBrightman.playClassicMusic(sarahBrightman);

        for (MusicStyles name : musicStyles) {
                System.out.println(name);
        }
    }
}