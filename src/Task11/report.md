Множественное наследование в Java не поддерживается, поэтому можно
только унаследовать None от Any.

```java
class General implements Serializable, Cloneable {
    //...
}

class Any extends General {
    //...
}

class None extends Any {
    
}
```