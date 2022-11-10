package patterns.behavioral.observer.homework;

public class ByTenChangedObserver extends Observer {

    private int value;

    public ByTenChangedObserver(Subject subject) {
        this.subject = subject;
        this.value = subject.getValue();
    }

    @Override
    void update() {
        if (Math.abs(this.value - subject.getValue()) >= 10) {
            System.out.println("Value differs at least by 10 than the previous one -> " + subject.getValue());
        } else {
            System.out.println("Value differs at least by 10 than the previous one -> No");
        }
        this.value = subject.getValue();
    }
}
