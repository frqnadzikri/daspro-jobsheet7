Jawaban Pertanyaan:
1. Maksud dan Kegunaan Sintaks:
a. nilai < 0 || nilai > 100

Maksud: Mengecek apakah nilai kurang dari 0 ATAU nilai lebih dari 100
Kegunaan: Validasi input untuk memastikan nilai berada dalam rentang 0-100
|| adalah operator OR (atau)

b. continue

Maksud: Melewati sisa kode dalam perulangan dan langsung ke iterasi berikutnya
Kegunaan: Ketika nilai tidak valid, program tidak menambah counter i dan meminta input ulang

2. Posisi i++ di akhir WHILE:

i++ ditulis di akhir perulangan WHILE agar counter hanya bertambah ketika nilai yang diinput valid
Jika ditulis di awal, counter akan selalu bertambah meskipun nilai tidak valid, sehingga jumlah input yang valid bisa kurang dari yang diharapkan

3. Jumlah perulangan jika input 19 mahasiswa:

Perulangan WHILE akan berjalan 19 kali (dari i=0 sampai i=18)
Karena kondisi while (i < jml) akan true selama i < 19