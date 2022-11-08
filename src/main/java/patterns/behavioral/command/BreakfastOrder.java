package patterns.behavioral.command;

public class BreakfastOrder implements Order {


    private CookingStaff cookingStaff;

    public BreakfastOrder(CookingStaff cookingStaff) {
        this.cookingStaff = cookingStaff;
    }

    @Override
    public void execute() {
        System.out.println( "Breakfast is  in progress");
    }
}
