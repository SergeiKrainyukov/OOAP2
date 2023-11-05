## Решение

Приведу пример из рабочего проекта. Пользователь может совершать заказ в
приложении с разных типов складов, с разными кредитными условиями и с
разным типом цены. Все эти свойства являются одинаково важными и каждый
из них имеет важные параметры, влияющие на итоговую сумму заказа и
количество товаров, доступных к заказу. Соответственно выделить какой-то
один из них и на его основе сделать наследование не получится, и применить
базовые типы для полей класса тоже будет плохим решением. Поэтому было
применено наследование вида.

```java
class Order {
    private PriceType priceType; //тип цены
    private WarehouseType warehouseType; //тип склада
    private CreditLine creditLine; //кредитные условия
}

class PriceType {
    
}
class DynamicPrice extends PriceType{}
class CalculatingPrice extends PriceType{}


class WarehouseType {
    
}
class PresalesWarehouse extends WarehouseType{}
class DISWarehouse extends WarehouseType{}

class CreditLine {
    
}
class Cash extends CreditLine{}
class Cashless extends CreditLine{}
```