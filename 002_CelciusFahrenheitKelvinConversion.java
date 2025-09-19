// Convert temperature between Celsius, Fahrenheit, and Kelvin.

import java.util.Scanner;
class CelciusFahrenheitKelvinConversion {
    double temperature;
    String unit;

    CelciusFahrenheitKelvinConversion(double t, String u) {
        this.temperature = t;
        this.unit = u;
    }

    double convertCelciusToFahrenheit() {
        return (((this.temperature)*9)/5)+32;
    }

    double convertCelciusToKelvin() {
        return (this.temperature + 273.15);
    }

    double convertFahrenheitToCelcius() {
        return ((this.temperature-32)*5)/9;
    }

    double convertFahrenheitToKelvin() {
        return (((this.temperature-32)*5)/9)+273.15;
    }

    double convertKelvinToCelcius() {
        return this.temperature - 273.15;
    }

    double convertKelvinToFahrenheit() {
        return (((this.temperature-273.15)*9)/5)+32;
    }

    void displayResult() {
        final String ALPHABET_C = "C";
        final String ALPHABET_F = "F";
        final String ALPHABET_K = "K";

        if(this.unit.toUpperCase().startsWith(ALPHABET_C)) {
            System.out.printf("%.2f in celcius = %.2f in fahrenheit%n", this.temperature, this.convertCelciusToFahrenheit());
            System.out.printf("%.2f in celcius = %.2f in kelvin%n", this.temperature, this.convertCelciusToKelvin());
        }
        else if(this.unit.toUpperCase().startsWith(ALPHABET_F)) {
            System.out.printf("%.2f in fahrenheit = %.2f in celcius%n", this.temperature, this.convertFahrenheitToCelcius());
            System.out.printf("%.2f in fahrenheit = %.2f in kelvin%n", this.temperature, this.convertFahrenheitToKelvin());
        }
        else if(this.unit.toUpperCase().startsWith(ALPHABET_K)) {
            System.out.printf("%.2f in kelvin = %.2f in celcius%n", this.temperature, this.convertKelvinToCelcius());
            System.out.printf("%.2f in kelvin = %.2f in fahrenheit%n", this.temperature, this.convertKelvinToFahrenheit());
        }
        else {
            System.out.println("Please enter correct unit for temperature (C/F/K)");
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Please enter temperature unit (C for Celcius, F for Fahrenheit and K for Kelvin): ");
        String tempUnit = scanner.next();

        CelciusFahrenheitKelvinConversion obj = new CelciusFahrenheitKelvinConversion(temp, tempUnit);
        obj.displayResult();
        
        scanner.close();
    }
}