package generics;

public class NumberBox<T extends Number> {

    private T item;

    public NumberBox(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public double add(Number number) {
        return item.doubleValue() + number.doubleValue();
    }
}