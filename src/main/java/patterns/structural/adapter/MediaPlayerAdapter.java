package patterns.structural.adapter;

public class MediaPlayerAdapter implements AdvanceMediaPlayer{
    private final MediaPlayer mediaPlayer;

    public MediaPlayerAdapter(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        mediaPlayer.play();
        System.out.println(" in Advanced mode");
    }
}
