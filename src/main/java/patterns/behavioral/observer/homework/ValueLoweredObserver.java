package patterns.behavioral.observer.homework;

public class ValueLoweredObserver extends Observer {

    private int value;

    public ValueLoweredObserver(Subject subject) {
        this.subject = subject;
        this.value = subject.getValue();
    }

    @Override
    void update() {
        if (this.value > subject.getValue()) {
            System.out.println("Value become smaller -> " + subject.getValue());
        } else {
            System.out.println("Value become smaller -> No");
        }
        this.value = subject.getValue();
    }
}
