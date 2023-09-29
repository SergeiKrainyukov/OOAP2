В Java доступны два варианта скрытия методов:

1. Метод публичен в родительском классе А и публичен в его потомке B:
```java
class A {
   public void method() {
      System.out.println("Method in class A");
   }
}

class B extends A {
    
   @Override 
   public void method() {
      System.out.println("Method in class B");
   }
}

```

2.1. Метод скрыт в родительском классе А и скрыт в его потомке B. В данном случае наследования и переопределения метода как такового нет,
так как метод с модификатором private недоступен в потомках.
```java
class A {
    private void method() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    private void method() {
        System.out.println("Method in class B");
    }
}
```

2.2. Метод доступен для потомков и для классов в том же пакете, но
недоступен для классов в других пакетах

```java
class A {
    protected void method() {
        System.out.println("Method in class A");
    }
}

class B extends A {
    @Override
    protected void method() {
        System.out.println("Method in class B");
    }
}
```

Примеры кода для остальных двух вариантов недоступны в Java, так как Java 
запрещает наследовать методы с иным модификатором доступа.