package patterns.exercises.task08;

public class ConcreteValueObserver extends Observer {

    public ConcreteValueObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("New value -> " + subject.getValue());
    }
}
