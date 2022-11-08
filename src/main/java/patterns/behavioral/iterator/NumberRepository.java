package patterns.behavioral.iterator;

public class NumberRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new NumberIterator();
    }
}
