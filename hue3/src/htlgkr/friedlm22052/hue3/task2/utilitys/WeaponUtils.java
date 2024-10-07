package htlgkr.friedlm22052.hue3.task2.utilitys;

import htlgkr.friedlm22052.hue3.task1.enums.DamageType;
import htlgkr.friedlm22052.hue3.task1.models.Weapon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WeaponUtils {
    public static Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return weapons.stream()
                .min(Comparator.comparingInt(Weapon::getDamage))
                .orElse(null);
    }
    public static Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream()
                .max(Comparator.comparingInt(Weapon::getStrength))
                .orElse(null);
    }
    public static List<Weapon> findMissileWeapons(List<Weapon> weapons) {
        return weapons.stream()
                .filter(w -> w.getDamageType() == DamageType.MISSILE)
                .collect(Collectors.toList());
    }
    public static Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream()
                .max(Comparator.comparingInt(w -> w.getName().length()))
                .orElse(null);
    }
    public static List<String> getWeaponNames(List<Weapon> weapons) {
        return weapons.stream()
                .map(Weapon::getName)
                .collect(Collectors.toList());
    }
    public static int[] getWeaponSpeeds(List<Weapon> weapons) {
        return weapons.stream()
                .mapToInt(Weapon::getSpeed)
                .toArray();
    }
    public static int sumOfValues(List<Weapon> weapons) {
        return weapons.stream()
                .mapToInt(Weapon::getValue)
                .sum();
    }
    public static int sumOfHashCodes(List<Weapon> weapons) {
        return weapons.stream()
                .mapToInt(Weapon::hashCode)
                .sum();
    }
    public static List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return weapons.stream()
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<Weapon> increaseValuesByTenPercent(List<Weapon> weapons) {
        return weapons.stream()
                .peek(w -> w.setValue((int) (w.getValue() * 1.1)))
                .collect(Collectors.toList());
    }


}
