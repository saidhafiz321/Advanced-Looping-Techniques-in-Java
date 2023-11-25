# Advanced-Looping-Techniques-in-Java

if-else, while, dan for adalah struktur kontrol dalam pemrograman yang digunakan untuk mengendalikan alur eksekusi program. Masing-masing memiliki kegunaan dan kondisi penggunaan yang berbeda.

# 1. if-else:
   
Kapan Digunakan:
Digunakan untuk pengujian kondisi tunggal.
Jika kondisi terpenuhi (true), maka blok pernyataan dalam if akan dieksekusi. Jika tidak, blok pernyataan dalam else (opsional) akan dieksekusi.
Contoh Penggunaan:
 ```
int x = 10;

if (x > 0) {
    System.out.println("x adalah bilangan positif");
} else {
    System.out.println("x adalah bilangan non-positif");
}
```
# 2. while:
   
Kapan Digunakan:
Digunakan ketika Anda ingin mengeksekusi blok pernyataan selama kondisi tertentu terpenuhi.
Loop akan terus berlanjut selama kondisi dalam while adalah true.
Contoh Penggunaan:
```
int i = 0;
while (i < 5) {
    System.out.println("Nilai i: " + i);
    i++;
}
```
# 3. for:
   
Kapan Digunakan:
Digunakan untuk pengulangan ketika jumlah iterasi sudah diketahui atau dapat dihitung.
Struktur for memiliki inisialisasi, kondisi pengulangan, dan ekspresi iterasi dalam satu baris.

Contoh Penggunaan:
```
for (int j = 0; j < 5; j++) {
    System.out.println("Nilai j: " + j);
}
```
Pertimbangan Pemilihan:

Gunakan if-else untuk pengujian kondisi tunggal.
Gunakan while untuk pengulangan dengan kondisi yang mungkin berubah selama eksekusi.
Gunakan for ketika jumlah iterasi sudah diketahui.

# Contoh Kombinasi:

Kombinasi dari ketiganya dapat digunakan untuk membuat struktur kontrol yang lebih kompleks, seperti nested loops dan percabangan bersarang.
