package advanced.exercise.Generics.Task05;

public class Dog extends PetAnimal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice() {
        System.out.println("WOF WOF!");
    }
}
