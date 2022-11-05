package advanced.lessons.generics.maps;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Glass {

    private String material;

    public Glass(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
}
