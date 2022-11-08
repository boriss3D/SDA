package patterns.behavioral.state;

public class TVStopState implements State {

	@Override
	public int doAction(){
		System.out.println("TV is turned OFF");
		return 0;
	}
}
