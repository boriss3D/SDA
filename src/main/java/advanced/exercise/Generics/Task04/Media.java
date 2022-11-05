package advanced.exercise.Generics.Task04;

public abstract class Media {
    public String mediaName;
    public MediaType mediaType;

    @Override
    public String toString() {
        return "MediaName -> " + mediaName + ", mediaType -> " + mediaType;
    }
}
