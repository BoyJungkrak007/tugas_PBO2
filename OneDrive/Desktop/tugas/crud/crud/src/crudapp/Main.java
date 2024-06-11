package crudapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JenisTempatIbadahManager jenisManager = new JenisTempatIbadahManager();
        PetaManager petaManager = new PetaManager();
        TempatIbadahManager tempatManager = new TempatIbadahManager();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            try {
                System.out.print("Pilih Menu: ");
                int choice = Integer.parseInt(reader.readLine());

                switch (choice) {
                    case 1:
                        manageJenisTempatIbadah(reader, jenisManager);
                        break;
                    case 2:
                        managePeta(reader, petaManager);
                        break;
                    case 3:
                        manageTempatIbadah(reader, tempatManager);
                        break;
                    case 4:
                        isRunning = false;
                        System.out.println("Keluar dari program...");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n===== Menu Utama =====");
        System.out.println("[1] Kelola Jenis Tempat Ibadah");
        System.out.println("[2] Kelola Peta");
        System.out.println("[3] Kelola Tempat Ibadah");
        System.out.println("[4] Keluar");
        System.out.println("======================");
    }

    private static void manageJenisTempatIbadah(BufferedReader reader, JenisTempatIbadahManager manager) throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Kelola Jenis Tempat Ibadah ===");
            System.out.println("[1] Tambah Jenis Tempat Ibadah");
            System.out.println("[2] Lihat Semua Jenis Tempat Ibadah");
            System.out.println("[3] Update Jenis Tempat Ibadah");
            System.out.println("[4] Hapus Jenis Tempat Ibadah");
            System.out.println("[5] Kembali ke Menu Utama");
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Jenis Tempat Ibadah: ");
                    String namaJenis = reader.readLine();
                    manager.createJenisTempatIbadah(namaJenis);
                    break;
                case 2:
                    List<JenisTempatIbadah> jenisList = manager.readJenisTempatIbadah();
                    for (JenisTempatIbadah jenis : jenisList) {
                        System.out.println(jenis);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Kode Jenis yang akan diupdate: ");
                    int kodeJenisUpdate = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Nama Jenis Baru: ");
                    String namaJenisUpdate = reader.readLine();
                    manager.updateJenisTempatIbadah(kodeJenisUpdate, namaJenisUpdate);
                    break;
                case 4:
                    System.out.print("Masukkan Kode Jenis yang akan dihapus: ");
                    int kodeJenisDelete = Integer.parseInt(reader.readLine());
                    manager.deleteJenisTempatIbadah(kodeJenisDelete);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private static void managePeta(BufferedReader reader, PetaManager manager) throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Kelola Peta ===");
            System.out.println("[1] Tambah Peta");
            System.out.println("[2] Lihat Semua Peta");
            System.out.println("[3] Update Peta");
            System.out.println("[4] Hapus Peta");
            System.out.println("[5] Kembali ke Menu Utama");
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Longitude: ");
                    double longitude = Double.parseDouble(reader.readLine());
                    System.out.print("Masukkan Latitude: ");
                    double latitude = Double.parseDouble(reader.readLine());
                    manager.createPeta(longitude, latitude);
                    break;
                case 2:
                    List<Peta> petaList = manager.readPeta();
                    for (Peta peta : petaList) {
                        System.out.println(peta);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Kode Peta yang akan diupdate: ");
                    int kodePetaUpdate = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Longitude Baru: ");
                    double longitudeUpdate = Double.parseDouble(reader.readLine());
                    System.out.print("Masukkan Latitude Baru: ");
                    double latitudeUpdate = Double.parseDouble(reader.readLine());
                    manager.updatePeta(kodePetaUpdate, longitudeUpdate, latitudeUpdate);
                    break;
                case 4:
                    System.out.print("Masukkan Kode Peta yang akan dihapus: ");
                    int kodePetaDelete = Integer.parseInt(reader.readLine());
                    manager.deletePeta(kodePetaDelete);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private static void manageTempatIbadah(BufferedReader reader, TempatIbadahManager manager) throws IOException {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== Kelola Tempat Ibadah ===");
            System.out.println("[1] Tambah Tempat Ibadah");
            System.out.println("[2] Lihat Semua Tempat Ibadah");
            System.out.println("[3] Update Tempat Ibadah");
            System.out.println("[4] Hapus Tempat Ibadah");
            System.out.println("[5] Kembali ke Menu Utama");
            System.out.print("Pilih Menu: ");
            int choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Tempat Ibadah: ");
                    String namaTempatIbadah = reader.readLine();
                    System.out.print("Masukkan Kode Jenis: ");
                    int kodeJenis = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Gambar: ");
                    String gambar = reader.readLine();
                    System.out.print("Masukkan Kode Agama: ");
                    int kodeAgama = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Longitude: ");
                    double longitude = Double.parseDouble(reader.readLine());
                    System.out.print("Masukkan Latitude: ");
                    double latitude = Double.parseDouble(reader.readLine());
                    manager.createTempatIbadah(namaTempatIbadah, kodeJenis, gambar, kodeAgama, longitude, latitude);
                    break;
                case 2:
                    List<TempatIbadah> tempatList = manager.readTempatIbadah();
                    for (TempatIbadah tempat : tempatList) {
                        System.out.println(tempat);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan ID Tempat Ibadah yang akan diupdate: ");
                    int idTempatIbadahUpdate = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Nama Tempat Ibadah Baru: ");
                    String namaTempatIbadahUpdate = reader.readLine();
                    System.out.print("Masukkan Kode Jenis Baru: ");
                    int kodeJenisUpdate = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Gambar Baru: ");
                    String gambarUpdate = reader.readLine();
                    System.out.print("Masukkan Kode Agama Baru: ");
                    int kodeAgamaUpdate = Integer.parseInt(reader.readLine());
                    System.out.print("Masukkan Longitude Baru: ");
                    double longitudeUpdate = Double.parseDouble(reader.readLine());
                    System.out.print("Masukkan Latitude Baru: ");
                    double latitudeUpdate = Double.parseDouble(reader.readLine());
                    manager.updateTempatIbadah(idTempatIbadahUpdate, namaTempatIbadahUpdate, kodeJenisUpdate, gambarUpdate, kodeAgamaUpdate, longitudeUpdate, latitudeUpdate);
                    break;
                case 4:
                    System.out.print("Masukkan ID Tempat Ibadah yang akan dihapus: ");
                    int idTempatIbadahDelete = Integer.parseInt(reader.readLine());
                    manager.deleteTempatIbadah(idTempatIbadahDelete);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
}
