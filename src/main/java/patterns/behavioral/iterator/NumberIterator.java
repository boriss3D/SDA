package patterns.behavioral.iterator;

public class NumberIterator implements Iterator {
    Integer numbers[] = {1, 30, 5, 50};
    int index;

    @Override
    public boolean hasNext() {
        if(index < numbers.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return numbers[index++];
        }
        return null;
    }
}
