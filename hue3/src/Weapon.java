public class Weapon {
    String name;
    CombatType weaponType;
    DamageType combatType;
    int damage;
    int speed;
    int strength;
    int value;

    public Weapon(String name, CombatType weaponType, DamageType combatType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.weaponType = weaponType;
        this.combatType = combatType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public CombatType getWeaponType() {
        return weaponType;
    }

    public DamageType getCombatType() {
        return combatType;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeaponType(CombatType weaponType) {
        this.weaponType = weaponType;
    }

    public void setCombatType(DamageType combatType) {
        this.combatType = combatType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setValue(int value) {
        this.value = value;
    }
    // name;combatType;damageType;damage;speed;strength;value
    //        Varscona;MELEE;SLASHING;11;3;5;4250
}
