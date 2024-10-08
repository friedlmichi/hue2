package htlgkr.friedlm.dashboard;

import htlgkr.friedlm.dashboard.interfaces.IUnitConverter;

public class Dashboard implements IDashboard {
    private double temperatureC;
    private double pressurePa;
    private double speedMs;
    private String time;

    private IUnitConverter<Double, Double> celsiusToFahrenheit = c -> (c * 9 / 5) + 32;
    private IUnitConverter<Double, Double> celsiusToKelvin = c -> c + 273.15;
    private IUnitConverter<Double, Double> pascalToBar = p -> p / 100000;
    private IUnitConverter<Double, Double> msToKmh = s -> s * 3.6;
    private IUnitConverter<Double, Double> msToMph = s -> s * 2.237;

    private IUnitConverter<String, String> hours24ToHours12 = t -> t.substring(0, 5);

    public Dashboard(double temperatureC, double pressurePa, double speedMs, String time) {
        this.temperatureC = temperatureC;
        this.pressurePa = pressurePa;
        this.speedMs = speedMs;
        this.time = time;
    }

    @Override
    public String getData() {
        return "---- Dashboard ----\n" +
                "Temperature: " + temperatureC + "°C (" + celsiusToKelvin.convert(temperatureC) + " K, " +
                celsiusToFahrenheit.convert(temperatureC) + " °F)\n" +
                "Pressure: " + pressurePa + " Pa (" + pascalToBar.convert(pressurePa) + " bar)\n" +
                "Speed: " + speedMs + " m/s (" + msToKmh.convert(speedMs) + " km/h, " + msToMph.convert(speedMs) + " mph)\n" +
                "Time: " + time + " (" + hours24ToHours12.convert(time) + ")";
    }

    public void setCelsiusToFahrenheit(IUnitConverter<Double, Double> converter) {
        this.celsiusToFahrenheit = converter;
    }
}
