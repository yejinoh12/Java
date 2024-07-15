package generic.test.test1;

public class Container<T> {

    private T item;

    public Container() {}

    public boolean isEmpty(){
        return item == null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
