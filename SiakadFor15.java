 import java.util.Scanner;

public class SiakadFor15 {
    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        double nilai, tertinggi = 0, terendah = 100;
        
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
        }
        
        // Tampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        
        sc.close();
    }
}
    

