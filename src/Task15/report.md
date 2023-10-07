Решение:
```java
class Weapon {
    private String name;
    private Int damage;
    private WeaponType weaponType;
    
    public Weapon(String name, Int damage, WeaponType weaponType) {
        this.name = name;
        this.damage = damage;
        this.weaponType = weaponType;
    }
}

class LaserWeaponType extends WeaponType {}

class ElectricWeaponType extends WeaponType {}
```