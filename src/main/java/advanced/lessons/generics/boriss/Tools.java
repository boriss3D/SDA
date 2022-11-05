package advanced.lessons.generics.boriss;

public class Tools {
    private String tool;

    public Tools(String tool) {
        this.tool = tool;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return tool;
    }
}
