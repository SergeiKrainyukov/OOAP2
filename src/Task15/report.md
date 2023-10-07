Решение:

```kotlin
class Weapon(
    val name: String,
    val damage: Int,
    val type: WeaponType
)

class WeaponType(
    val description: String
)

class LaserWeaponType(val description: String): WeaponType(description)

class ElectricWeaponType(val description: String): WeaponType(description)
```