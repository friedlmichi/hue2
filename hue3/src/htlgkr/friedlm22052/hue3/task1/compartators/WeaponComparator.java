package htlgkr.friedlm22052.hue3.task1.compartators;

import htlgkr.friedlm22052.hue3.task1.models.Weapon;

import java.util.Comparator;
import java.util.List;

public class WeaponComparator {
    public static void sortByDamageDescending(List<Weapon> weapons) {
        weapons.sort(Comparator.comparingInt(Weapon::getDamage).reversed());
    }

    public static void sortByMultipleAttributes(List<Weapon> weapons) {
        weapons.sort(Comparator.comparing(Weapon::getCombatType)
                .thenComparing(Weapon::getDamageType)
                .thenComparing(Weapon::getName));
    }
}
