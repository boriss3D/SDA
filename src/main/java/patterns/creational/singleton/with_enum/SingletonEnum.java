package patterns.creational.singleton.with_enum;

public enum SingletonEnum{

    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
