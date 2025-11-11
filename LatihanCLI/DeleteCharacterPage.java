package LatihanCLI;

import java.util.Scanner;

public class DeleteCharacterPage extends Page {

    public DeleteCharacterPage(CharacterRepository repository) {
        super(repository);
    }

    @Override
    public void display() {
        System.out.println("\n=========================================");
        System.out.println("           HAPUS KARAKTER (D.O)        ");
        System.out.println("=========================================");
    }

    @Override
    public Page navigate(Scanner scanner) {
        System.out.print("Masukkan ID Karakter yang akan dihapus: ");
        String id = scanner.nextLine();

        boolean isDeleted = repository.deleteCharacterById(id);

        if (isDeleted) {
            System.out.println("Karakter dengan ID " + id + " berhasil dihapus dari daftar.");
        } else {
            System.out.println("Karakter dengan ID tersebut tidak ditemukan!");
        }

        System.out.println("\nTekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();

        return new MainMenuPage(repository);
    }
}