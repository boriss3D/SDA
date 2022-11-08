package patterns.behavioral.command;

public class LunchOrder implements Order {
 
	private CookingStaff cookingStaff;
 
	public LunchOrder(CookingStaff cookingStaff) {

	    this.cookingStaff = cookingStaff;
	}
 
	@Override
	public void execute() {
		cookingStaff.cookLunch();
	}
}
