public class PolaBintang {
    public static void main(String[] args) {
        System.out.print("Masukkan tinggi pola (n): \n");
        int n = 5;
        System.out.println();

        // 1. Siku-siku kiri bawah
        System.out.println("1. Siku-siku kiri bawah");
        for (int i = 1; i <= n; i++)
            System.out.println("* ".repeat(i));

        // 2. Siku-siku kanan bawah
        System.out.println("\n2. Siku-siku kanan bawah");
        for (int i = 1; i <= n; i++)
            System.out.println("  ".repeat(n - i) + "* ".repeat(i));

        // 3. Siku-siku kiri atas
        System.out.println("\n3. Siku-siku kiri atas");
        for (int i = n; i >= 1; i--)
            System.out.println("* ".repeat(i));

        // 4. Siku-siku kanan atas
        System.out.println("\n4. Siku-siku kanan atas");
        for (int i = n; i >= 1; i--)
            System.out.println("  ".repeat(n - i) + "* ".repeat(i));

        // 5. Segitiga sama kaki
        System.out.println("\n5. Segitiga sama kaki");
        for (int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        // 6. Segitiga sama kaki terbalik
        System.out.println("\n6. Segitiga sama kaki terbalik");
        for (int i = n; i >= 1; i--)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        // 7. Belah ketupat
        System.out.println("\n7. Belah ketupat");
        for (int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        for (int i = n - 1; i >= 1; i--)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        // 8. Panah atas (segitiga atas + batang)
        System.out.println("\n8. Panah atas");
        for (int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        for (int i = 1; i <= n / 2; i++)
            System.out.println(" ".repeat(n - 1) + "*");

        // 9. Panah bawah
        System.out.println("\n9. Panah bawah");
        for (int i = 1; i <= n / 2; i++)
            System.out.println(" ".repeat(n - 1) + "*");
        for (int i = n; i >= 1; i--)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        // 10. Jam pasir
        System.out.println("\n10. Jam pasir");
        for (int i = n; i >= 1; i--)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        for (int i = 2; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));

        // 11. Segitiga horizontal kiri-kanan
        System.out.println("\n11. Segitiga horizontal kiri-kanan");
        for (int i = 1; i <= n; i++) {
            System.out.print("* ".repeat(i));
            System.out.print("  ".repeat((n - i) * 2));
            System.out.println("* ".repeat(i));
        }
        for (int i = 4; i >= 1; i--) {
            System.out.print("* ".repeat(i));
            System.out.print("  ".repeat((n - i) * 2));
            System.out.println("* ".repeat(i));
        }
    }
}
