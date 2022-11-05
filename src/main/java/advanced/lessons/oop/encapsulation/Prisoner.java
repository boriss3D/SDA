package advanced.lessons.oop.encapsulation;

public class Prisoner {


    private String id;
    private String name;
    private String lastName;

    public Prisoner() {
        this.id = "some unique generated value";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
