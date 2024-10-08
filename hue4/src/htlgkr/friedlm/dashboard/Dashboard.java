package htlgkr.friedlm.dashboard;

import htlgkr.friedlm.dashboard.interfaces.IUnitConverter;

import java.util.ArrayList;
import java.util.List;

public class Dashboard implements IDashboard {
    private double temperatureC;
    private double pressurePa;
    private double speedMs;
    private String time;

    // Liste von Umrechnungsfunktionen für alle Parameter
    private List<IUnitConverter<Double, String>> converters;

    public Dashboard(double temperatureC, double pressurePa, double speedMs, String time) {
        this.temperatureC = temperatureC;
        this.pressurePa = pressurePa;
        this.speedMs = speedMs;
        this.time = time;

        // Umrechnungen in eine Liste speichern
        converters = new ArrayList<>();
        converters.add(c -> "Temperature: " + c + "°C (" + (c + 273.15) + " K, " + ((c * 9 / 5) + 32) + " °F)");
        converters.add(p -> "Pressure: " + p + " Pa (" + (p / 100000) + " bar)");
        converters.add(s -> "Speed: " + s + " m/s (" + (s * 3.6) + " km/h, " + (s * 2.237) + " mph)");
    }

    @Override
    public String getData() {
        StringBuilder data = new StringBuilder("---- Dashboard ----\n");
        data.append(converters.get(0).convert(temperatureC)).append("\n");
        data.append(converters.get(1).convert(pressurePa)).append("\n");
        data.append(converters.get(2).convert(speedMs)).append("\n");

        data.append("Time: ").append(time).append(" (").append(time.substring(0, 5)).append(")\n");

        return data.toString();
    }

    // Möglichkeit, Umrechnungsarten zu ändern
    public void setConverter(int index, IUnitConverter<Double, String> converter) {
        if (index >= 0 && index < converters.size()) {
            converters.set(index, converter);
        }
    }
}
