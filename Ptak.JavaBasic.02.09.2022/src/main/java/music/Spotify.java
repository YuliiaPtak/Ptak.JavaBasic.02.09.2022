package music;

import java.util.Arrays;

public class Spotify {

    public static void main(String[] args) {
        PopMusic ladyGaga = new PopMusic("Lady Gaga", "Poker face");
        RockMusic tool = new RockMusic("Tool", "Undertow", "Sober");
        ClassicMusic beethoven = new ClassicMusic("Beethoven", "symphony", "No. 5 \"The Symphony of Fate\"");

        for (Music music : Arrays.asList(ladyGaga, tool, beethoven)) {
            music.playMusic();
        }
    }
}
