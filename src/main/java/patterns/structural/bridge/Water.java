package patterns.structural.bridge;

public class Water implements Drink{
    @Override
    public String getVolume() {
        return null;
    }

    @Override
    public boolean isAddictive() {
        return false;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 0;
    }

    @Override
    public Taste getTaste() {
        return null;
    }
}
