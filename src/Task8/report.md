### Пример ковариантности:

1. Пусть у нас есть классы Animal и Cat, причем Cat является подклассом Animal. Тогда следующий код будет корректным:

```java
public class Animal {
    public Animal giveBirth() {
        return new Animal();
    }
}

public class Cat extends Animal {
    @Override
    public Cat giveBirth() {
        return new Cat();
    }
}
```
Здесь метод giveBirth() в классе Animal возвращает объект типа Animal,
а в классе Cat он переопределен и возвращает объект типа Cat,
который является производным от Animal.

### Пример контравариантности:

Предположим, у нас есть иерархия классов животных:

```java
class Animal {
// ...
}

class Cat extends Animal {
// ...
}

```
Интерфейс, который содержит функцию, принимающую объект класса Animal:

```java
interface AnimalProcessor {
    void process(Animal animal);
}
```

Мы можем создать объект типа AnimalProcessor и передать ему функцию, принимающую объект класса Cat:

```java
AnimalProcessor processor = animal -> {

};
Cat cat = new Cat();
processor.process(cat);
```


Это возможно благодаря контравариантности - функция, 
принимающая объект класса Cat, является функцией, 
принимающей объект класса Animal. 
Таким образом, мы можем передать функцию, 
специализированную для класса Cat, в интерфейс, 
который ожидает функцию, принимающую объект класса Animal.