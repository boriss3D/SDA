package patterns.structural.adapter;

public class VLC implements AdvanceMediaPlayer{
    @Override
    public void play() {
        System.out.println("VLC Player is playing");
    }
}
