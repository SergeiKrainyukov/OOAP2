Рассмотрим задание на примере кода:

```java
class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }
}

class Main {
    public static void main(String[] args) {
        //Расширение типа:
        Animal animal = new Dog(10);
        
        //Специализация типа:
        Dog dog = (Dog) animal;
    }
}
```

Здесь в методе main() класса Main приведены примеры расширения типа, когда
наследник задает более общий случай родителя, и специализации типа, когда
наследник задает более специализированный случай родителя.