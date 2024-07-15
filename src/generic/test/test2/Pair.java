package generic.test.test2;

public class Pair <T, S> {

    public T first;
    public S second;

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}


