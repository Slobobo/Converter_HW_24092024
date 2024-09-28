package app;

public class Main {

    public static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double kilometers = 5;
        double convertedKilometers = convertKilometersToMiles(kilometers);
        System.out.println("Result is " + convertedKilometers + " miles.");
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers / MILES_TO_KILOMETERS;
    }
}