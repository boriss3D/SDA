package patterns.behavioral.chian_of_responsibility;

public class ExceptionLogger extends AbstractLogger {

    public ExceptionLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Exception level");
    }
}
