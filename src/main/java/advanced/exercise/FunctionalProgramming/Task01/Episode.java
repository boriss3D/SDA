package advanced.exercise.FunctionalProgramming.Task01;

import java.util.List;

public class Episode {
    public final String episodeName;
    public final int episodeNumber;
    final List<Video> videos;

    public Episode(String episodeName, int episodeNumber,
                   List<Video> videos) {
        this.episodeName = episodeName;
        this.episodeNumber = episodeNumber;
        this.videos = videos;
    }
}
