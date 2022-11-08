package patterns.behavioral.state;

public class TVRemote {

	public static void main(String[] args) {

		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		State tvSwitchState = new TvSwitchState();


		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvStopState);
		context.doAction();

		context.setState(tvSwitchState);
		context.doAction();
	}

}
