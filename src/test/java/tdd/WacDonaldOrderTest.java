package tdd;
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

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testing.tdd.WacDonaldOrder;

public class WacDonaldOrderTest {

    private WacDonaldOrder wacDonaldOrder;

    @BeforeEach
    void beforeEach() {
        wacDonaldOrder = new WacDonaldOrder();
    }

    @Test
    void oneChickenNuggetsOneWater() {
        // given
        String[] items = {"Chicken nuggets", "Water"};
        // when
        double result = wacDonaldOrder.calculateOrder(items);
        // then
        Assertions.assertThat(result).isEqualTo(6.20);
    }

    @Test
    void oneBigBurgerOneFrenchFriesTwoAppleJuices() {
        // given
        String[] items = {"Big burger", "French fries", "Apple juice", "Apple juice"};
        // when
        double result = wacDonaldOrder.calculateOrder(items);
        // then
        Assertions.assertThat(result).isEqualTo(12.10);
    }

    @Test
    void oneCheeseburgerOneChickenNuggetsOneGreatCola() {
        // given
        String[] items = {"Cheeseburger", "Chicken nuggets", "Great-Cola"};
        // when
        double result = wacDonaldOrder.calculateOrder(items);
        // then
        Assertions.assertThat(result).isEqualTo(5.18);
    }
}
