package ss26_thuat_toan.excercise2;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {
    private static ArrayList<Character> myTransfer(String s) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result;
    }

    public static int string(String string, String string2) {
        List<Character> newString = myTransfer(string);
        List<Character> newString2 = myTransfer(string2);
        List<Character> newString3 = new ArrayList<>();


        for (int i = 0; i < newString.size(); i++) {
            for (int j = 0; j < newString2.size(); j++) {
                if (newString.get(i) == newString2.get(j)) {
                    newString3.add(newString.get(i));
                    newString2.remove(newString2.get(j));
                    break;
                }
            }
        }

        int result = newString3.size();
        return result;
    }
}


