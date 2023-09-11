import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;import java.util.function.Consumer;import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Simple {
    public static void main(String[] args) {
        AnimalProcessor processor = animal -> {

        };
        Cat cat = new Cat();
        processor.process(cat);
    }
}

class Animal {

}

class Cat extends Animal {

}

interface AnimalProcessor {
    void process(Animal animal);
}


