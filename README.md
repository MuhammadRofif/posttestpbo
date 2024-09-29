Berikut adalah tulisan lengkap **README.md** untuk program "Sistem Pengelolaan Tugas Harian":

---

# Sistem Pengelolaan Tugas Harian

Program ini adalah aplikasi sederhana berbasis Java yang digunakan untuk mengelola tugas harian. Dengan aplikasi ini, pengguna dapat menambahkan tugas, melihat daftar tugas yang telah dibuat, serta menghapus tugas berdasarkan ID. Program ini dikembangkan sebagai tugas pemrograman berorientasi objek (PBO).

## Fitur

- **Tambah Tugas**: Pengguna dapat menambahkan tugas baru dengan informasi seperti nama, deskripsi, dan prioritas tugas.
- **Lihat Tugas**: Menampilkan semua tugas yang telah ditambahkan, dengan informasi ID, nama, deskripsi, dan prioritas.
- **Hapus Tugas**: Menghapus tugas berdasarkan ID yang dimasukkan oleh pengguna.
- **Pesan Keluar**: Menampilkan pesan keluar saat program dihentikan.

## Struktur Program

Program ini terdiri dari tiga class yang diletakkan di dua package berbeda:

```
src/
 └── com/
     └── pbo/
         └── sistem_pengelolaan_tugas_harian/
             └── Main.java
             └── Tugas.java
 └── utils/
     └── Pembantu.java
```

- **com.pbo.sistem_pengelolaan_tugas_harian**: Berisi class `Main` dan `Tugas` sebagai komponen utama sistem.
- **utils**: Berisi class `Pembantu` untuk mencetak informasi sistem dan menampilkan pesan keluar.

## Instalasi dan Cara Penggunaan

1. **Kompilasi seluruh file Java**:
   Buka terminal, navigasi ke folder project, kemudian jalankan perintah berikut untuk kompilasi:
   ```bash
   javac com/pbo/sistem_pengelolaan_tugas_harian/*.java utils/*.java
   ```

2. **Jalankan program**:
   Setelah kompilasi berhasil, jalankan program dengan perintah berikut:
   ```bash
   java com.pbo.sistem_pengelolaan_tugas_harian.Main
   ```

3. **Interaksi melalui Menu**:
   Setelah program berjalan, Anda akan melihat menu seperti ini:
   ```
   === Sistem Pengelolaan Tugas Harian (Versi: v1.0) ===
   Dikembangkan oleh: Rofif 2309116029
   1. Tambah Tugas
   2. Lihat Tugas
   3. Hapus Tugas
   4. Keluar
   Pilih:
   ```
   Pilih opsi berdasarkan angka 1 hingga 4 untuk menggunakan fitur yang tersedia.

4. **Menambah Tugas**:
   Pilih opsi **1. Tambah Tugas** untuk menambahkan tugas baru. Anda akan diminta memasukkan nama tugas, deskripsi, dan prioritas tugas (1-5).

5. **Melihat Tugas**:
   Pilih opsi **2. Lihat Tugas** untuk melihat daftar tugas yang telah ditambahkan. Setiap tugas akan ditampilkan dengan informasi ID, nama, deskripsi, dan prioritas.

6. **Menghapus Tugas**:
   Pilih opsi **3. Hapus Tugas** untuk menghapus tugas berdasarkan ID. Daftar tugas akan ditampilkan terlebih dahulu, lalu Anda akan diminta memasukkan ID tugas yang ingin dihapus.

7. **Keluar dari Program**:
   Pilih opsi **4. Keluar** untuk menutup program. Program akan menampilkan pesan terima kasih.

## Contoh Output Program

Berikut adalah contoh output program saat berjalan:

### 1. Menu Utama

```
=== Sistem Pengelolaan Tugas Harian (Versi: v1.0) ===
Dikembangkan oleh: Rofif 2309116029
1. Tambah Tugas
2. Lihat Tugas
3. Hapus Tugas
4. Keluar
Pilih:
```

### 2. Menambah Tugas

```
Masukkan nama tugas: BelajarPBO
Masukkan deskripsi tugas: MembacaBuku
Masukkan prioritas tugas (1-5): 3
Tugas berhasil ditambahkan!
```

### 3. Menampilkan Daftar Tugas

```
=== Daftar Tugas ===
ID: 1, Nama: BelajarPBO, Deskripsi: MembacaBuku, Prioritas: 3
```

### 4. Menghapus Tugas

```
Masukkan ID tugas yang akan dihapus: 1
Tugas dengan ID 1 berhasil dihapus.
```

### 5. Pesan Keluar

```
Terima kasih telah menggunakan sistem.
```

## Class dan Fungsionalitas

### A. `Main.java`

Class utama untuk menjalankan program. Fungsinya adalah mengelola interaksi pengguna melalui menu untuk menambah, melihat, dan menghapus tugas. Berikut adalah fitur yang ada di dalam class ini:

- Menggunakan **percabangan** (`switch-case`) untuk navigasi menu.
- Menggunakan **ArrayList** untuk menyimpan daftar tugas yang dinamis.
- Menggunakan **for-each loop** untuk menampilkan daftar tugas.
- Mengelola input pengguna melalui class `Scanner`.

### B. `Tugas.java`

Class yang mendefinisikan objek `Tugas`. Properti dari class ini meliputi:

- `id`: Sebagai identifier unik setiap tugas.
- `nama`: Nama tugas.
- `deskripsi`: Deskripsi tugas.
- `prioritas`: Prioritas tugas dalam rentang 1-5.

Class ini menggunakan **constructor** untuk menginisialisasi objek baru dan memiliki metode `getInfo()` yang mengembalikan informasi tugas dalam format string.

### C. `Pembantu.java`

Class `Pembantu` berfungsi sebagai utilitas yang menyediakan fitur mencetak judul sistem dan menampilkan pesan keluar saat program berhenti. Fitur ini termasuk:

- **Constructor** untuk menginisialisasi informasi sistem seperti judul, versi, dan pengembang.
- Metode `cetakJudul()` untuk menampilkan judul sistem.
- Metode statis `tampilkanPesanKeluar()` untuk menampilkan pesan keluar.

## Dependencies

Program ini tidak memiliki dependensi eksternal dan dapat dijalankan di lingkungan Java standar (JDK).

## Screenshot

1. **Tampilan Menu Utama**  
   ![Menu Utama](screenshots/menu-utama.png)

2. **Menambah Tugas**  
   ![Tambah Tugas](screenshots/tambah-tugas.png)

3. **Daftar Tugas**  
   ![Daftar Tugas](screenshots/daftar-tugas.png)

4. **Menghapus Tugas**  
   ![Hapus Tugas](screenshots/hapus-tugas.png)

> **Catatan:** Letakkan gambar hasil screenshot di folder `screenshots/` dengan nama yang sesuai.

## Pengembang

Program ini dikembangkan oleh:
- **Rofif (2309116029)**

## Lisensi

Program ini merupakan bagian dari tugas mata kuliah Pemrograman Berorientasi Objek (PBO) dan bersifat open-source.
```

--- 

### Penjelasan README.md:
1. **Pendahuluan**: Menjelaskan secara singkat tentang program dan fungsionalitasnya.
2. **Fitur**: Merinci fitur utama dari program.
3. **Struktur Program**: Memberikan gambaran struktur folder dan file dalam program.
4. **Instruksi Penggunaan**: Langkah-langkah lengkap mulai dari kompilasi hingga menjalankan program, serta interaksi dengan program.
5. **Contoh Output**: Menampilkan hasil eksekusi dari setiap fitur program.
6. **Class dan Fungsionalitas**: Penjelasan mendetail tentang class-class yang ada di program, lengkap dengan fitur percabangan, array/ArrayList, constructor, dan method.
7. **Dependencies**: Menyebutkan bahwa program ini tidak memiliki dependensi eksternal.
8. **Screenshot**: Placeholder untuk screenshot yang harus diletakkan di folder `screenshots`.
9. **Pengembang**: Informasi tentang pengembang program.
10. **Lisensi**: Menyatakan bahwa program ini adalah bagian dari tugas kuliah dan bersifat open-source.

Dengan menggunakan format ini, README.md menjadi dokumentasi yang informatif dan mudah dipahami oleh pengguna program.
