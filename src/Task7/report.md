Динамическое связывание в Java позволяет вызывать методы объекта во время выполнения программы, а не на этапе компиляции. 
Это достигается путем определения типа объекта во время выполнения и вызова соответствующего метода.

Пример кода с комментариями:

```java
public class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Создаем объект класса Dog и присваиваем его переменной типа Animal
        Animal animal2 = new Cat(); // Создаем объект класса Cat и присваиваем его переменной типа Animal

        animal1.makeSound(); // Вызываем метод makeSound() для объекта animal1. Вывод: "Dog is barking"
        animal2.makeSound(); // Вызываем метод makeSound() для объекта animal2. Вывод: "Cat is meowing"
    }
}
```

В данном примере мы создаем классы Animal, Dog и Cat. Классы Dog и Cat наследуются от класса Animal и переопределяют его метод makeSound(). Затем мы создаем объекты классов Dog и Cat и присваиваем их переменным типа Animal. Во время выполнения программы определяется тип объекта и вызывается соответствующий метод makeSound().

Таким образом, динамическое связывание позволяет нам использовать полиморфизм и вызывать методы подклассов через переменные суперклассов.