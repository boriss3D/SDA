package patterns.behavioral.template_method;

public class IceHockey extends Game{
    @Override
    void initialize() {
        System.out.println( "initialize Hockey Game");
    }

    @Override
    void startPlay() {
        System.out.println( "start Hockey Game");
    }

    @Override
    void endPlay() {
        System.out.println( "end Hockey Game");
    }
}
