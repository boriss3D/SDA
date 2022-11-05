package patterns.structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void play() {
        System.out.println("Mp4Player Player is playing");
    }
}
