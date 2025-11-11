package LatihanCLI;

import java.util.Scanner;

public class AddCharacterPage extends Page {

    public AddCharacterPage(CharacterRepository repository) {
        super(repository);
    }

    @Override
    public void display() {
        System.out.println("\n=========================================");
        System.out.println("         DAFTAR KARAKTER BARU          ");
        System.out.println("=========================================");
    }

    @Override
    public Page navigate(Scanner scanner) {
        System.out.print("Buat ID Karakter: ");
        String id = scanner.nextLine();

        System.out.print("Masukkan Nama Karakter: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Elemen Karakter: ");
        String element = scanner.nextLine();

        repository.addCharacter(new Character(id, name, element));

        System.out.println("\nTekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();

        return new MainMenuPage(repository);
    }
}