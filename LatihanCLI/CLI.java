package LatihanCLI;

import java.util.Scanner;

public class CLI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CharacterRepository repository = new MemoryCharacterRepository();

        Page currentPage = new MainMenuPage(repository);

        while (currentPage != null) {
            currentPage.display();
            currentPage = currentPage.navigate(scanner);
        }

        scanner.close();
    }
}