package ss26_thuat_toan.excercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Excercise6 {
    public static String findChar(String string) {
        List<Character> newCharacter = new ArrayList<>();
        List<Character> newString = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            newString.add(string.charAt(i));
        }
        for (int i = 0; i < newString.size() - 1; i++) {
            for (int j = i + 1; j < newString.size(); j++) {
                if (newString.get(i) == newString.get(j)) {
                    newCharacter.add(newString.get(i));
                    newString.remove(newString.get(i));
                    i--;
                    break;
                }
            }
        }
        Collections.sort(newCharacter);
        return newCharacter.toString();
    }
}
