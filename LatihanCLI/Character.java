package LatihanCLI;

public class Character {
    private String id;
    private String name;
    private String element;

    public Character(String id, String name, String element) {
        this.id = id;
        this.name = name;
        this.element = element;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getElement() {
        return element;
    }
}
