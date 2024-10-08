package htlgkr.friedlm.dashboard.interfaces;

import htlgkr.friedlm.dashboard.Dashboard;

public class Main {
    public static void main(String[] args) {
        double temperature = 22.5; // °C
        double pressure = 101325;  // Pa
        double speed = 15.0;       // m/s
        String time = "14:30:45";  // hh:mm:ss

        Dashboard dashboard = new Dashboard(temperature, pressure, speed, time);

        String data = dashboard.getData();
        System.out.println(data);

        dashboard.setCelsiusToFahrenheit(c -> (c * 1.8) + 32);  // neue Formel für °F
        System.out.println("\n--- After changing Fahrenheit conversion ---");
        System.out.println(dashboard.getData());
    }
}
