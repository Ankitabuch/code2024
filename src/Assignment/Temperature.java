package Assignment;

public class Temperature {
        public static double convert(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        public static double convert(double celsius, String toScale) {
            if (toScale.equalsIgnoreCase("Kelvin")) {
                return celsius + 273.15;
            } else {
                System.out.println("Invalid scale. Please enter 'Kelvin' for converting to Kelvin.");
                return -1;
            }
        }

        public static void main(String[] args) {
            double celsius = 25.0;

            // Convert Celsius to Fahrenheit
            double fahrenheit = convert(celsius);
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");

            // Convert Celsius to Kelvin
            double kelvin = convert(celsius,"Kelvin");
            if (kelvin != -1) {
                System.out.println(celsius + " Celsius is equal to " + kelvin + " Kelvin");
            }
        }
    }
