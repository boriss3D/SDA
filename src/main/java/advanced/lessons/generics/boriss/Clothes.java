package advanced.lessons.generics.boriss;

public class Clothes {
    private String clothes;

    public Clothes(String clothes) {
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return clothes;
    }
}
