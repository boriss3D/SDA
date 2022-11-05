package advanced.lessons.day2;

public abstract class HomeAppliance implements HomeApplianceInterface {

    private int productionYear;
    private String color;
    private String manufacturer;

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increaseSpeed");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("decreaseSpeed");
    }
}
