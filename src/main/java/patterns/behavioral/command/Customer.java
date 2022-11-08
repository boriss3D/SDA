package patterns.behavioral.command;

public class Customer {
 
	public static void main(String[] args) {
		CookingStaff cookingStaff = new CookingStaff();
		LunchOrder lunchOrder = new LunchOrder(cookingStaff);
		DinnerOrder dinnerOrder = new DinnerOrder(cookingStaff);
        BreakfastOrder breakfastOrder= new BreakfastOrder(cookingStaff);

		Waiter waiter = new Waiter();
		waiter.placeOrder(lunchOrder);
		waiter.placeOrder(dinnerOrder);
        waiter.placeOrder(breakfastOrder);
	}
 
}
