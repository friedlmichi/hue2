package htlgkr.friedlm22052.hue3.task1.models;

import htlgkr.friedlm22052.hue3.task1.enums.CombatType;
import htlgkr.friedlm22052.hue3.task1.enums.DamageType;

public class Weapon {
    String name;
    CombatType combatType;
    DamageType damageType;
    int damage;
    int speed;
    int strength;
    int value;

    public Weapon(String name, CombatType weaponType, DamageType combatType, int damage, int speed, int strength, int value) {
        this.name = name;
        this.combatType = weaponType;
        this.damageType = combatType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public DamageType getDamageType() {
        return damageType;
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

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    // name;combatType;damageType;damage;speed;strength;value
    //        Varscona;MELEE;SLASHING;11;3;5;4250

    @Override
    public String toString() {
        return String.format("Weapon{name='%s', combatType=%s, damageType=%s, damage=%d, speed=%d, strength=%d, value=%d}",
                name, combatType, damageType, damage, speed, strength, value);
    }
}
