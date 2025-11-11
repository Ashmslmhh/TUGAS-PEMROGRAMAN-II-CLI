package LatihanCLI;

import java.util.Scanner;

public class MainMenuPage extends Page {

    public MainMenuPage(CharacterRepository repository) {
        super(repository);
    }

    @Override
    public void display() {
        System.out.println("=========================================");
        System.out.println("           REGISTRASI AKADEMIYA          ");
        System.out.println("=========================================");
        System.out.println("Menu:");
        System.out.println("1. Tambah Daftar Karakter");
        System.out.println("2. Lihat Semua Karakter Terdaftar");
        System.out.println("3. Hapus Karakter");
        System.out.println("4. Cari Karakter");
        System.out.println("0. Keluar");
        System.out.println("=========================================");
        System.out.print("Pilihan: ");
    }

    @Override
    public Page navigate(Scanner scanner) {
        int choice = -1;

        try {
            choice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
            scanner.nextLine();
            return this;
        }
        scanner.nextLine();

        switch (choice) {
            case 1:
                return new AddCharacterPage(repository);
            case 2:
                return new ViewCharacterPage(repository);
            case 3:
                return new DeleteCharacterPage(repository);
            case 4:
                return new FindCharacterPage(repository);
            case 0:
                System.out.println("\n=========================================");
                System.out.println("        Sampai jumpa, Traveler...        ");
                System.out.println("=========================================");
                return null;
            default:
                System.out.println("Pilihan tidak valid, silahkan coba lagi!");
                return this;
        }
    }
}