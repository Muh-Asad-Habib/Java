import java.util.Scanner;

public class GeneratorPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String nama = input.nextLine();

        System.out.print("Masukkan tahun lahir: ");
        String tahun = input.nextLine();

        String karakterKhusus = "!@#$";
        String password = nama + tahun + karakterKhusus;

        System.out.println("Password Anda: " + password);
    }
}
