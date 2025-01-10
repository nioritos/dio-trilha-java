public class TemperaturesConversors {
    public static void conversorKelvin(double celsius) {
        double k = celsius + 273.15;
        System.out.println("Celsius to Kelvin: " + k );
    };

    public static void conversorFahrenheit(double celsius) {
        double f = (celsius * 1.8) + 32;
        System.out.println("Celsius to Fahrenheit: " + f );
    };
}
