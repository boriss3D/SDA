package patterns.behavioral.observer.homework;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        System.out.println("Initial value set...");
        subject.setValue(15);
        System.out.println();

        subject.registerObserver(new ConcreteValueObserver(subject));
        subject.registerObserver(new ValueLoweredObserver(subject));
        subject.registerObserver(new ByTenChangedObserver(subject));

        System.out.println("Updating value...");
        subject.setValue(10);
        subject.update();
        System.out.println();

        System.out.println("Updating value...");
        subject.setValue(21);
        subject.update();
        System.out.println();
    }
}
