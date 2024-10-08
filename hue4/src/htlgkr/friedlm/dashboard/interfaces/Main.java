package htlgkr.friedlm.dashboard.interfaces;

import htlgkr.friedlm.dashboard.Dashboard;

public class Main {
    public static void main(String[] args) {
        // Beispielwerte von Sensoren (gemockt)
        double temperature = 22.5; // °C
        double pressure = 101325;  // Pa
        double speed = 15.0;       // m/s
        String time = "14:30:45";  // hh:mm:ss

        // Dashboard erstellen
        Dashboard dashboard = new Dashboard(temperature, pressure, speed, time);

        // Daten als String abrufen und anzeigen
        String data = dashboard.getData();
        System.out.println(data); // Ausgabe des gesamten Dashboards als String

        // Ändere die Umrechnung für Temperatur in °F
        dashboard.setConverter(0, c -> "Temperature: " + c + "°C (" + ((c * 1.8) + 32) + " °F only)");
        System.out.println("\n--- Conversion: ---");
        System.out.println(dashboard.getData());  // Ausgabe nach Änderung der Umrechnungslogik
    }
}
