package ss26_thuat_toan.excercise2;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {

    public static List<Integer> string(String string, String string2) {
        List<Integer> countList= new ArrayList<>();
        List<String> character =new ArrayList<>();
        string.split(",");
        string2.split(",");
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string.charAt(i) == string2.charAt(j)
                        || string.toLowerCase().charAt(i) == string2.toLowerCase().charAt(j)
                        || string.toUpperCase().charAt(i) == string2.toUpperCase().charAt(j)) {
                    character.add(string.valueOf(i));
                    string2.replace(string.charAt(j),string.charAt(j+1));
                    count++;
                }
            }
            countList.add(count);
        }
        return countList;
    }
}
