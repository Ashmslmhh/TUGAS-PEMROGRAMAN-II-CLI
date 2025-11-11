package LatihanCLI;
import java.util.List;

public interface CharacterRepository {

    void addCharacter(Character character);
    List<Character> getAllCharacters();
    boolean deleteCharacterById(String id);
    Character findCharacterById(String id);
}