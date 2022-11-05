package advanced.exercise.Reflection.Task01;

public class Main {
    public static void main(String[] args) {
        ReflectionTool.fieldsGetter(new Student());
        ReflectionTool.methodGetter(new Student());
        ReflectionTool.constructorGetter(new Student());
    }
}
