package LatihanCLI;

import java.util.Scanner;

public class FindCharacterPage extends Page {

    public FindCharacterPage(CharacterRepository repository) {
        super(repository);
    }

    @Override
    public void display() {
        System.out.println("\n=========================================");
        System.out.println("              CARI KARAKTER              ");
        System.out.println("=========================================");
    }

    @Override
    public Page navigate(Scanner scanner) {
        System.out.print("Masukkan ID Karakter yang ingin dicari: ");
        String id = scanner.nextLine();

        Character character = repository.findCharacterById(id);

        if (character != null) {
            System.out.println("\nData Karakter yang dicari:");
            System.out.println("Nama    : " + character.getName());
            System.out.println("ID      : " + character.getId());
            System.out.println("Elemen  : " + character.getElement());
        } else {
            System.out.println("Karakter dengan ID tersebut tidak ditemukan!");
        }

        System.out.println("\nTekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();

        return new MainMenuPage(repository);
    }
}