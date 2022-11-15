package patterns.exercises.task06;

public class Main {
    public static void main(String[] args) {
        PCGame pcGame = new ComputerGameAdapter(new ComputerGame(
                "Demons Souls Remake",
                PegiAgeRating.P16,
                100.0,
                4000,
                70,
                8,
                4,
                2.0)
        );

        System.out.println("Game Title -> " + pcGame.getTitle());
        System.out.println("Allowed age -> " + pcGame.getPegiAllowedAge());
        System.out.println("AAA Game? -> " + pcGame.isTripleAGame());
    }
}
