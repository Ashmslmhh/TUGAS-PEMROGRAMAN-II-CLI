package LatihanCLI;
import java.util.ArrayList;
import java.util.List;

public class MemoryCharacterRepository implements CharacterRepository {

    private ArrayList<Character> characterList;

    public MemoryCharacterRepository() {
        this.characterList = new ArrayList<>();
    }

    @Override
    public void addCharacter(Character character) {
        this.characterList.add(character);
        System.out.println("Karakter " + character.getName() + " berhasil terdaftar.");
    }

    @Override
    public List<Character> getAllCharacters() {
        return this.characterList;
    }

    @Override
    public boolean deleteCharacterById(String id) {
        for (int i = 0; i < characterList.size(); i++) {
            if (characterList.get(i).getId().equals(id)) {
                characterList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Character findCharacterById(String id) {
        for (Character character : characterList) {
            if (character.getId().equals(id)) {
                return character;
            }
        }
        return null;
    }
}