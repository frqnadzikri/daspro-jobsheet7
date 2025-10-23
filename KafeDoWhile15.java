import java.util.Scanner;

public class KafeDoWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;
        
        // Perulangan DO-WHILE 
        do {
            // Input nama pelanggan
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            
            // Cek apakah pelanggan ingin membatalkan
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            
            // Input jumlah pesanan
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            
            // Hitung total harga
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            
            // Tampilkan total harga
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            
            sc.nextLine();
            
        } while (true);
        
        System.out.println("Semua transaksi selesai.");
        
        // Tutup scanner
        sc.close();
    }
}
