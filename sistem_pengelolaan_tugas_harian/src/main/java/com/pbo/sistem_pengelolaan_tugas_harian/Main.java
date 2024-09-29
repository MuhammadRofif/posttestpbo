package com.pbo.sistem_pengelolaan_tugas_harian;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Pembantu;

public class Main {
    private static ArrayList<Tugas> daftarTugas = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        Pembantu pembantu = new Pembantu("Sistem Pengelolaan Tugas Harian", "v1.0", "Tim Pengembang");

        do {
            pembantu.cetakJudul();
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahTugas(scanner);
                    break;
                case 2:
                    lihatTugas();
                    break;
                case 3:
                    hapusTugas(scanner);
                    break;
                case 4:
                    Pembantu.tampilkanPesanKeluar();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    private static void tambahTugas(Scanner scanner) {
        System.out.print("Masukkan nama tugas: ");
        String nama = scanner.next();
        System.out.print("Masukkan deskripsi tugas: ");
        String deskripsi = scanner.next();
        System.out.print("Masukkan prioritas tugas (1-5): ");
        int prioritas = scanner.nextInt();

        Tugas tugasBaru = new Tugas(nama, deskripsi, prioritas);
        daftarTugas.add(tugasBaru);

        System.out.println("Tugas berhasil ditambahkan!");
    }

    private static void lihatTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            System.out.println("\n=== Daftar Tugas ===");
            for (Tugas tugas : daftarTugas) {
                System.out.println(tugas.getInfo());
            }
        }
    }

    private static void hapusTugas(Scanner scanner) {
        lihatTugas();
        if (!daftarTugas.isEmpty()) {
            System.out.print("Masukkan ID tugas yang akan dihapus: ");
            int id = scanner.nextInt();
            
            Tugas tugasUntukDihapus = null;
            for (Tugas tugas : daftarTugas) {
                if (tugas.getId() == id) {
                    tugasUntukDihapus = tugas;
                    break;
                }
            }

            if (tugasUntukDihapus != null) {
                daftarTugas.remove(tugasUntukDihapus);
                System.out.println("Tugas dengan ID " + id + " berhasil dihapus.");
            } else {
                System.out.println("ID tugas tidak valid.");
            }
        }
    }
}
