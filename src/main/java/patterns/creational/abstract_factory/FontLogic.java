package patterns.creational.abstract_factory;

public class FontLogic implements Font {
    @Override
    public void setSize() {
        System.out.println("setting size from Font Logic");
    }
}
