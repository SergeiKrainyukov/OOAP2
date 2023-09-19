В Java есть поддержка запрета переопределения методов в потомках.

Например, если взять код из предыдущего задания и пометить метод deepCopy() как
final, то попытка его переопределения в классе Any приведет к ошибке.

```java
class General implements Serializable, Cloneable {
    //копирование объекта
    public final General deepCopy() {
        //...
    }
    //...
}

class Any extends General {
    //Компилятор выдаст ошибку, так как deepCopy помечен как final
    @Override
    public final General deepCopy() {
        //...
    }
}
```