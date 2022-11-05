package advanced.lessons.generics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Cup<T extends Liquid> {

    private T liquid;

    void drink() {
        System.out.println("Drinking " + liquid);
    }

    public void fulfillCup(T liquid) {
        this.liquid = liquid;
    }


}
