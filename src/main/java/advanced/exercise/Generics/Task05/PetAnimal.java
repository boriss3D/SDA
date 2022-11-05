package advanced.exercise.Generics.Task05;

public abstract class PetAnimal {
    private String name;

    public PetAnimal(String name, int age) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getVoice();
}
