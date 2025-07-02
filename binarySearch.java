public class binarySearch {
    public static void main(String[] args) {
        int[] data = {2, 3, 4, 5, 8};
        int Temukan = 8;

        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (data[mid] == Temukan) {
                System.out.println("Data ditemukan pada indeks: " + mid);
                return; // Keluar dari metode setelah menemukan data
            } else if (data[mid] < Temukan) {
                left = mid + 1; // Cari di sebelah kanan
            } else {
                right = mid - 1; // Cari di sebelah kiri
            }
        }
        System.out.println("Data tidak ditemukan");
    }
}
