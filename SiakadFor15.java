 import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;
        
        // Perulangan untuk 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            // Input nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            // Cek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            
            // Cek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Hitung mahasiswa lulus dan tidak lulus (batas kelulusan 60)
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        
        // Tutup scanner
        sc.close();
    }
}