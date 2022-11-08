package patterns.behavioral.state;

public class TvSwitchState implements State {

    @Override
    public int doAction() {
        System.out.println("switch state");
        return 2;
    }
}
