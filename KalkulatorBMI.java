public class KalkulatorBMI {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadanCm = input.nextDouble();

        // Ubah tinggi badan ke meter
        double tinggiBadan = tinggiBadanCm / 100.0;
        System.out.println("Tinggi badan (m): " + tinggiBadan);

        if (tinggiBadan <= 0) {
            System.out.println("Tinggi badan tidak boleh nol atau negatif.");
        } else {
            double bmi = beratBadan / (tinggiBadan * tinggiBadan);

            System.out.printf("Indeks Massa Tubuh (BMI): %.2f%n", bmi);

            if (bmi < 18.5) {
                System.out.println("Kekurangan berat badan (Kurus)");
            } else if (bmi < 25) {
                System.out.println("Berat badan normal (Sehat)");
            } else if (bmi < 30) {
                System.out.println("Kelebihan berat badan (Gemuk)");
            } else {
                System.out.println("Obesitas");
            }
        }
        input.close();
    }
}