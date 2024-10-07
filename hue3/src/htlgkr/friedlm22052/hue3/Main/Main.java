package htlgkr.friedlm22052.hue3.Main;

import htlgkr.friedlm22052.hue3.task1.compartators.WeaponComparator;
import htlgkr.friedlm22052.hue3.task1.printers.WeaponPrinter;
import htlgkr.friedlm22052.hue3.task1.readers.WeaponReader;
import htlgkr.friedlm22052.hue3.task1.models.Weapon;
import htlgkr.friedlm22052.hue3.task2.calculators.AverageCalculator;
import htlgkr.friedlm22052.hue3.task2.randomFunctions.RandomNumberGenerator;
import htlgkr.friedlm22052.hue3.task2.randomFunctions.RandomStringGenerator;
import htlgkr.friedlm22052.hue3.task2.utilitys.UpperCaseConverter;
import htlgkr.friedlm22052.hue3.task2.utilitys.WeaponUtils;
import htlgkr.friedlm22052.hue3.task4.OddNumberSquaring;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Weapon> weapons = WeaponReader.readWeapons("weapons.csv");
        System.out.println("Einlesung der Waffen aus der CSV-Datei:");
        WeaponPrinter.printWeapons(weapons);

        WeaponComparator.sortByDamageDescending(weapons);
        System.out.println("\nWaffen sortiert nach Schaden (absteigend):");
        WeaponPrinter.printWeapons(weapons);

        WeaponComparator.sortByMultipleAttributes(weapons);
        System.out.println("\nWaffen sortiert nach CombatType, DamageType und Name:");
        WeaponPrinter.printWeapons(weapons);

        System.out.println("\nWaffen in tabellarischer Form:");
        WeaponPrinter.printTable(weapons); // ausgabe chatgpt tabelle

        int[] randomNumbers = RandomNumberGenerator.generateRandomNumbers();
        double avg = AverageCalculator.average(randomNumbers);
        System.out.println("\nDurchschnitt der Zufallszahlen: " + avg);

        String[] randomStrings = RandomStringGenerator.generateRandomStrings();
        List<String> upperCaseStrings = UpperCaseConverter.upperCase(randomStrings);
        System.out.println("\nZufällige Strings in Großbuchstaben:");
        upperCaseStrings.forEach(System.out::println);

        Weapon lowestDamageWeapon = WeaponUtils.findWeaponWithLowestDamage(weapons);
        System.out.println("\nWaffe mit dem geringsten Schaden: " + lowestDamageWeapon);

        Weapon highestStrengthWeapon = WeaponUtils.findWeaponWithHighestStrength(weapons);
        System.out.println("Waffe mit der höchsten Stärke: " + highestStrengthWeapon);

        List<Weapon> missileWeapons = WeaponUtils.findMissileWeapons(weapons);
        System.out.println("Waffen mit DamageType.MISSILE:");
        missileWeapons.forEach(System.out::println);

        Weapon longestNameWeapon = WeaponUtils.findWeaponWithLongestName(weapons);
        System.out.println("Waffe mit dem längsten Namen: " + longestNameWeapon);

        List<String> weaponNames = WeaponUtils.getWeaponNames(weapons);
        System.out.println("Namen aller Waffen:");
        weaponNames.forEach(System.out::println);

        int sumOfValues = WeaponUtils.sumOfValues(weapons);
        System.out.println("Summe der Werte aller Waffen: " + sumOfValues);

        int sumOfHashCodes = WeaponUtils.sumOfHashCodes(weapons);
        System.out.println("Summe der Hash-Codes aller Waffen: " + sumOfHashCodes);

        List<Weapon> uniqueWeapons = WeaponUtils.removeDuplicates(weapons);
        System.out.println("Einzigartige Waffen:");
        uniqueWeapons.forEach(System.out::println);

        List<Weapon> increasedValueWeapons = WeaponUtils.increaseValuesByTenPercent(weapons);
        System.out.println("Waffen mit um 10% erhöhten Werten:");
        increasedValueWeapons.forEach(System.out::println);

        int result = OddNumberSquaring.calculateSumOfSquaredOdds();
        System.out.println("Die Summe der quadrierten ungeraden Zahlen von 1 bis 10 ist: " + result);
    }
}
