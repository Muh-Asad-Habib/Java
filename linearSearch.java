public class linearSearch {
    public static void main(String[] args) {
        int[] data = {5, 3, 8, 4, 2};
        int Temukan = 2;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == Temukan) {
                System.out.println("Data ditemukan pada indeks: " + i);
                return; // Keluar dari metode setelah menemukan data
            }
        }
        System.out.println("Data tidak ditemukan");
    }
}
