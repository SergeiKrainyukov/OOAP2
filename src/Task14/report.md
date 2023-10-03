Решение:

```java

class General {
    public <T extends General> T add(General other) {
        //...
    }
}

class Vector<T extends General> {
    private T[] array;

    public Vector(T[] array) {
        this.array = array;
    }

    public Vector<T> add(Vector<T> other) {
        if (array.length != other.array.length) {
            return null;
        }

        T[] resultArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i].add(other.array[i]);
        }

        return new Vector<>(resultArray);
    }
}
```

Относительно сложения объектов типа Vector<Vector<Vector<T>>>, 
данная реализация будет работать корректно, 
так как метод add() рекурсивно вызывается для каждого уровня вложенности векторов.