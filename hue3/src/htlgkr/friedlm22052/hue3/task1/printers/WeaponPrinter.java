package htlgkr.friedlm22052.hue3.task1.printers;

import htlgkr.friedlm22052.hue3.task1.models.Weapon;
import htlgkr.friedlm22052.hue3.task1.interfaces.Printable;

import java.util.List;

public class WeaponPrinter {
        public static void printWeapons(List<Weapon> weapons) {
            Printable printable = ws -> ws.forEach(System.out::println);
            printable.print(weapons);

    }
    public static void printTable(List<Weapon> weapons) {
        Printable tablePrinter = ws -> {
            int[] columnWidths = {20, 12, 12, 6, 6, 8, 8};
            String format = "| %-" + columnWidths[0] + "s | %-" + columnWidths[1] + "s | %-" + columnWidths[2] + "s | %-" +
                    columnWidths[3] + "d | %-" + columnWidths[4] + "d | %-" + columnWidths[5] + "d | %-" + columnWidths[6] + "d |%n";
            //@TODO schöne ausgabetabelle von chatgpt.com
            System.out.println("+----------------------+------------+------------+--------+--------+--------+--------+");
            System.out.println("| Name                 | CombatType | DamageType | Damage | Speed  | Strength| Value  |");
            System.out.println("+----------------------+------------+------------+--------+--------+--------+--------+");
            ws.forEach(w -> System.out.printf(format, w.getName(), w.getCombatType(), w.getDamageType(),
                    w.getDamage(), w.getSpeed(), w.getStrength(), w.getValue()));
            System.out.println("+----------------------+------------+------------+--------+--------+--------+--------+");
        };
        tablePrinter.print(weapons);
    }

}
