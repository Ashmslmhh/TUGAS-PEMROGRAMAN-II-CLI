package LatihanCLI;

import java.util.List;
import java.util.Scanner;

public class ViewCharacterPage extends Page {

    public ViewCharacterPage(CharacterRepository repository) {
        super(repository);
    }

    @Override
    public void display() {
        System.out.println("\n=========================================");
        System.out.println("       DAFTAR KARAKTER TERDAFTAR       ");
        System.out.println("=========================================");
        List<Character> characterList = repository.getAllCharacters();

        if (characterList.isEmpty()) {
            System.out.println("Belum ada karakter yang terdaftar!");
        } else {
            int i = 1;
            for (Character character : characterList) {
                System.out.println(i + ". ID: " + character.getId() + ", Nama: " + character.getName() + ", Elemen: " + character.getElement());
                i++;
            }
        }
        System.out.println("=========================================");
    }

    @Override
    public Page navigate(Scanner scanner) {
        System.out.println("Tekan Enter untuk kembali ke menu utama...");
        scanner.nextLine();

        return new MainMenuPage(repository);
    }
}