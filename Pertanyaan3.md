Jawaban Pertanyaan:
1. Berapa kali perulangan jika input pertama "batal"?
Jawaban: 1 kali
Penjelasan:
DO-WHILE selalu menjalankan blok kode minimal 1 kali sebelum mengecek kondisi
Meskipun input pertama adalah "batal", program tetap masuk ke dalam perulangan
2. Kondisi berhenti pada perulangan DO-WHILE:
Jawaban:
if (namaPelanggan.equalsIgnoreCase("batal")) {
    break;
}
Penjelasan:

Program berhenti ketika variabel namaPelanggan bernilai "batal"
Method equalsIgnoreCase() membandingkan string tanpa mempedulikan huruf besar/
3. Fungsi nilai true pada kondisi DO-WHILE:
Jawaban:
Kondisi: while (true)
Fungsi:

Membuat perulangan berjalan terus-menerus (infinite loop)
Nilai true artinya kondisi selalu benar
4. Mengapa DO-WHILE tetap berjalan meskipun tidak ada inisialisasi dan update?
Jawaban:
Karena:

DO-WHILE berbeda dengan FOR:

FOR membutuhkan: inisialisasi (i=1), kondisi (i<=10), dan update (i++)
 DO-WHILE hanya membutuhkan: kondisi
Kondisi true menggantikan kebutuhan inisialisasi:

Tidak perlu variabel counter seperti i
Perulangan berjalan sampai ada break