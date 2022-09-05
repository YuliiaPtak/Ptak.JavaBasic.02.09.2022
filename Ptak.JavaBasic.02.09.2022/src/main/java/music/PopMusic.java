package music;

public class PopMusic implements Music {
    private String performer;
    private String song;

    PopMusic(String performer, String song) {
        this.performer = performer;
        this.song = song;
    }

    @Override
    public void playMusic() {
        System.out.println("Plays: " + performer + " - " + song);
    }
}
