package patterns.creational.abstract_factory;

public class FontFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Font getFont(String fontType) {
        if(fontType == null){
            return null;
        }
        if(fontType.equalsIgnoreCase("Times")){
            return new FontTimes();
        }else if(fontType.equalsIgnoreCase("Logic")){
            return new FontLogic();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

}
