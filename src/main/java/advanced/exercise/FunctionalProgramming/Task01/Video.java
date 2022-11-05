package advanced.exercise.FunctionalProgramming.Task01;

public class Video {
    public final String title;
    public final String url;
    public final VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }
}
