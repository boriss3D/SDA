package advanced.lessons.generics.akin;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Box<T extends Thing> {

    private List<T> thingList = new ArrayList<>();

    void whatIHaveInside() {
        System.out.println(thingList.toString());
    }

    public void carry() {
        System.out.println(thingList + " was moved...");
    }

    public void putInto(T thing) {
        thingList.add(thing);
    }

}
