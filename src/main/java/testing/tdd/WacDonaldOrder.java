package testing.tdd;

/*
Create a method that calculates the final price when ordering at WacDonald's restaurant chain.

The prices per item unit are:

| Item             | Type  | Price |
|------------------|-------|-------|
| Cheeseburger     | Main  | 1.55  |
| Big burger       | Main  | 6.50  |
| Chicken nuggets  | Side  | 4.20  |
| French fries     | Side  | 1.90  |
| Great-Cola       | Drink | 1.65  |
| Water            | Drink | 2.00  |
| Apple juice      | Drink | 1.85  |


A 30% discount should be applied when a customer chooses a combo: one Main + one Side + one Drink.

The test scenarios are:
- One chicken nuggets + one water = 6.20
- One big burger + one french fries + two apple juices = 12.10
- One cheeseburger + one chicken nuggets + one great-cola = 5.18

 */
public class WacDonaldOrder {
    public double calculateOrder(String[] items) {
        double price = 0.0;
        int main = 0;
        int side = 0;
        int drink = 0;

        for (String item : items) {
            switch (item) {
                case "Cheeseburger" -> {
                    price += 1.55;
                    main++;
                }
                case "Big burger" -> {
                    price += 6.50;
                    main++;
                }
                case "Chicken nuggets" -> {
                    price += 4.20;
                    side++;
                }
                case "French fries" -> {
                    price += 1.90;
                    side++;
                }
                case "Great-Cola" -> {
                    price += 1.65;
                    drink++;
                }
                case "Water" -> {
                    price += 2.00;
                    drink++;
                }
                case "Apple juice" -> {
                    price += 1.85;
                    drink++;
                }
            }
        }
        if (main == 1 && side == 1 & drink == 1) {
            price *= 0.70;
        }
        return price;
    }
}
