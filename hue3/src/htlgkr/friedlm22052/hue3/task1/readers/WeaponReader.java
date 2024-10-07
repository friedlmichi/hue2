package htlgkr.friedlm22052.hue3.task1.readers;

import htlgkr.friedlm22052.hue3.task1.enums.CombatType;
import htlgkr.friedlm22052.hue3.task1.enums.DamageType;
import htlgkr.friedlm22052.hue3.task1.models.Weapon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeaponReader {
    public static List<Weapon> readWeapons(String filePath) {
        List<Weapon> weapons = new ArrayList<>();
        String line="";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                String name = values[0];
                CombatType combatType = CombatType.valueOf(values[1].trim());
                DamageType damageType = DamageType.valueOf(values[2].trim());
                int damage = Integer.parseInt(values[3]);
                int speed = Integer.parseInt(values[4]);
                int strength = Integer.parseInt(values[5]);
                int value = Integer.parseInt(values[6]);

                Weapon weapon = new Weapon(name, combatType, damageType, damage, speed, strength, value);
                weapons.add(weapon);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Fehler in line: " + line); //@TODO WIEDER LÖSCHEN/ZUR FEHLERSUCHE
            e.printStackTrace();
        }

        return weapons;
    }
}
