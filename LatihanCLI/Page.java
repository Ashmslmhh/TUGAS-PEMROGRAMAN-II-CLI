package LatihanCLI;

import java.util.Scanner;

public abstract class Page {

    protected CharacterRepository repository;

    public Page(CharacterRepository repository) {
        this.repository = repository;
    }

    public abstract void display();
    public abstract Page navigate(Scanner scanner);
}
