import java.util.Scanner;

public class KonverterSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        double suhuFahrenheit = (celsius * 9/5) + 32; // Konversi ke Fahrenheit
        double suhuKelvin = celsius + 273.15; // Konversi ke Kelvin

        System.out.println("Suhu dalam Celcius: " + celsius);
        System.out.println("Suhu dalam Fahrenheit: " + suhuFahrenheit);
        System.out.println("Suhu dalam Kelvin: " + suhuKelvin);
    }
}
