package Task16;

import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        A a = new B();
        C c = new C();
        D<A> d = new D<>();
        c.operate(a); // полиморфный вызов метода
        d.operate(Collections.singletonList(a)); // ковариантный вызов метода
    }
}

class A {
    public void doSmth() {
        System.out.println("do smth with a");
    }
}

class B extends A {
    @Override
    public void doSmth() {
        System.out.println("do smth with b");
    }
}

class C {
    public void operate(A a) {
        a.doSmth();
    }
}

class D<T extends A> {
    public void operate(List<T> t) {
        t.forEach(A::doSmth);
    }
}
