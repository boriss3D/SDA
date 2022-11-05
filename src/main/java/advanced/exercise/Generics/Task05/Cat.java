package advanced.exercise.Generics.Task05;

public class Cat extends PetAnimal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice() {
        System.out.println("Meow meow!");
    }
}
