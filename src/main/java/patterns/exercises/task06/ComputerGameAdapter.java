package patterns.exercises.task06;

public class ComputerGameAdapter implements PCGame{

    private final ComputerGame computerGame;

    public ComputerGameAdapter(final ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        return Integer.parseInt(computerGame
                .getPegiAgeRating()
                .name()
                .substring(1));
    }

    @Override
    public boolean isTripleAGame() {
        return Double.compare(computerGame.getBudgetInMillionsOfDollars(), 50.0) > 0;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(
                computerGame.getMinimumGpuMemoryInMegabytes() / 1000,
                computerGame.getDiskSpaceNeededInGB(),
                computerGame.getRamNeededInGb(),
                computerGame.getCoreSpeedInGhz(),
                computerGame.getCoresNeeded());
    }
}
