package Practice_list;

public class A<T> {
    T value;

    A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}
