package patterns.structural.adapter;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.print("Audio Player is playing");
    }
}
