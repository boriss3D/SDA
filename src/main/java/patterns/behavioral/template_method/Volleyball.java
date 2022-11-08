package patterns.behavioral.template_method;

public class Volleyball extends Game {

    @Override
    void initialize() {
        System.out.println("Volleyball: initialize method");
    }

    @Override
    void startPlay(){
        System.out.println("Volleyball: start method");
    }

    @Override
    void endPlay() {
        System.out.println("Volleyball: end method");
    }
}
