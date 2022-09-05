package music;

public class RockMusic implements Music {
    private String band;
    private String album;
    private String song;

    RockMusic(String band, String album, String song) {
        this.band = band;
        this.album = album;
        this.song = song;
    }

    @Override
    public void playMusic() {
        System.out.println("Plays: " + band + " - " + song + ", album - " + album);
    }
}
