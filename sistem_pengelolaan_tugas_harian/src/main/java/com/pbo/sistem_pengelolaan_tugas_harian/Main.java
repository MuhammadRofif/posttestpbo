package com.pbo.sistem_pengelolaan_tugas_harian;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Pembantu;

public class Main {
    private static ArrayList<Tugas> daftarTugas = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        Pembantu pembantu = new Pembantu("Sistem Pengelolaan Tugas Harian", "v1.0", "Rofif 2309116029");

        do {
            pembantu.cetakJudul();
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Tugas");
            System.out.println("3. Update Tugas");
            System.out.println("4. Hapus Tugas");
            System.out.println("5. Keluar");
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
                    updateTugas(scanner);
                    break;
                case 4:
                    hapusTugas(scanner);
                    break;
                case 5:
                    Pembantu.tampilkanPesanKeluar();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
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

    private static void updateTugas(Scanner scanner) {
        lihatTugas();
        if (!daftarTugas.isEmpty()) {
            System.out.print("Masukkan ID tugas yang akan di-update: ");
            int id = scanner.nextInt();
            
            Tugas tugasUntukDiupdate = null;
            for (Tugas tugas : daftarTugas) {
                if (tugas.getId() == id) {
                    tugasUntukDiupdate = tugas;
                    break;
                }
            }

            if (tugasUntukDiupdate != null) {
                System.out.print("Masukkan nama baru tugas: ");
                String namaBaru = scanner.next();
                System.out.print("Masukkan deskripsi baru tugas: ");
                String deskripsiBaru = scanner.next();
                System.out.print("Masukkan prioritas baru tugas (1-5): ");
                int prioritasBaru = scanner.nextInt();

                tugasUntukDiupdate.setNama(namaBaru);
                tugasUntukDiupdate.setDeskripsi(deskripsiBaru);
                tugasUntukDiupdate.setPrioritas(prioritasBaru);

                System.out.println("Tugas dengan ID " + id + " berhasil di-update.");
            } else {
                System.out.println("ID tugas tidak valid.");
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
