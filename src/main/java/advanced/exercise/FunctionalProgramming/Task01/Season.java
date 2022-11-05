package advanced.exercise.FunctionalProgramming.Task01;

import java.util.List;

public class Season {
    public final String seasonName;
    public final int seasonNumber;
    final List<Episode> episodes;
    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}
