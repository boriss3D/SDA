package advanced.lessons.generics.akin;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book extends Thing {

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
