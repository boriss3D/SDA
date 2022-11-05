package patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        System.out.println();

        MediaPlayerAdapter mediaPlayer = new MediaPlayerAdapter(new AudioPlayer());
        mediaPlayer.play();
    }
}
