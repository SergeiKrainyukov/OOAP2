package Task1;

//Наследование
//******************************************************
class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

//класс Dog наследуется от Animal
class Dog extends Animal {

    public Dog(int age) {
        super(age);
    }
}

//******************************************************


//Композиция
//******************************************************

//класс Car
class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}

class Engine {

}

//******************************************************


//Полиморфизм
//******************************************************

class Plan implements Calculable, Extendable {

    @Override
    public void calculate() {

    }

    @Override
    public void extend() {

    }
}

interface Calculable {
    void calculate();
}

interface Extendable {
    void extend();
}

//******************************************************