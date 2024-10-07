package htlgkr.friedlm22052.hue3.task1.interfaces;

import htlgkr.friedlm22052.hue3.task1.models.Weapon;

import java.util.List;

@FunctionalInterface
public interface Printable {
    void print(List<Weapon> weapons);
}
