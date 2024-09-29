# Sistem Pengelolaan Tugas Harian

Program ini adalah program sederhana berbasis Java yang digunakan untuk mengelola tugas harian. Dengan program ini, pengguna dapat menambahkan tugas, melihat daftar tugas yang telah dibuat, serta menghapus tugas berdasarkan ID.

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

## Cara Penggunaan

   **Tampilan Menu Utama**
   
   ![image](https://github.com/user-attachments/assets/8efbd7cf-7907-4f48-8f43-ef15e45341b2) 
   
1. **Menambah Tugas**
   Pilih opsi **1. Tambah Tugas** untuk menambahkan tugas baru. Pengguna akan diminta memasukkan nama tugas, deskripsi, dan prioritas tugas (1-5).

   - Prioritas 1: Paling tidak mendesak.
   - Prioritas 2: Lebih penting, tapi masih bisa ditunda.
   - Prioritas 3: Kepentingan menengah, perlu dikerjakan dalam waktu dekat.
   - Prioritas 4: Cukup mendesak, sebaiknya segera diselesaikan.
   - Prioritas 5: Paling mendesak, harus diutamakan.
     
   ![image](https://github.com/user-attachments/assets/9c044d33-9d11-402c-a174-dd4706c6959f)
   
2. **Melihat Tugas**:
   
   Pilih opsi **2. Lihat Tugas** untuk melihat daftar tugas yang telah ditambahkan. Setiap tugas akan ditampilkan dengan informasi ID, nama, deskripsi, dan prioritas.

   ![image](https://github.com/user-attachments/assets/a310e89d-0bbf-4a95-863a-0d922cf3d3b4)
   
3. **Menghapus Tugas**:
   
   Pilih opsi **3. Hapus Tugas** untuk menghapus tugas berdasarkan ID. Daftar tugas akan ditampilkan terlebih dahulu, lalu Pengguna akan diminta memasukkan ID tugas yang ingin dihapus.

   ![image](https://github.com/user-attachments/assets/61238c8b-0bf4-49f8-9ee2-199ad96ed1d7)
   
4. **Keluar dari Program**:
   
   Pilih opsi **4. Keluar** untuk menutup program. Program akan menampilkan pesan "Terima kasih telah menggunakan sistem".

   ![image](https://github.com/user-attachments/assets/87ed1d98-6b1b-4132-9cc0-fab24f7ec358)


## Class dan Fungsionalitas

### A. `Main.java`

Class utama untuk menjalankan program. Fungsinya adalah mengelola interaksi pengguna melalui menu untuk menambah, melihat, dan menghapus tugas. Berikut adalah fitur yang ada di dalam class ini:

- Menggunakan **percabangan** (`switch-case`) untuk navigasi menu.

  ![image](https://github.com/user-attachments/assets/6b5741d9-2358-4ec5-8b0e-29acc15d7d3f)

- Menggunakan **ArrayList**, yand diKombinasikan dengan Perulangan (for-each)
  
  ![image](https://github.com/user-attachments/assets/70a3f551-a0ed-4bde-80e2-50daada48c1b)

- Mengelola input pengguna melalui `scanner`.

  ![image](https://github.com/user-attachments/assets/045bed0a-876e-4a0d-ab20-da835bd2229d)


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

## Pengembang

Program ini dikembangkan oleh:
- **Muhammad Rofiif Taqiyyuddin Nabiil Sistem Informasi A 2023(2309116029)**


