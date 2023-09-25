```java
class General implements Serializable, Cloneable {
    //...
    public void assignmentAttempt(General target, General source) {
        if (target.isGeneralType(source.getClass())) {
            target = source;
            return;
        }
        target = new None();
    }
}

class Any extends General {
    //...
}

final class None extends Any {

}
```