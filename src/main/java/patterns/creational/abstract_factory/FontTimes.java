package patterns.creational.abstract_factory;

public class FontTimes implements Font {
    @Override
    public void setSize() {
        System.out.println("this is my font size");
    }
}
