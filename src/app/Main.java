package app;

public class Main {
    public static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        System.out.println("App for distance converting");
        System.out.println("Version 1.0.");

        double kilometers = 9;
        double miles = 16;
        double convertedMiles = convertMilesToKilometers(miles);
        double convertedKilometers = convertKilometersToMiles(kilometers);
        System.out.println("Result is " + convertedMiles + " kilometers and " + convertedKilometers + " miles.");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers / MILES_TO_KILOMETERS;
    }
}

