package music;

public class ClassicMusic implements Music{
    private String composer;
    private String genre;
    private String composition;

    ClassicMusic(String composer, String genre, String composition) {
        this.composer = composer;
        this.genre = genre;
        this.composition = composition;
    }

    @Override
    public void playMusic() {
        System.out.println("Plays: " + genre + " " + composition + " by " + composer);
    }
}
