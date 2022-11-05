package advanced.lessons.reflection;

public class Car {

    private String vin;
    private String model;
    private int productionYear;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    void runEngine() {
        System.out.println("engine is started!");
    }

    String getProductionInformation() {
        return "Model is " + model + " and production year is " + productionYear;
    }

    private void aPrivateMethod() {
        System.out.println("asd");
    }

}
