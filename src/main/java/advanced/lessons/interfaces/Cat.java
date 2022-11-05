package advanced.lessons.interfaces;

public class Cat implements AnimalBehaviours {

    @Override
    public void animalRuns() {
        //implement how a cat behaves for animalRuns method
        System.out.println("The cat runs");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping....");
    }
}
