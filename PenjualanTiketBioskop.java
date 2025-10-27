import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        char ulang = 'y'; // ← tambahkan inisialisasi

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = input.nextInt();

            // Validasi input negatif
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                continue;
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;

            // Hitung diskon
            if (jumlahTiket > 10) {
                totalHarga *= 0.85; // diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; // diskon 10%
            }

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.printf("Total harga setelah diskon: Rp%.0f%n", totalHarga);

            System.out.print("Apakah ada pembeli lain? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\n=== Laporan Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.printf("Total pendapatan     : Rp%.0f%n", totalPendapatan);

        input.close();
    }
}
